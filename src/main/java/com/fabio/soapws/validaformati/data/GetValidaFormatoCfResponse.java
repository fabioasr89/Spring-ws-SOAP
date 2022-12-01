//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.12.01 alle 10:44:33 PM CET 
//


package com.fabio.soapws.validaformati.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valido" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="codiceFiscaleVerificato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="error" type="{http://spring.io/guides/gs-producing-web-service}ErrorCfResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "valido",
    "codiceFiscaleVerificato",
    "error"
})
@XmlRootElement(name = "getValidaFormatoCfResponse")
public class GetValidaFormatoCfResponse {

    protected boolean valido;
    @XmlElement(required = true)
    protected String codiceFiscaleVerificato;
    @XmlElement(required = true)
    protected ErrorCfResponse error;

    /**
     * Recupera il valore della proprietà valido.
     * 
     */
    public boolean isValido() {
        return valido;
    }

    /**
     * Imposta il valore della proprietà valido.
     * 
     */
    public void setValido(boolean value) {
        this.valido = value;
    }

    /**
     * Recupera il valore della proprietà codiceFiscaleVerificato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscaleVerificato() {
        return codiceFiscaleVerificato;
    }

    /**
     * Imposta il valore della proprietà codiceFiscaleVerificato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscaleVerificato(String value) {
        this.codiceFiscaleVerificato = value;
    }

    /**
     * Recupera il valore della proprietà error.
     * 
     * @return
     *     possible object is
     *     {@link ErrorCfResponse }
     *     
     */
    public ErrorCfResponse getError() {
        return error;
    }

    /**
     * Imposta il valore della proprietà error.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorCfResponse }
     *     
     */
    public void setError(ErrorCfResponse value) {
        this.error = value;
    }

}
