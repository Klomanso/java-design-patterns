package org.example.solid.di_principle;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class JSONFormatter implements Formatter {

    public String format(Message message) throws FormatException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new SimpleModule());
        try {
            return mapper.writeValueAsString(message);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new FormatException(e);
        }
    }
}
