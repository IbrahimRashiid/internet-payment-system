package com.software.Phase2.Payment;

import com.software.Phase2.registeration.RegisterOperations;

public class PaymentService {
    Payment payment;
    public String creditCard(double cost,String username,String serviceName)
    {
        payment=new CreditCard(cost,username,serviceName);
        return payment.pay();
    }
    public String cash(double cost,String username,String serviceName)
    {
        payment=new Cash(cost,username,serviceName);
        return payment.pay();
    }
    public String wallet(double cost,String username,String serviceName)
    {
        payment=new Wallet(cost,username,serviceName);

        return payment.pay();
    }



}
