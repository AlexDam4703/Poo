package com.iesvirgendelcarmen.poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class testRectangle {

	public static void main(String[] args) {
		int heigth;
		int width;
		Scanner sc = new Scanner (System.in);
		System.out.printf("heigth:");
		heigth = sc.nextInt();
		System.out.printf("width: ");
		width = sc.nextInt();
		sc.close();
		
		Rectangle rectangle1 = new Rectangle();
		rectangle1.setWidth(width);
		rectangle1.setHeight(heigth);
		
		System.out.printf("Area: %d and Perimeter: %d%n%n",rectangle1.getArea() , rectangle1.getPerimeter());
		//Esta cadena se crea añadiendole al objeto la clase toString
		System.out.println(rectangle1);
		
		//Creamos dos nuevos objetos.
		Rectangle rectangle2 = new Rectangle ();
		Rectangle rectangle3 = new Rectangle();
		rectangle2.setHeight(50);
		rectangle2.setWidth(25);
		rectangle3.setHeight(15);
		rectangle3.setWidth(10);
		
		System.out.println(rectangle2);
		System.out.println(rectangle3);
		
		//Creamos dos colecciones una que sera un vector y otra que sera una lista donde guardar los datos.
		//vector
		Rectangle [] vectorRectangle = new Rectangle [3];
		vectorRectangle [0] = rectangle1;
		vectorRectangle [1] = rectangle2;
		vectorRectangle [2] = rectangle3;
		//arrayList
		ArrayList<Rectangle> rectangleList = new ArrayList <>();
		rectangleList.add(rectangle1);
		rectangleList.add(rectangle2);
		rectangleList.add(rectangle3);
		
		// Imprimir las colecciones.
		 System.out.println(Arrays.toString(vectorRectangle));
		 System.out.println(rectangleList);
		//LLamamos a los metodos
		 System.out.printf("Average areas is: %f%n ", getAverageAreas(vectorRectangle));
	}
	//Método que al pasarle una colección de objetos rectángulos nos dara el valor medio de las areas.
	public static double getAverageAreas (Rectangle [] rectangleVector) {
		double sum = 0;
		for (Rectangle rectangle : rectangleVector) {
			sum += rectangle.getArea();
		}
		return sum / rectangleVector.length;
	}//metodo que nos de la media de los perimetros pasandole una lista 
	// otro metodo que nos retorne el rectangulo que tenga el area mas grande
}
