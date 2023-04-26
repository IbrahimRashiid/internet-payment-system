package com.software.Phase2.Service;

import com.software.Phase2.ServiceProvider.ServiceProvider;

import java.util.ArrayList;
import java.util.List;

public   class Service {
    private String serviceName;
    public List<ServiceProvider>serviceProvider=new ArrayList<ServiceProvider>();

    private double cost ;
    private double discount ;


    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public List<ServiceProvider> getServiceProvider() {
        return serviceProvider;
    }

    public Service() {
    }
}
