package com.rt.bankruptcy.services;

import com.rt.bankruptcy.repository.RepositoryBankruptcy;
import com.rt.bankruptcy.repository.soap.DebtorRegisterItem;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public TestService(RepositoryBankruptcy repository){
        DebtorRegisterItem debtor = repository.getDebtorByIdBankrupt(138895);

        System.out.println("DebtorRegisterItem [lastMessageDate=" + debtor.getLastMessageDate() + ", lastReportDate=" + debtor.getLastReportDate()
                + ", legalCaseList=" + debtor.getLegalCaseList() + ", category=" + debtor.getCategory() + ", categoryCode=" + debtor.getCategoryCode()
                + ", region=" + debtor.getRegion() + ", dateLastModif=" + debtor.getDateLastModif() + ", inn=" + debtor.getINN() + ", bankruptId="
                + debtor.getBankruptId() + ", guid=" + debtor.getGuid() + "]");
    }
}