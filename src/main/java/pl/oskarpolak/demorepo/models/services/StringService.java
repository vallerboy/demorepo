package pl.oskarpolak.demorepo.models.services;

import java.util.UUID;

public class StringService {

    public String generateRandomString(){
        return UUID.randomUUID().toString();
    }

}
