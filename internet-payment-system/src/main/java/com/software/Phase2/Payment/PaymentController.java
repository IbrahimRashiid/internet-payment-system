package com.software.Phase2.Payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class PaymentController {
   PaymentService paymentService=new PaymentService();
 @GetMapping(value="/payment/creditcard")
 public String paymentCreditCard(@PathParam("cost") double cost,@PathParam("username") String username,
                                 @PathParam("serviceName") String serviceName)
 {
    return paymentService.creditCard(cost,username,serviceName);

 }
    @GetMapping(value="/payment/cash")
    public String paymentCash(@PathParam("cost") double cost,@PathParam("username") String username,
                              @PathParam("serviceName") String serviceName)
    {
       return paymentService.cash(cost,username,serviceName);
    }
    @GetMapping(value="/payment/wallet")
    public String paymentWallet(@PathParam("cost") double cost,@PathParam("username") String username,
                                @PathParam("serviceName") String serviceName)
    {
       return paymentService.wallet(cost,username,serviceName);
    }
}
