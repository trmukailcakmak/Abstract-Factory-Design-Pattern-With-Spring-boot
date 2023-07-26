package com.cakmak.designPattern.abstractFactory;

public class BMWMotorCycle implements IMotorCycle{
    private String type;
    private double price;

    public BMWMotorCycle(String type, double price) {
        this.type = type;
        this.price = price;
    }
    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
