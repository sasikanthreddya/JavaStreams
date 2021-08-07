package com.javastreams;

public class Address {
    String zipcode;
    String addressLine1;
    int addressId;

    @Override
    public String toString() {
        return "Address{" +
                "zipcode='" + zipcode + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressId=" + addressId +
                '}';
    }

    public Address() {
    }

    public Address(String zipcode, String addressLine1, int addressId) {
        this.zipcode = zipcode;
        this.addressLine1 = addressLine1;
        this.addressId = addressId;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
}
