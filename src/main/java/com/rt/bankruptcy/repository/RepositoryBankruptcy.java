package com.rt.bankruptcy.repository;

import com.rt.bankruptcy.repository.soap.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
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

    public CollectionMessageDate getMessage(int id, Date startDate) throws Exception {
        XMLGregorianCalendar gDateFormatted1 =
                DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd").format(startDate));

        String debtorMessagesContentForPeriodByIdBankrupt = messageServiceProxy.getDebtorMessagesContentForPeriodByIdBankrupt(id, gDateFormatted1);

        CollectionMessageDate deserialize = new XmlService().Deserialize(debtorMessagesContentForPeriodByIdBankrupt, CollectionMessageDate.class);

        return deserialize;
    }

   public MessageData getMessage(int id) throws Exception {
       String messageContent = messageServiceProxy.getMessageContent(1660549);

      MessageData deserialize = new XmlService().Deserialize(messageContent, MessageData.class);

       return deserialize;
   }
}