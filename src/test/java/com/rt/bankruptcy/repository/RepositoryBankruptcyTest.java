package com.rt.bankruptcy.repository;

import com.rt.bankruptcy.repository.soap.MessageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryBankruptcyTest {
    private RepositoryBankruptcy repo;

    @BeforeEach
    public void start() throws Exception {
        repo = new RepositoryBankruptcy(new MessageService("https://services.fedresurs.ru/Bankruptcy/MessageServiceDemo/WebService.svc", "demowebuser", "Ax!761BN").getMessageService());
    }

    @Test
    void getMessage() throws Exception {
        repo.getMessageById(1660549);
    }

    @Test
    void testGetMessage() throws Exception {
        repo.getMessageByIdBankrupt(138895, new Date(0));
    }
}