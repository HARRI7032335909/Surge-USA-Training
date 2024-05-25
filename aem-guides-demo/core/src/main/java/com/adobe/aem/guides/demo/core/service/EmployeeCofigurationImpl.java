package com.adobe.aem.guides.demo.core.service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true,enabled = true,service =EmployeeCofigurationImpl.class )
@Designate(ocd = EmployeeConfiguration.class)
public class EmployeeCofigurationImpl {
   public String name;
   public int id;
    public double salary;

    private static  final Logger LOG= LoggerFactory.getLogger(EmployeeCofigurationImpl.class);
    @Activate
    public void activate(EmployeeConfiguration cofig)
    {
        LOG.info("activate () started");
        updatConfiguaration(cofig);
    }
    @Deactivate
    public void deActivate(EmployeeConfiguration cofig)
    {
        LOG.info("deActivate () started");
    }
    @Modified
    public void update(EmployeeConfiguration cofig){
        LOG.info("update () started");
    }
    public void updatConfiguaration(EmployeeConfiguration cofig)
    {
        this.name=cofig.name();    //instance variable initialization
        this.id=cofig.id();
        this.salary=cofig.salary();
        LOG.info("name {},id {},salary {} ",name,id,salary);
    }

}
