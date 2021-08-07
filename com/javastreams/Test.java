package com.javastreams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Employee> employeeList = EmpployeeService.getAllEmployee();

        //// to get only List of  employee as output out of matching one parameter off its list of address
        List<Employee> employeeList1 = employeeList.stream().filter(employee ->
              employee.getaddlistList().stream().anyMatch(address -> address.addressId==11)).collect(Collectors.toList());
        System.out.println(employeeList1.size());


       // to get only one employee out of matching one paramatere of its list of address
       Employee employee_= employeeList.stream().filter(employee -> employee.getaddlistList().stream().anyMatch(address -> address.getAddressId()==11)).findAny().get();
       // System.out.println(employee_.getName());


        // to get only one employee name out of matching one paramatere of its list of address with help of :: operator
        String employee_name_= employeeList.stream().filter(employee -> employee.getaddlistList().stream().anyMatch(address -> address.getAddressId()==33)).findAny().map(Employee::getName).get();
        //System.out.println(employee_name_);


        //to get only address object from list of Address objects in list of employees
        Address address_1=employeeList.stream().map(employee -> {
            Address address_result = employee.getaddlistList().stream().filter(address -> address.addressId == 11).findAny().get();
            return address_result;
        }).findAny().get();
         System.out.println(address_1.getAddressLine1());


    }
}
