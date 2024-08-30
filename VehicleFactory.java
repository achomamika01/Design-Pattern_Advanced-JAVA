package com.AbstractFactorypattern;

public interface VehicleFactory {
	Car createcar();
	Truck createTruck();
	Bike createBike();

}
