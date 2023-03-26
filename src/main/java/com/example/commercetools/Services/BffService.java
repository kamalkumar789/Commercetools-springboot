package com.example.commercetools.Services;


import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartDraft;
import com.commercetools.api.models.cart.LineItemDraft;
import com.commercetools.api.models.me.MyCartDraft;
import com.commercetools.api.models.me.MyCartDraftImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BffService {


    @Autowired
    private ProjectApiRoot projectApiRoot;

//    @Autowired
//    private ProductsService productsService;
//    public Cart addCart(CartDraft cartDraft) throws Exception{
//
//        List<LineItemDraft> updateLineItems = productsService.validateProductsAndAddDetails(cartDraft.getLineItems());
//        cartDraft.setLineItems(updateLineItems);
//        return projectApiRoot.carts().post(cartDraft).executeBlocking().getBody();
//    }
}