package com.example.commercetools.Configuration;

import com.commercetools.api.client.ProjectApiRoot;

import com.commercetools.api.defaultconfig.ApiRootBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import io.vrap.rmf.base.client.oauth2.*;
import com.commercetools.api.defaultconfig.ServiceRegion;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
public class Client {

    @Autowired
    private Properties properties;

    @Bean
    public ProjectApiRoot createApiClient() {
        return ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                                .withClientId(properties.getClientId())
                                .withClientSecret(properties.getClientSecret())
                                .build(),
                        ServiceRegion.GCP_AUSTRALIA_SOUTHEAST1)
                .build(properties.getProjectKey());
    }
}