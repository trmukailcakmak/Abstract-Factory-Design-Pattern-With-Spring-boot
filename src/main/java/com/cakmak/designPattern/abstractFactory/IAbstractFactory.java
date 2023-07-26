package com.cakmak.designPattern.abstractFactory;

public interface IAbstractFactory {
    ICar createCar(String color, double price);
    IMotorCycle createMotorCycle(String type, double price);
}
