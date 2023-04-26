package com.software.Phase2.Discount;

import com.software.Phase2.Database.DiscountDataBase;

public class DiscountService {
    DiscountDataBase discountDataBase=new DiscountDataBase();

    public String addSpecificDiscount(String serviceName,double discountPercentage)
    {
      SpecificDiscount  discount=new SpecificDiscount(discountPercentage,serviceName);

        discountDataBase.addSpecificDiscount(discount);
        return "added SpecificDiscount successfully !";
    }
    public String addOverallDiscount(String userName,double discountPercentage)
    {
       OverallDiscount discount=new OverallDiscount(discountPercentage,userName);

        discountDataBase.addOverallDiscount(discount);
        return "added addOverallDiscount successfully !";
    }
    public  double checkSpecific(String serviceName)
    {
        if(DiscountDataBase.checkSpecificDiscount(serviceName)==0.0) return 0.0;

     return  DiscountDataBase.checkSpecificDiscount(serviceName);
    }
    public double checkOverall(String userName)
    {
        if(DiscountDataBase.checkOverallDiscount(userName)==0.0) return 0.0;

        return  DiscountDataBase.checkOverallDiscount(userName);
    }

}
