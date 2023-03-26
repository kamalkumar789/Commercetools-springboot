package com.example.commercetools.Controllers;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartDraft;
import com.commercetools.api.models.cart.CartDraftImpl;
import com.commercetools.api.models.me.MyCartDraftImpl;
import com.example.commercetools.Services.BffService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BffController {


    @Autowired
    private BffService bffService;

//    @PostMapping("/cart")
//    public Cart addCart(@RequestBody CartDraft cartDraft) throws Exception{
//        return bffService.addCart(cartDraft);
//    }
}
