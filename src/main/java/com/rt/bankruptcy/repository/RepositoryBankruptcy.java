package com.rt.bankruptcy.repository;

import com.rt.bankruptcy.repository.soap.DebtorCodeType;
import com.rt.bankruptcy.repository.soap.DebtorList;
import com.rt.bankruptcy.repository.soap.DebtorRegisterItem;
import com.rt.bankruptcy.repository.soap.IMessageService;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RepositoryBankruptcy {
   private final IMessageService messageServiceProxy;

    public DebtorRegisterItem getDebtorByIdBankrupt(int id) {
        DebtorRegisterItem debtor = messageServiceProxy.getDebtorByIdBankrupt(id);
        return debtor;
    }

    public List<DebtorRegisterItem> getDebtorByInn(String inn){
        DebtorList debtorList = messageServiceProxy.searchDebtorByCode(DebtorCodeType.COMPANY_INN, inn);
        return debtorList.getDebtorList().getDebtorPersonOrDebtorCompany();
    }


    public String getMessage(int id, Date startDate) throws DatatypeConfigurationException {
        XMLGregorianCalendar gDateFormatted1 =
                DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd").format(startDate));


        String debtorMessagesContentForPeriodByIdBankrupt = messageServiceProxy.getDebtorMessagesContentForPeriodByIdBankrupt(id, gDateFormatted1);
        return debtorMessagesContentForPeriodByIdBankrupt;
    }
}