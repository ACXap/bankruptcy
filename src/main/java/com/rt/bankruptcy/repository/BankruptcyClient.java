package com.rt.bankruptcy.repository;

import com.rt.bankruptcy.repository.soap.GetDebtorByIdBankrupt;
import com.rt.bankruptcy.repository.soap.GetDebtorByIdBankruptResponse;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Service
public class BankruptcyClient extends WebServiceGatewaySupport {

    public BankruptcyClient(SoapConnector soapConnector) {

        GetDebtorByIdBankrupt request = new GetDebtorByIdBankrupt();
        request.setIdBankrupt(138895);

        try {
            Object obj = soapConnector.callWebService("https://services.fedresurs.ru/Bankruptcy/MessageServiceDemo/", request);
            System.out.println(obj);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}