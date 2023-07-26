package com.cakmak.designPattern.abstractFactory;

public class AudiFactory implements IAbstractFactory{
    @Override
    public ICar createCar(String color, double price) {
        return new AudiCar(color, price);
    }

    @Override
    public IMotorCycle createMotorCycle(String type, double price) {
        return new AudiMotorCycle(type, price);
    }
}
