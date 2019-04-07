package com.mxy.design.flyweight;

public class BikeServiceImpl implements BikeService {


    private String name;

    public BikeServiceImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("自行车名称:"+name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FlyWeightServiceImpl{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
