package com.software.Phase2.Discount;
public class SpecificDiscount extends Discount{
    String serviceName;

    public SpecificDiscount() {
        super();
    }

    public SpecificDiscount(double discountPercentage, String serviceName) {
        super(discountPercentage);
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }
}
