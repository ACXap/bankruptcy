package com.rt.bankruptcy.repository.soap;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MessageData {
    @JacksonXmlProperty(localName = "Id")
    public int id;
    @JacksonXmlProperty(localName = "Number")
    public int number;
    @JacksonXmlProperty(localName = "CaseNumber")
    public String caseNumber;
    @JacksonXmlProperty(localName = "Publisher")
    public Publisher publisher;
    @JacksonXmlProperty(localName = "MessageInfo")
    public Object messageInfo;
    @JacksonXmlProperty(localName = "BankruptInfo")
    public Object bankruptInfo;
    @JacksonXmlProperty(localName = "PublishDate")
    public Date publishDate;
    @JacksonXmlProperty(localName = "BankruptId")
    public int bankruptId;
    @JacksonXmlProperty(localName = "MessageGUID")
    public String messageGUID;

    @Getter
    @Setter
    public static class Publisher{
        @JacksonXmlProperty(localName = "Name")
        public String name;
        @JacksonXmlProperty(localName = "Ogrn")
        public String ogrn;
        @JacksonXmlProperty(localName = "Inn")
        public String inn;
    }
}