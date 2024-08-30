package com.AbstractFactorypattern;

public class DieselVehicleFactory implements VehicleFactory {

	@Override
	public Car createcar() {
		// TODO Auto-generated method stub
		return new DieselCar();
	}

	
	

}
