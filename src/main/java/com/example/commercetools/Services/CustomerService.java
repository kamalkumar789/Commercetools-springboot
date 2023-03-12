package com.example.commercetools.Services;

import com.commercetools.api.client.ByProjectKeyCustomersRequestBuilder;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.models.api_client.ApiClientBuilder;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerPagedQueryResponse;
import com.example.commercetools.Pojos.CustomerResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class CustomerService {


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProjectApiRoot projectApiRoot;

        public List<Customer> getCustomerById() throws Exception{
            return projectApiRoot.customers().get().executeBlocking().getBody().getResults();
        }
}