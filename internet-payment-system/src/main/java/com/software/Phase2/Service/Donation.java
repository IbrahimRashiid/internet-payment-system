package com.software.Phase2.Service;

import com.software.Phase2.ServiceProvider.*;

import java.util.ArrayList;
import java.util.List;

public class Donation extends Service{
    public List<ServiceProvider> serviceProvider=new ArrayList<ServiceProvider>(List.of(new CancerHospital(),new Schools(),
            new NGOs()));

    @Override
    public String getServiceName() {
        return "Donation";
    }

    @Override
    public List<ServiceProvider> getServiceProvider() {
        return serviceProvider;
    }
}
