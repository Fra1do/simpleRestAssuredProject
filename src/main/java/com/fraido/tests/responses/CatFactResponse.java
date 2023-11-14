package com.fraido.tests.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CatFactResponse {
    @JsonProperty("fact")
    private String fact;

    @JsonProperty("length")
    private Integer length;
}
