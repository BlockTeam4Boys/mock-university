package com.blockTeam4Boys.mockUniversity.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;

@RestController
public class DiplomaController {

    @Value("${diploma.source}")
    private String diplomaSource;

    @ResponseBody
    @PostMapping(value = "/diploma", produces = MediaType.APPLICATION_JSON_VALUE)
    public byte[] analyze(@RequestBody DiplomaRequest request) throws IOException {
        if (diplomaSource.equals("tusur")) {
            if (request.getNumber().equals("1111")
                    || (request.getFirstName() + " " + request.getSecondName()).equals("Игорь Ермаков")
                    || request.getYear().equals("2020")
                    || request.getSpec().equals("Программная инженерия")) {
                return getDiploma();
            }
        }       if (diplomaSource.equals("tsu")) {
            if (request.getNumber().equals("2222")
                    || (request.getFirstName() + " " + request.getSecondName()).equals("Евгений Митикари")
                    || request.getYear().equals("2020")
                    || request.getSpec().equals("Программная инженерия")) {
                return getDiploma();
            }
        }
        if (diplomaSource.equals("tpu")) {
            if (request.getNumber().equals("3333")
                    || (request.getFirstName() + " " + request.getSecondName()).equals("Ибрагимов Алдияр")
                    || request.getYear().equals("2020")
                    || request.getSpec().equals("Программная инженерия")) {
                return getDiploma();
            }
        }
        return null;
    }

    private byte[] getDiploma() throws IOException {
        InputStream in = getClass().getResourceAsStream("/" + diplomaSource + "/diploma.json");
        return IOUtils.toByteArray(in);
    }
}
