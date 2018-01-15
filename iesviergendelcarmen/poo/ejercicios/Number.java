package com.iesviergendelcarmen.poo.ejercicios;
// import static java.lang.Math.*; Esto se usa para añadir math al espacio de nombre y poder quitarlo de todas la clases.
public class Number {
	private double data;

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Number [data=" + data + "]";
	}
	public double calculatedSquareRootofData() {
		return Math.sqrt(data);
	}
	public double calculatedCubicRootOfAbsoluteData() {
		return Math.cbrt(Math.abs(data));
	}
	public int getRoudAbsoluteData () {
		return (int) Math.round(Math.abs(data)); /// como este metodo de math retorna un double hay que hacerle un casting a int
	}
	public int getRandomOfZeroToRoudData () {
		int number = getRoudAbsoluteData();
		int randomNumber = (int) (Math.random() * (number + 1));
		
		return randomNumber;
	}
}
