package com.javastreams;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    int id;
    String name;
    String tier;

    public Employee(int id, String name, String tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    List<Address>addlist=new ArrayList<>();

    public List<Address> getaddlistList() {
        return addlist;
    }

    public void setaddlistist(List<Address> addlist) {
        this.addlist = addlist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }
}
