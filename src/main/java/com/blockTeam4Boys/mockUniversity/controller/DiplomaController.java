package com.blockTeam4Boys.mockUniversity.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@RestController
public class DiplomaController {

    @ResponseBody
    @GetMapping(value = "/diploma/{number}", produces = MediaType.APPLICATION_JSON_VALUE)
    public byte[] analyze(@PathVariable String number) throws IOException {
        if (number.equals("172313794")) {
            InputStream in = getClass().getResourceAsStream("/diploma.json");
            return IOUtils.toByteArray(in);
        }
        return null;
    }
}
