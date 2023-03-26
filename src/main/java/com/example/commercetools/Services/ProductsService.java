package com.example.commercetools.Services;


import com.commercetools.api.models.cart.CustomLineItemDraft;
import com.commercetools.api.models.cart.LineItemDraft;
import com.commercetools.api.models.me.MyLineItemDraft;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductImpl;
import com.example.commercetools.Pojos.ProductsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private RestTemplate restTemplate;

    public ProductsResponse getAllProducts(LineItemDraft lineItemDraft) throws Exception{
        return restTemplate.getForObject("https://fakestoreapi.com/products/"+lineItemDraft.getProductId(),ProductsResponse.class);
    }

    public List<LineItemDraft> validateProductsAndAddDetails(List<LineItemDraft> lineItemDraft) throws Exception{

        for(LineItemDraft lineItemDraft1: lineItemDraft){
            ProductsResponse response = this.getAllProducts(lineItemDraft1);
            lineItemDraft1.setQuantity((long)response.getRating().getCount());
        }
        return lineItemDraft;
    }
}
