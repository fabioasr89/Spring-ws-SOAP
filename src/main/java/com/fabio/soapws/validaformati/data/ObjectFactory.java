//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.12.01 alle 10:44:33 PM CET 
//


package com.fabio.soapws.validaformati.data;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fabio.soapws.validaformati.data package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fabio.soapws.validaformati.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetValidaFormatoCfRequest }
     * 
     */
    public GetValidaFormatoCfRequest createGetValidaFormatoCfRequest() {
        return new GetValidaFormatoCfRequest();
    }

    /**
     * Create an instance of {@link GetValidaFormatoCfResponse }
     * 
     */
    public GetValidaFormatoCfResponse createGetValidaFormatoCfResponse() {
        return new GetValidaFormatoCfResponse();
    }

    /**
     * Create an instance of {@link ErrorCfResponse }
     * 
     */
    public ErrorCfResponse createErrorCfResponse() {
        return new ErrorCfResponse();
    }

}
