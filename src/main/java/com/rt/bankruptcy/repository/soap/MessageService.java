package com.rt.bankruptcy.repository.soap;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.*;

public class MessageService extends Service {
    private final static QName MESSAGESERVICE_QNAME = new QName("http://tempuri.org/", "MessageService");
    private final String urlService;
    private final String userName;
    private final String password;

    public MessageService(String url, String userName, String password) throws Exception {
        super(new URL(url), MESSAGESERVICE_QNAME);

        this.urlService = url;
        this.userName = userName;
        this.password = password;
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password.toCharArray());
            }
        });
    }

    public IMessageService getMessageService() {
        IMessageService messageServiceProxy = getBasicHttpBindingIMessageService();

        BindingProvider prov = (BindingProvider) messageServiceProxy;
        prov.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, urlService);
        prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, userName);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);

        return messageServiceProxy;
    }

    @WebEndpoint(name = "BasicHttpBinding_IMessageService")
    public IMessageService getBasicHttpBindingIMessageService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IMessageService"), IMessageService.class);
    }
}