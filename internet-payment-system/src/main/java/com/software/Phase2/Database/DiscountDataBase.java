package com.software.Phase2.Database;

import com.software.Phase2.Discount.Discount;
import com.software.Phase2.Discount.OverallDiscount;
import com.software.Phase2.Discount.SpecificDiscount;

import java.util.ArrayList;
import java.util.List;

public class DiscountDataBase {
    public static List<SpecificDiscount>specificDiscount=new ArrayList<SpecificDiscount>();
    public static List<OverallDiscount>overallDiscount=new ArrayList<OverallDiscount>();

      public void addSpecificDiscount(SpecificDiscount discount)
      {
         specificDiscount.add(discount);
      }
    public void addOverallDiscount(OverallDiscount discount)
    {
       overallDiscount.add(discount);
    }
    public static double checkSpecificDiscount(String serviceName)
    {
        for(SpecificDiscount discount:specificDiscount)
        {
            if(discount.getServiceName().equals(serviceName))
            {
              return discount.getDiscountPercentage();
            }
        }
        return 0.0;
    }
    public static double checkOverallDiscount(String userName)
    {
        for(OverallDiscount discount:overallDiscount)
        {
            if(discount.getUserName().equals(userName))
            {
                return discount.getDiscountPercentage();
            }
        }
        return 0.0;
    }


}
