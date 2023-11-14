package com.fraido.tests.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LinkResponse {

    @JsonProperty("url")
    private String url;

    @JsonProperty("label")
    private String label;

    @JsonProperty("active")
    private Boolean active;
}
