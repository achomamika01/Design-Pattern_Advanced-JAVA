package com.AbstractFactorypattern;

public class GasolineVehicleFactory implements VehicleFactory {

	@Override
	public Car createcar() {
		// TODO Auto-generated method stub
		return new GasolineCar();
	}

	@Override
	public Truck createTruck() {
		// TODO Auto-generated method stub
		return new GasolineTruck();
	}

	

}
