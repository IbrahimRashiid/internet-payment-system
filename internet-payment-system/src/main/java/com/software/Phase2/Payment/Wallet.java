package com.software.Phase2.Payment;

import com.software.Phase2.Database.DataBaseUser;
import com.software.Phase2.Database.DiscountDataBase;
import com.software.Phase2.registeration.RegisterOperations;
import com.software.Phase2.registeration.User;
import com.software.Phase2.transactions.Transactions;

public class Wallet extends Payment{

User user;
    public Wallet(double cost, String userName, String serviceName) {
        super(cost, userName, serviceName);
        user= DataBaseUser.searchByUserName(userName);


    }

    @Override
    public String pay() {
        if(user==null) return "Wrong Email!";

       if(user.getWalletBalance()>=cost)
       {
           Transactions.paymentTransaction.add(user.getEmail()+" paid "+cost+" by wallet");

           return "Cost is : "+cost +"\nCost After discount : "+costAfterDiscount;

       }


      return "No enough balance in your wallet";

    }



}
