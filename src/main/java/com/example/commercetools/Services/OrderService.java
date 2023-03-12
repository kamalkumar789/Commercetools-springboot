package com.example.commercetools.Services;

import com.commercetools.api.client.ByProjectKeyOrdersPost;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartDraftImpl;
import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.cart.CartResourceIdentifierImpl;
import com.commercetools.api.models.extension.ExtensionDestinationImpl;
import com.commercetools.api.models.extension.ExtensionDraft;
import com.commercetools.api.models.extension.ExtensionDraftImpl;
import com.commercetools.api.models.me.MyOrderFromCartDraft;
import com.commercetools.api.models.me.MyOrderFromCartDraftImpl;
import com.commercetools.api.models.order.*;
import com.commercetools.importapi.models.orders.OrderImport;
import io.vrap.rmf.base.client.ApiHttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ProjectApiRoot projectApiRoot;


    public ApiHttpResponse<Order> addOrder(OrderFromCartDraftImpl orderFromCartDraft){
        return projectApiRoot.orders().post(orderFromCartDraft).executeBlocking();
    }
    public ApiHttpResponse<Cart> addCart(CartDraftImpl cartDraft){

        ExtensionDestinationImpl
        projectApiRoot.extensions().post();
        return projectApiRoot.carts().post(cartDraft).executeBlocking();

    }

}
