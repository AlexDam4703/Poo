package com.iesviergendelcarmen.poo.ejercicios;

public class Car {
	private  double fuelAmount = 5;
	private double consumption = 7;
	public double getFuelAmount() {
		return fuelAmount;
	}
	public void setFuelAmount(double fuelAmount) {
		this.fuelAmount = fuelAmount;
	}
	public double getConsumption() {
		return consumption;
	}
	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}
	public void addFuel(double fuel) {
		this.fuelAmount += fuel;
	}
	public double getAutonomy () {
		return (fuelAmount / consumption) * 100.0;
	}
	@Override
	public String toString() {
		return "Car [fuelAmount=" + fuelAmount + " and consumption=" + consumption + "]";
	}
	
}
