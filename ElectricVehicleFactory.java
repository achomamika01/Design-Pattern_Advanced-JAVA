package com.AbstractFactorypattern;

public class ElectricVehicleFactory implements VehicleFactory {

	@Override
	public Car createcar() {
		// TODO Auto-generated method stub
		return new ElectricCar();
	}

	@Override
	public Truck createTruck() {
		// TODO Auto-generated method stub
		return new ElectricTruck();
	}

	@Override
	public Bike createBike() {
		// TODO Auto-generated method stub
		return new ElectricBike();
	}

}
