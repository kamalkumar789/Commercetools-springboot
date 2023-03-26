package com.example.commercetools.Configuration;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties("commerce-tool")
public class Properties {

    private String clientId;
    private String clientSecret;
    private String projectKey;
}
