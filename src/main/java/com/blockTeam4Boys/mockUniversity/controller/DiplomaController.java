package com.blockTeam4Boys.mockUniversity.controller;

import com.blockTeam4Boys.mockUniversity.dto.DiplomaRequest;
import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;

@RestController
public class DiplomaController {

    @ResponseBody
    @GetMapping(value = "/diploma", produces = MediaType.APPLICATION_JSON_VALUE)
    public byte[] analyze(@RequestBody DiplomaRequest request) throws IOException {
        if (request.getDiplomaNumber().equals("172313794")) {
            InputStream in = getClass().getResourceAsStream("/diploma.json");
            return IOUtils.toByteArray(in);
        } else {
            return null;
        }
    }
}
