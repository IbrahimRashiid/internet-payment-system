package com.software.Phase2.Discount;

public class OverallDiscount extends Discount{
     String userName;

     public OverallDiscount() {
          super();
     }

     public OverallDiscount(double discountPercentage, String userName) {
          super(discountPercentage);
          this.userName = userName;
     }

     public String getUserName() {
          return userName;
     }
}
