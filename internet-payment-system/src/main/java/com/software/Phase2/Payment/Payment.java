package com.software.Phase2.Payment;

import com.software.Phase2.Database.DiscountDataBase;
import com.software.Phase2.Discount.DiscountService;

public abstract  class Payment {
  protected double cost;
  protected double costAfterDiscount;
  protected String userName;
  protected String serviceName;


    public Payment(double cost, String userName,String serviceName) {
        this.cost = cost;
        this.userName = userName;
        this.serviceName=serviceName;
         this.costAfterDiscount=cost;
        if(DiscountDataBase.checkOverallDiscount(userName)!=0.0)
            costAfterDiscount*=1-(DiscountDataBase.checkOverallDiscount(userName)/100);
        if(DiscountDataBase.checkSpecificDiscount(serviceName)!=0.0)
            costAfterDiscount*=1-(DiscountDataBase.checkSpecificDiscount(serviceName)/100);
    }

    public abstract String pay();
}
