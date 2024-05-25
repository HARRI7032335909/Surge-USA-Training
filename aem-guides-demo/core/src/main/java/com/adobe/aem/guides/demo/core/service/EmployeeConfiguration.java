package com.adobe.aem.guides.demo.core.service;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition
public @interface EmployeeConfiguration {
    @AttributeDefinition
            (name = "harikrishna",
            description = "harikrishna from surge",
                    required = true,
                    defaultValue = "EmployeeName"
            )
    public String name();
    @AttributeDefinition
            (name = "Employeeid",
                    description = "Surge Employee id",
                    required = true,
                    defaultValue = "9999"
            )
    public int id();
    @AttributeDefinition
            (name = "Employeesalary",
                    description = "Surge Employee salary",
                    required = true,
                    defaultValue = "5000"
            )
    public double salary();
}
