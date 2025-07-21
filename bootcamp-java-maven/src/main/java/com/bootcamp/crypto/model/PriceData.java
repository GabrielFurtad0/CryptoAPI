package com.bootcamp.crypto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PriceData (
        @JsonProperty("usd") Double priceInUsd
) {
}
