package com.fabio.soapws.validaformati.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class ConfigValidateCF extends WsConfigurerAdapter{
	
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet messageDisp=new MessageDispatcherServlet();
		messageDisp.setTransformWsdlLocations(true);
		messageDisp.setApplicationContext(applicationContext);
		return new ServletRegistrationBean<MessageDispatcherServlet>(messageDisp,"/services/cf/*");
	}
	
	@Bean(name="verificaCfWsdl")
	public DefaultWsdl11Definition verificaCfwsdlDefinition(XsdSchema xsdSchema) {
		DefaultWsdl11Definition definitionWSDCF=new DefaultWsdl11Definition();
		definitionWSDCF.setLocationUri("/services/cf/validate");
		definitionWSDCF.setPortTypeName("CfValidatePortName");
		definitionWSDCF.setSchema(xsdSchema);
		return definitionWSDCF;
	}
	
	@Bean
	public XsdSchema schemaXsdCf() {
		return new SimpleXsdSchema(new ClassPathResource("valida-formati.xsd"));
	}
}
