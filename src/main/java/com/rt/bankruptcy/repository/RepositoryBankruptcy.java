package com.rt.bankruptcy.repository;

import com.rt.bankruptcy.repository.soap.DebtorRegisterItem;
import com.rt.bankruptcy.repository.soap.IMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RepositoryBankruptcy {
   private final IMessageService messageServiceProxy;

    public DebtorRegisterItem getDebtorByIdBankrupt(int id) {
        DebtorRegisterItem debtor = messageServiceProxy.getDebtorByIdBankrupt(id);
        return debtor;
    }
}