package com.fabio.soapws.validaformati.config;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.fabio.soapws.validaformati.data.ErrorCfResponse;
import com.fabio.soapws.validaformati.data.GetValidaFormatoCfRequest;
import com.fabio.soapws.validaformati.data.GetValidaFormatoCfResponse;

import com.fabio.soapws.validaformati.patterns.UtilPatterns;

@Endpoint
public class EndpointValidaCF {
	
	private static final Logger logger=LoggerFactory.getLogger(EndpointValidaCF.class);
	
	private static final String NAME_SPACE_URI="http://spring.io/guides/gs-producing-web-service";
	public EndpointValidaCF() {}
	
	@PayloadRoot(localPart ="getValidaFormatoCfRequest",namespace = NAME_SPACE_URI)
	@ResponsePayload
	public GetValidaFormatoCfResponse validaFormatoCF(@RequestPayload GetValidaFormatoCfRequest request){
		ErrorCfResponse error=null;
		GetValidaFormatoCfResponse response=new GetValidaFormatoCfResponse();
		try {
			if(request!=null && StringUtils.isNotBlank(request.getValore())) {
				response.setCodiceFiscaleVerificato(request.getValore());
				boolean isValidate=UtilPatterns.validateCf(request.getValore());
				response.setValido(isValidate);
			}else {
				error=new ErrorCfResponse();
				error.setMessaggioCustom("La request non è valorizzata");
			}
		}catch(Exception e) {
			logger.error(e.getMessage(),e);
			error=new ErrorCfResponse();
			error.setMessaggioCustom("Errore");
			error.setMessaggioTecnico(e.getMessage());
		}finally {
			if(error!=null) {
				response.setError(error);
			}
		}
		return response;
	}
}
