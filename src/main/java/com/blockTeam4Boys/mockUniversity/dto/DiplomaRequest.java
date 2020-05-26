package com.blockTeam4Boys.mockUniversity.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class DiplomaRequest {
    @NotNull
    String diplomaNumber;
}
