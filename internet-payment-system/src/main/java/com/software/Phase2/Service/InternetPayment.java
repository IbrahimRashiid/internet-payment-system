package com.software.Phase2.Service;

import com.software.Phase2.ServiceProvider.*;

import java.util.ArrayList;
import java.util.List;

public class InternetPayment extends Service{
    public List<ServiceProvider> serviceProvider=new ArrayList<ServiceProvider>(List.of(new Vodafone(),
            new Etisalat(),new Orange(),new We()));

    @Override
    public String getServiceName() {
        return "InternetPayment";
    }

    @Override
    public List<ServiceProvider> getServiceProvider() {
        return serviceProvider;
    }
}
