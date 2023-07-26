package com.cakmak.designPattern.abstractFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		IAbstractFactory audiFactory = new AudiFactory();
		IAbstractFactory bmwFactory = new BMWFactory();


		ICar audiCar = audiFactory.createCar("Beyaz", 500000);
		ICar bmwCar = bmwFactory.createCar("Siyah", 420000);

		IMotorCycle audiMotorCycle = audiFactory.createMotorCycle("Yarış Motoru", 125000);
		IMotorCycle bmwMotorCycle = bmwFactory.createMotorCycle("Cadde Motoru", 24000);

		System.out.println("Audi Car Color: " + audiCar.getColor());
		System.out.println("Audi Car Price: " + audiCar.getPrice());
		System.out.println();
		System.out.println("BMW Car Color: " + bmwCar.getColor());
		System.out.println("BMW Car Price: " + bmwCar.getPrice());
		System.out.println();
		System.out.println("Audi Motor Cycle Type: " + audiMotorCycle.getType());
		System.out.println("Audi Motor Cycle Price: " + audiMotorCycle.getPrice());
		System.out.println();
		System.out.println("BMW Motor Cycle Type: " + bmwMotorCycle.getType());
		System.out.println("BMW Motor Cycle Price: " + bmwMotorCycle.getPrice());
	}

}
