package com.rt.bankruptcy.repository;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

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
    public MessageInfo messageInfo;
    @JacksonXmlProperty(localName = "BankruptInfo")
    public BankruptInfo bankruptInfo;
    @JacksonXmlProperty(localName = "PublishDate")
    public Date publishDate;
    @JacksonXmlProperty(localName = "BankruptId")
    public int bankruptId;
    @JacksonXmlProperty(localName = "MessageGUID")
    public String messageGUID;
    @JacksonXmlProperty(localName = "MessageURLList")
    public List<Object> messageURLList;

    @Getter
    @Setter
    public static class Publisher {
        @JacksonXmlProperty(isAttribute = true, localName = "type")
        public String type;
        @JacksonXmlProperty(localName = "Name")
        public String name;
        @JacksonXmlProperty(localName = "Ogrn")
        public String ogrn;
        @JacksonXmlProperty(localName = "Inn")
        public String inn;
    }

    @Getter
    @Setter
    public static class BankruptInfo {

        @JacksonXmlProperty(isAttribute = true, localName = "BankruptType")
        public String bankruptType;
        @JacksonXmlProperty(isAttribute = true, localName = "BankruptCategory")
        public String bankruptCategory;
        @JacksonXmlProperty(localName = "BankruptFirm")
        public BankruptFirm BankruptFirm;

        @Getter
        @Setter
        public static class BankruptFirm {
            @JacksonXmlProperty(isAttribute = true, localName = "Id")
            public int id;
            @JacksonXmlProperty(isAttribute = true, localName = "InsolventCategoryName")
            public String insolventCategoryName;
            @JacksonXmlProperty(isAttribute = true, localName = "FullName")
            public String fullName;
            @JacksonXmlProperty(isAttribute = true, localName = "ShortName")
            public String shortName;
            @JacksonXmlProperty(isAttribute = true, localName = "PostAddress")
            public String postAddress;
            @JacksonXmlProperty(isAttribute = true, localName = "OGRN")
            public String ogrn;
            @JacksonXmlProperty(isAttribute = true, localName = "LegalAddress")
            public String legalAddress;

            @JacksonXmlProperty(localName = "INN")
            public String inn;
        }
    }

    @Getter
    @Setter
    public static class MessageInfo {
        @JacksonXmlProperty(isAttribute = true, localName = "MessageType")
        public String messageType;
        @JacksonXmlProperty(localName = "Auction")
        public Auction auction;
        @JacksonXmlProperty(localName = "Other")
        public Other other;
        @JacksonXmlProperty(localName = "CourtDecision")
        public CourtDecision courtDecision;

        @Getter
        @Setter
        public static class Other {
            @JacksonXmlProperty(localName = "Text")
            public String text;
        }

        @Getter
        @Setter
        public static class CourtDecision {
            @JacksonXmlProperty(localName = "Text")
            public String Text;
            @JacksonXmlProperty(localName = "DecisionType")
            public Object DecisionType;
            @JacksonXmlProperty(localName = "CourtDecree")
            public Object CourtDecree;
            @JacksonXmlProperty(localName = "LossesFromArbitrManagerActionsAmount")
            public Object LossesFromArbitrManagerActionsAmount;
            @JacksonXmlProperty(localName = "CitizenNotReleasedFromResponsibility")
            public Object CitizenNotReleasedFromResponsibility;
            @JacksonXmlProperty(localName = "CreditorClaimRegisterCloseDate")
            public Date CreditorClaimRegisterCloseDate;
            @JacksonXmlProperty(localName = "CreditorClaimSettingRequirementsExpirationDate")
            public Object CreditorClaimSettingRequirementsExpirationDate;
            @JacksonXmlProperty(localName = "DecisionMadeDueTorCancellationRestructuringPlan")
            public Object DecisionMadeDueTorCancellationRestructuringPlan;
            @JacksonXmlProperty(localName = "ArbitrManagerType")
            public String ArbitrManagerType;
        }

        @Getter
        @Setter
        public static class Auction {
            @JacksonXmlProperty(localName = "Text")
            public String text;
            @JacksonXmlProperty(localName = "IsRepeat")
            public boolean isRepeat;
            @JacksonXmlProperty(localName = "Date")
            public Date date;
            @JacksonXmlProperty(localName = "TradeType")
            public String tradeType;
            @JacksonXmlProperty(localName = "PriceType")
            public String priceType;
            @JacksonXmlProperty(localName = "IdTradePlace")
            public String idTradePlace;
            @JacksonXmlProperty(localName = "TradeSite")
            public String tradeSite;
            @JacksonXmlProperty(localName = "Participants")
            public String participants;
            @JacksonXmlProperty(localName = "AdditionalText")
            public String additionalText;
            @JacksonXmlProperty(localName = "Application")
            public Application application;
            @JacksonXmlProperty(localName = "LotTable")
            public Object lotTable;

            @Getter
            @Setter
            public static class Application {
                @JacksonXmlProperty(localName = "TimeBegin")
                public Date timeBegin;
                @JacksonXmlProperty(localName = "TimeEnd")
                public Date timeEnd;
                @JacksonXmlProperty(localName = "Rules")
                public String Rules;
            }
        }
    }
}