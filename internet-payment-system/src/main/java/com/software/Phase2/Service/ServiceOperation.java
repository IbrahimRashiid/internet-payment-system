package com.software.Phase2.Service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ServiceOperation {
    public ServiceOperation() {

    }

    public Service getService(String name)
    {
        if(name.equalsIgnoreCase("MobileRecharge"))

             return new MobilRecharge();

        else if(name.equalsIgnoreCase("landline"))
            return new Landline();

        else if(name.equalsIgnoreCase("Donation"))
            return new Donation();

        else if(name.equalsIgnoreCase("InternetPayment"))
            return new Landline();
        return null;
    }
}
