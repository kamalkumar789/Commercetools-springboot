package com.example.commercetools.Pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductsResponse {

    private int id;
    private String title;
    private float price;
    private String description;
    private String category;
    private String image;
    @JsonProperty("rating")
    private Rating rating;

}

