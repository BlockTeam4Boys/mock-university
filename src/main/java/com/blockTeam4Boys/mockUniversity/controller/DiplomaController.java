package com.blockTeam4Boys.mockUniversity.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;

@RestController
public class DiplomaController {

    @ResponseBody
    @PostMapping(value = "/diploma", produces = MediaType.APPLICATION_JSON_VALUE)
    public byte[] analyze(@RequestBody DiplomaRequest request) throws IOException {
        if (request.getNumber().equals("1222")
                || (request.getFirstName() + " " + request.getSecondName()).equals("Евгений Ермаков")
                || request.getYear().equals("2020")
                || request.getSpec().equals("Программная инженерия")) {
            return getDiploma();
        }
        return null;
    }

    private byte[] getDiploma() throws IOException {
        InputStream in = getClass().getResourceAsStream("/diploma.json");
        return IOUtils.toByteArray(in);
    }
}
