package com.example.commercetools.Controllers;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartDraft;
import com.commercetools.api.models.cart.CartDraftImpl;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderFromCartDraftImpl;
import com.example.commercetools.Services.CustomerService;
import com.example.commercetools.Services.OrderService;
import io.vrap.rmf.base.client.ApiHttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/order/{customerId}")
    public ApiHttpResponse<Order> addOrder(@RequestBody OrderFromCartDraftImpl orderFromCartDraft){
        return orderService.addOrder(orderFromCartDraft);
    }

    @PostMapping("/create/cart")
    public ApiHttpResponse<Cart> addCart(@RequestBody CartDraftImpl cartDraft){
        return orderService.addCart(cartDraft);
    }
}