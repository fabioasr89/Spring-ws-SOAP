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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ErrorCfResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ErrorCfResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messaggioTecnico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messaggioCustom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorCfResponse", propOrder = {
    "messaggioTecnico",
    "messaggioCustom"
})
public class ErrorCfResponse {

    @XmlElement(required = true)
    protected String messaggioTecnico;
    @XmlElement(required = true)
    protected String messaggioCustom;

    /**
     * Recupera il valore della proprietà messaggioTecnico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessaggioTecnico() {
        return messaggioTecnico;
    }

    /**
     * Imposta il valore della proprietà messaggioTecnico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessaggioTecnico(String value) {
        this.messaggioTecnico = value;
    }

    /**
     * Recupera il valore della proprietà messaggioCustom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessaggioCustom() {
        return messaggioCustom;
    }

    /**
     * Imposta il valore della proprietà messaggioCustom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessaggioCustom(String value) {
        this.messaggioCustom = value;
    }

}
