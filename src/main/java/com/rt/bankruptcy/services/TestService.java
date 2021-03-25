package com.rt.bankruptcy.services;

import com.rt.bankruptcy.repository.RepositoryBankruptcy;
import com.rt.bankruptcy.repository.soap.DebtorRegisterItem;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.Date;
import java.util.List;

@Service
public class TestService {

    public TestService(RepositoryBankruptcy repository) throws Exception {

        String message = repository.getMessage(1660549);
        System.out.println(message);

//        DebtorRegisterItem debtor = repository.getDebtorByIdBankrupt(138895);
//
//        System.out.println("DebtorRegisterItem [lastMessageDate=" + debtor.getLastMessageDate() + ", lastReportDate=" + debtor.getLastReportDate()
//                + ", legalCaseList=" + debtor.getLegalCaseList() + ", category=" + debtor.getCategory() + ", categoryCode=" + debtor.getCategoryCode()
//                + ", region=" + debtor.getRegion() + ", dateLastModif=" + debtor.getDateLastModif() + ", inn=" + debtor.getINN() + ", bankruptId="
//                + debtor.getBankruptId() + ", guid=" + debtor.getGuid() + "]");
//
//
//        System.out.println("--------------------------------------");
//
//
//        List<DebtorRegisterItem> debtorByInn = repository.getDebtorByInn("2125002247");
//
//        debtor = debtorByInn.get(0);
//        System.out.println("DebtorRegisterItem [lastMessageDate=" + debtor.getLastMessageDate() + ", lastReportDate=" + debtor.getLastReportDate()
//                + ", legalCaseList=" + debtor.getLegalCaseList() + ", category=" + debtor.getCategory() + ", categoryCode=" + debtor.getCategoryCode()
//                + ", region=" + debtor.getRegion() + ", dateLastModif=" + debtor.getDateLastModif() + ", inn=" + debtor.getINN() + ", bankruptId="
//                + debtor.getBankruptId() + ", guid=" + debtor.getGuid() + "]");
//
//
//        System.out.println("--------------------------------------");
//
//        String message = repository.getMessage(138895, new Date(0));
//        System.out.println(message);


    }
}