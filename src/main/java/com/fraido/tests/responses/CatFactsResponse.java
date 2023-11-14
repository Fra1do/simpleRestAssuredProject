package com.fraido.tests.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CatFactsResponse {

    @JsonProperty("current_page")
    private Integer currentPage;

    @JsonProperty("data")
    private List<CatFactResponse> catFacts;

    @JsonProperty("first_page_url")
    private String firstPageUrl;

    @JsonProperty("last_page_url")
    private String lastPageUrl;

    @JsonProperty("links")
    private List<LinkResponse> links;

    @JsonProperty("total")
    private Integer total;
}
