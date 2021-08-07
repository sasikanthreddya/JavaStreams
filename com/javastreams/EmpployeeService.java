package com.javastreams;

import java.util.ArrayList;
import java.util.List;

public class EmpployeeService {
    public static List<Employee> getAllEmployee(){
        List<Employee> employeeList=new ArrayList<>();
        Employee e1=new Employee(1,"Sasi","Senior Software Engineer",5);
        Employee e2=new Employee(2,"ram","Associate Software Engineer",3);
        Employee e3=new Employee(3,"Sridhar","Senior Software Engineer",10);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.forEach(employee -> {
           if( employee.getExp()>8){
               employee.setTier("Team lead");
               Address address=new Address("Hyd","Jubilee hills",11);
               employee.getaddlistList().add(address);
            }
            if( employee.getExp()<8&&employee.getExp()>=3){
                Address address=new Address("Panjagutta","circle",33);
                employee.getaddlistList().add(address);
            }
        });  return employeeList;
    }
}
