package com.software.Phase2.Discount;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
@RestController
public class DiscountController {
    DiscountService discountService=new DiscountService();
    @PostMapping(value="/addSpecificDiscount")
    public String addSpecificDiscount (@PathParam("serviceName")String serviceName,
                                       @PathParam("discountPercentage")double discountPercentage)
    {
       return discountService.addSpecificDiscount(serviceName,discountPercentage);

    }
    @PostMapping(value="/addOverallDiscount")
    public String addOverallDiscount (@PathParam("userName")String userName,@PathParam("discountPercentage")double discountPercentage)
    {
        return discountService.addOverallDiscount(userName,discountPercentage);
    }
    @GetMapping(value="/getSpecificDiscount")
    public double getSpecificDiscount (@PathParam("serviceName")String serviceName)
    {
        return discountService.checkSpecific(serviceName);
    }
}
