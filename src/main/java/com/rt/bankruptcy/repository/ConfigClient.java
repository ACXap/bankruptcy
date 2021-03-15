package com.rt.bankruptcy.repository;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class ConfigClient {

//    @Bean
//    public ESignatureProcessorClient eSignatureProcessorClient() {
//        ESignatureProcessorClient client = new ESignatureProcessorClient();
//        client.setWebServiceTemplate(mwWebServiceTemplate());
//        return client;
//    }
//
//    @Bean
//    public WebServiceTemplate mwWebServiceTemplate() {
//        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//        marshaller.setContextPath("com.rt.bankruptcy.repository.soap");
//        WebServiceTemplate template = new WebServiceTemplate(marshaller, marshaller);
//        template.setDefaultUri("https://osb-st2.vs.csin.cz:5001/CSMW/WS_MW_ESignatureProcessor_v02_02");
//        template.setMessageSender(defaultMwMessageSender());
//        return template;
//    }
//
//    @Bean
//    public HttpComponentsMessageSender defaultMwMessageSender() {
//        HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
//        messageSender.setCredentials(new UsernamePasswordCredentials("user", "password"));
//        return messageSender;
//    }

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.rt.bankruptcy.repository.soap");
        return marshaller;
    }

    @Bean
    public SoapConnector soapConnector(Jaxb2Marshaller marshaller) {
        SoapConnector client = new SoapConnector();
        client.setDefaultUri("https://services.fedresurs.ru/Bankruptcy/MessageServiceDemo/");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        client.setMessageSender(httpComponentsMessageSender());
        return client;
    }

    @Bean
    public HttpComponentsMessageSender httpComponentsMessageSender() {
        HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
        httpComponentsMessageSender.setCredentials (usernamePasswordCredentials());
        return httpComponentsMessageSender;
    }

    @Bean
    public UsernamePasswordCredentials usernamePasswordCredentials() {
        return new UsernamePasswordCredentials("demowebuser", "Ax!761BN");
    }
}