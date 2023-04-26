package com.software.Phase2.Payment;

import com.software.Phase2.transactions.Transactions;

public class Cash extends Payment {


    public Cash(double cost, String userName, String serviceName) {
        super(cost, userName, serviceName);
    }

    @Override
    public String pay() {
        Transactions.paymentTransaction.add(userName+" paid "+cost+" by Cash");
        return "Cost is : "+cost +"\nCost After discount : "+costAfterDiscount;

    }
}
