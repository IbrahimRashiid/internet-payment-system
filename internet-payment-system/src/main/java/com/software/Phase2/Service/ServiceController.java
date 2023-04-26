package com.software.Phase2.Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class ServiceController {
   ServiceOperation serviceOperation=new ServiceOperation();
    @GetMapping(value="/getService/")
    public Service getService(@PathParam("serviceName") String serviceName)
    {
       return serviceOperation.getService(serviceName);
    }

}
