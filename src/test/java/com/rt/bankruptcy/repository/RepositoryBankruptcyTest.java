package com.rt.bankruptcy.repository;

import com.rt.bankruptcy.repository.soap.MessageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryBankruptcyTest {
    private RepositoryBankruptcy repo;

    @BeforeEach
    public void start() throws Exception {
        repo = new RepositoryBankruptcy(new MessageService("https://services.fedresurs.ru/Bankruptcy/MessageServiceDemo/WebService.svc", "demowebuser", "Ax!761BN").getMessageService());
    }

    @Test
    void getMessage() throws Exception {
        String message = repo.getMessage(1660549);
        System.out.println(message);
    }
}