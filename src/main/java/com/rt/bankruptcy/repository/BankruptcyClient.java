package com.rt.bankruptcy.repository;

import com.rt.bankruptcy.repository.soap.GetDebtorByIdBankrupt;
import com.rt.bankruptcy.repository.soap.GetDebtorByIdBankruptResponse;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Service
public class BankruptcyClient extends WebServiceGatewaySupport {

    public BankruptcyClient(SoapConnector soapConnector) {

        GetDebtorByIdBankrupt request = new GetDebtorByIdBankrupt();
        request.setIdBankrupt(138895);

        Object obj = soapConnector.callWebService("https://services.fedresurs.ru/Bankruptcy/MessageServiceDemo/WebService.svc", request);
        System.out.println(obj);
    }
}