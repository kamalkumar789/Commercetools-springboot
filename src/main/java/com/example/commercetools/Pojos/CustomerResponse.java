package com.example.commercetools.Pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResponse {

    private String id;
    private Integer version;
    private String versionModifiedAt;
    private Integer lastMessageSequenceNumber;
    private String createdAt;
    private String lastModifiedAt;

    @JsonProperty("lastModifiedBy")
    private CustomerLastModifiedBy customerLastModifiedBy;
    @JsonProperty("createdBy")
    private CustomerCreatedBy customerCreatedBy;

    private String email;
    private String firstName;
    private String lastName;
    private String password;

    private List<Integer> customerAddress;

    private List<String> shippingAddressIds;
    private List<String> billingAddressIds;
    private boolean isEmailVerified;

    private List<String> customerStores;

    private String authenticationMode;
}
