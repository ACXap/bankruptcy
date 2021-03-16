package com.rt.bankruptcy.repository.config;

import com.rt.bankruptcy.repository.soap.IMessageService;
import com.rt.bankruptcy.repository.soap.MessageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoapConfig {
    @Bean
    public IMessageService getMessageService(@Value("${soap.url.service}") String url,
                                             @Value("${soap.user}") String userName,
                                             @Value("${soap.password}") String password) throws Exception {

        return new MessageService(url, userName, password).getMessageService();
    }
}