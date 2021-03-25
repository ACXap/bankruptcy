package com.rt.bankruptcy.repository.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"getMessageContentResult"})
@XmlRootElement(name = "GetMessageContentResponse")
public class GetMessageContentResponse {

    @XmlElement(name = "GetMessageContentResult")
    protected String getMessageContentResult;

    public String getGetMessageContentResult() {
        return getMessageContentResult;
    }

    public void setGetMessageContentResult(String value) {
        this.getMessageContentResult = value;
    }
}