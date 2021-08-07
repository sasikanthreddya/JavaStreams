package com.javastreams;

import java.util.ArrayList;
import java.util.List;

public class EmpployeeService {
    public static List<Employee> getAllEmployee(){
        List<Employee> employeeList=new ArrayList<>();
        Employee e1=new Employee(1,"Sasi","Software Enginneer");
        Employee e2=new Employee(2,"ram","Senior Software Enginneer");
        Employee e3=new Employee(3,"laxman","Software Enginneer");
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.forEach(employee -> {
           if( employee.getTier().equalsIgnoreCase("Software Enginneer")){
               Address address=new Address("Hyd","SR nagar",11);
               employee.getaddlistList().add(address);
            }
            if( employee.getTier().equalsIgnoreCase("Senior Software Enginneer")){
                Address address=new Address("usa","pronince",33);
                employee.getaddlistList().add(address);
            }
        });  return employeeList;
    }
}
