package com.rt.bankruptcy.repository.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtorRegisterItem", propOrder = {
    "lastMessageDate",
    "lastReportDate",
    "legalCaseList"
})
@XmlSeeAlso({
    DebtorPerson.class,
    DebtorCompany.class
})
public abstract class DebtorRegisterItem {
    @XmlElement(name = "LastMessageDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastMessageDate;
    @XmlElement(name = "LastReportDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReportDate;
    @XmlElement(name = "LegalCaseList")
    protected ArrayOfLegalCaseInfo legalCaseList;
    @XmlAttribute(name = "Category")
    protected String category;
    @XmlAttribute(name = "CategoryCode")
    protected String categoryCode;
    @XmlAttribute(name = "Region")
    protected String region;
    @XmlAttribute(name = "DateLastModif", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastModif;
    @XmlAttribute(name = "INN")
    protected String inn;
    @XmlAttribute(name = "BankruptId", required = true)
    protected int bankruptId;
    @XmlAttribute(name = "Guid")
    protected String guid;

    /**
     * Gets the value of the lastMessageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastMessageDate() {
        return lastMessageDate;
    }

    /**
     * Sets the value of the lastMessageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastMessageDate(XMLGregorianCalendar value) {
        this.lastMessageDate = value;
    }

    /**
     * Gets the value of the lastReportDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReportDate() {
        return lastReportDate;
    }

    /**
     * Sets the value of the lastReportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReportDate(XMLGregorianCalendar value) {
        this.lastReportDate = value;
    }

    /**
     * Gets the value of the legalCaseList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLegalCaseInfo }
     *     
     */
    public ArrayOfLegalCaseInfo getLegalCaseList() {
        return legalCaseList;
    }

    /**
     * Sets the value of the legalCaseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLegalCaseInfo }
     *     
     */
    public void setLegalCaseList(ArrayOfLegalCaseInfo value) {
        this.legalCaseList = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the dateLastModif property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastModif() {
        return dateLastModif;
    }

    /**
     * Sets the value of the dateLastModif property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastModif(XMLGregorianCalendar value) {
        this.dateLastModif = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the bankruptId property.
     * 
     */
    public int getBankruptId() {
        return bankruptId;
    }

    /**
     * Sets the value of the bankruptId property.
     *
     */
    public void setBankruptId(int value) {
        this.bankruptId = value;
    }

    /**
     * Gets the value of the guid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGuid(String value) {
        this.guid = value;
    }
}