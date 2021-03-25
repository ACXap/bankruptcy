package com.rt.bankruptcy.repository.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "IMessageService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({ObjectFactory.class})
public interface IMessageService {
    @WebMethod(operationName = "GetMessageIds", action = "http://tempuri.org/IMessageService/GetMessageIds")
    @WebResult(name = "GetMessageIdsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetMessageIds", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetMessageIds")
    @ResponseWrapper(localName = "GetMessageIdsResponse", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetMessageIdsResponse")
    ArrayOfInt getMessageIds(
            @WebParam(name = "startDate", targetNamespace = "http://tempuri.org/")
                    XMLGregorianCalendar startDate,
            @WebParam(name = "endDate", targetNamespace = "http://tempuri.org/")
                    XMLGregorianCalendar endDate);

    @WebMethod(operationName = "GetMessageContent", action = "http://tempuri.org/IMessageService/GetMessageContent")
    @WebResult(name = "GetMessageContentResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetMessageContent", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetMessageContent")
    @ResponseWrapper(localName = "GetMessageContentResponse", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetMessageContentResponse")
    String getMessageContent(
            @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
                    int id);

//    /**
//     *
//     * @param idTradeMessage
//     * @return
//     *     returns java.lang.String
//     */
//    @WebMethod(operationName = "GetTradeMessageContent", action = "http://tempuri.org/IMessageService/GetTradeMessageContent")
//    @WebResult(name = "GetTradeMessageContentResult", targetNamespace = "http://tempuri.org/")
//    @RequestWrapper(localName = "GetTradeMessageContent", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetTradeMessageContent")
//    @ResponseWrapper(localName = "GetTradeMessageContentResponse", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetTradeMessageContentResponse")
//    public String getTradeMessageContent(
//        @WebParam(name = "idTradeMessage", targetNamespace = "http://tempuri.org/")
//        int idTradeMessage);

//    /**
//     *
//     * @param startFrom
//     * @param endTo
//     * @return
//     *     returns ru.demo.bankrupts.soap.ws.client.generated.ArrayOfTradePlace
//     */
//    @WebMethod(operationName = "GetTradeMessages", action = "http://tempuri.org/IMessageService/GetTradeMessages")
//    @WebResult(name = "GetTradeMessagesResult", targetNamespace = "http://tempuri.org/")
//    @RequestWrapper(localName = "GetTradeMessages", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetTradeMessages")
//    @ResponseWrapper(localName = "GetTradeMessagesResponse", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetTradeMessagesResponse")
//    public ArrayOfTradePlace getTradeMessages(
//        @WebParam(name = "startFrom", targetNamespace = "http://tempuri.org/")
//        XMLGregorianCalendar startFrom,
//        @WebParam(name = "endTo", targetNamespace = "http://tempuri.org/")
//        XMLGregorianCalendar endTo);
//
//    /**
//     *
//     * @param startFrom
//     * @param endTo
//     * @param id
//     * @param tradePlaceInn
//     * @return
//     *     returns ru.demo.bankrupts.soap.ws.client.generated.ArrayOfTradePlace
//     */
//    @WebMethod(operationName = "GetTradeMessagesByTrade", action = "http://tempuri.org/IMessageService/GetTradeMessagesByTrade")
//    @WebResult(name = "GetTradeMessagesByTradeResult", targetNamespace = "http://tempuri.org/")
//    @RequestWrapper(localName = "GetTradeMessagesByTrade", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetTradeMessagesByTrade")
//    @ResponseWrapper(localName = "GetTradeMessagesByTradeResponse", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetTradeMessagesByTradeResponse")
//    public ArrayOfTradePlace getTradeMessagesByTrade(
//        @WebParam(name = "startFrom", targetNamespace = "http://tempuri.org/")
//        XMLGregorianCalendar startFrom,
//        @WebParam(name = "endTo", targetNamespace = "http://tempuri.org/")
//        XMLGregorianCalendar endTo,
//        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
//        String id,
//        @WebParam(name = "tradePlaceInn", targetNamespace = "http://tempuri.org/")
//        String tradePlaceInn);

    @WebMethod(operationName = "GetArbitrManagerRegister", action = "http://tempuri.org/IMessageService/GetArbitrManagerRegister")
    @WebResult(name = "GetArbitrManagerRegisterResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetArbitrManagerRegister", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetArbitrManagerRegister")
    @ResponseWrapper(localName = "GetArbitrManagerRegisterResponse", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetArbitrManagerRegisterResponse")
    AMList getArbitrManagerRegister(
            @WebParam(name = "date", targetNamespace = "http://tempuri.org/")
                    XMLGregorianCalendar date);

    @WebMethod(operationName = "GetDebtorRegister", action = "http://tempuri.org/IMessageService/GetDebtorRegister")
    @WebResult(name = "GetDebtorRegisterResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetDebtorRegister", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetDebtorRegister")
    @ResponseWrapper(localName = "GetDebtorRegisterResponse", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetDebtorRegisterResponse")
    DebtorList getDebtorRegister(
            @WebParam(name = "date", targetNamespace = "http://tempuri.org/")
                    XMLGregorianCalendar date);

//    /**
//     *
//     * @param date
//     * @return
//     *     returns ru.demo.bankrupts.soap.ws.client.generated.TradeOrganizerList
//     */
//    @WebMethod(operationName = "GetCompanyTradeOrganizerRegister", action = "http://tempuri.org/IMessageService/GetCompanyTradeOrganizerRegister")
//    @WebResult(name = "GetCompanyTradeOrganizerRegisterResult", targetNamespace = "http://tempuri.org/")
//    @RequestWrapper(localName = "GetCompanyTradeOrganizerRegister", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetCompanyTradeOrganizerRegister")
//    @ResponseWrapper(localName = "GetCompanyTradeOrganizerRegisterResponse", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetCompanyTradeOrganizerRegisterResponse")
//    public TradeOrganizerList getCompanyTradeOrganizerRegister(
//        @WebParam(name = "date", targetNamespace = "http://tempuri.org/")
//        XMLGregorianCalendar date);

//    /**
//     *
//     * @param date
//     * @return
//     *     returns ru.demo.bankrupts.soap.ws.client.generated.SROList
//     */
//    @WebMethod(operationName = "GetSroRegister", action = "http://tempuri.org/IMessageService/GetSroRegister")
//    @WebResult(name = "GetSroRegisterResult", targetNamespace = "http://tempuri.org/")
//    @RequestWrapper(localName = "GetSroRegister", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetSroRegister")
//    @ResponseWrapper(localName = "GetSroRegisterResponse", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetSroRegisterResponse")
//    public SROList getSroRegister(
//        @WebParam(name = "date", targetNamespace = "http://tempuri.org/")
//        XMLGregorianCalendar date);

    @WebMethod(operationName = "GetDebtorByIdBankrupt", action = "http://tempuri.org/IMessageService/GetDebtorByIdBankrupt")
    @WebResult(name = "GetDebtorByIdBankruptResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetDebtorByIdBankrupt", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetDebtorByIdBankrupt")
    @ResponseWrapper(localName = "GetDebtorByIdBankruptResponse", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetDebtorByIdBankruptResponse")
    DebtorRegisterItem getDebtorByIdBankrupt(
            @WebParam(name = "idBankrupt", targetNamespace = "http://tempuri.org/")
                    int idBankrupt);

    @WebMethod(operationName = "GetDebtorsByLastPublicationPeriod", action = "http://tempuri.org/IMessageService/GetDebtorsByLastPublicationPeriod")
    @WebResult(name = "GetDebtorsByLastPublicationPeriodResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetDebtorsByLastPublicationPeriod", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetDebtorsByLastPublicationPeriod")
    @ResponseWrapper(localName = "GetDebtorsByLastPublicationPeriodResponse", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetDebtorsByLastPublicationPeriodResponse")
    DebtorList getDebtorsByLastPublicationPeriod(
            @WebParam(name = "startDate", targetNamespace = "http://tempuri.org/")
                    XMLGregorianCalendar startDate,
            @WebParam(name = "endDate", targetNamespace = "http://tempuri.org/")
                    XMLGregorianCalendar endDate);

    @WebMethod(operationName = "GetDebtorMessagesContentForPeriodByIdBankrupt", action = "http://tempuri.org/IMessageService/GetDebtorMessagesContentForPeriodByIdBankrupt")
    @WebResult(name = "GetDebtorMessagesContentForPeriodByIdBankruptResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetDebtorMessagesContentForPeriodByIdBankrupt", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetDebtorMessagesContentForPeriodByIdBankrupt")
    @ResponseWrapper(localName = "GetDebtorMessagesContentForPeriodByIdBankruptResponse", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetDebtorMessagesContentForPeriodByIdBankruptResponse")
    String getDebtorMessagesContentForPeriodByIdBankrupt(
            @WebParam(name = "idBankrupt", targetNamespace = "http://tempuri.org/")
                    int idBankrupt,
            @WebParam(name = "startDate", targetNamespace = "http://tempuri.org/")
                    XMLGregorianCalendar startDate);

    @WebMethod(operationName = "GetDebtorReportsContentForPeriodByIdBankrupt", action = "http://tempuri.org/IMessageService/GetDebtorReportsContentForPeriodByIdBankrupt")
    @WebResult(name = "GetDebtorReportsContentForPeriodByIdBankruptResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetDebtorReportsContentForPeriodByIdBankrupt", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetDebtorReportsContentForPeriodByIdBankrupt")
    @ResponseWrapper(localName = "GetDebtorReportsContentForPeriodByIdBankruptResponse", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.GetDebtorReportsContentForPeriodByIdBankruptResponse")
    String getDebtorReportsContentForPeriodByIdBankrupt(
            @WebParam(name = "idBankrupt", targetNamespace = "http://tempuri.org/")
                    int idBankrupt,
            @WebParam(name = "startDate", targetNamespace = "http://tempuri.org/")
                    XMLGregorianCalendar startDate);

    @WebMethod(operationName = "SearchDebtorByCode", action = "http://tempuri.org/IMessageService/SearchDebtorByCode")
    @WebResult(name = "SearchDebtorByCodeResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SearchDebtorByCode", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.SearchDebtorByCode")
    @ResponseWrapper(localName = "SearchDebtorByCodeResponse", targetNamespace = "http://tempuri.org/", className = "ru.demo.bankrupts.soap.ws.client.generated.SearchDebtorByCodeResponse")
    DebtorList searchDebtorByCode(
            @WebParam(name = "codeType", targetNamespace = "http://tempuri.org/")
                    DebtorCodeType codeType,
            @WebParam(name = "codeValue", targetNamespace = "http://tempuri.org/")
                    String codeValue);
}