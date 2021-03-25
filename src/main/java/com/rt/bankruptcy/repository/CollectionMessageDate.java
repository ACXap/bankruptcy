package com.rt.bankruptcy.repository;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CollectionMessageDate {
    @JacksonXmlProperty(localName = "MessageData")
    @JacksonXmlElementWrapper(useWrapping = false)
    List<MessageData> collectionMessageDate;
}