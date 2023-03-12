package com.example.commercetools.Pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerCreatedBy {
    private String clientId;
    private boolean isPlatformClient;
}
