package com.example.commercetools.Services;

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

    @Value("${clientID}")
    private String clientId;
    @Value("${clientSecret}")
    private String clientSecretId;

    @Value("${projectKey}")
    private String projectKey;


    @Bean
    public ProjectApiRoot createApiClient() {

        return ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                                .withClientId(clientId)
                                .withClientSecret(clientSecretId)
                                .build(),
                        ServiceRegion.GCP_AUSTRALIA_SOUTHEAST1)
                .build(projectKey);
    }
}