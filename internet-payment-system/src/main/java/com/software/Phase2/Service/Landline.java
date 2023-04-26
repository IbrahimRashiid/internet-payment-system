package com.software.Phase2.Service;

import com.software.Phase2.ServiceProvider.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Landline extends Service {

    public List<ServiceProvider> serviceProvider=new ArrayList<ServiceProvider>(List.of(new MonthlyReceipt(),new QuarterReceipt()));

    @Override
    public String getServiceName() {
        return "LandLine";
    }

    @Override
    public List<ServiceProvider> getServiceProvider() {
        return serviceProvider;
    }

}
