package com.example.commercetools.Pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerLastModifiedBy {
    private String clientId;
    private boolean isPlatformClient;
}
