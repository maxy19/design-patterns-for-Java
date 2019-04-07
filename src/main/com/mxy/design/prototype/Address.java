package com.mxy.design.prototype;

public class Address implements Cloneable {

    private String addressName;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append(", addressName='").append(addressName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
