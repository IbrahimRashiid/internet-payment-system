package com.software.Phase2.Payment;

import com.software.Phase2.transactions.Transactions;

public class CreditCard extends Payment{


    public CreditCard(double cost, String userName, String serviceName) {
        super(cost, userName, serviceName);
    }

    @Override
    public String pay() {
        Transactions.paymentTransaction.add(userName+" paid "+cost+" by CreditCard");

        return "Cost is : "+cost +"\nCost After discount : "+costAfterDiscount;
    }
}
