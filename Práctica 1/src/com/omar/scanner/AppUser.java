package com.omar.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppUser {
	
	static Scanner sc = new Scanner(System.in);
	static Ecuation ecuation = new Ecuation();
	
	public String getNombre() {
		String name = null;
		System.out.println("Bienveido a la calculadora de ecuaciones de segundo grado");
		System.out.println("Díganos su nombre por favor: ");
		name = sc.nextLine();
		return name;
	}
	
	public void program(String name) {
		System.out.println("Bienvenido " + name + " necesitaremos que nos indique los siguientes valores:");
		System.out.println("Introduzca los valores A, B y C de manera que Ax^2 + Bx + C");
		Integer a = null;
		Integer b = null;
		Integer c = null;
		String comprobante = null;
		try {
			System.out.println("A: ");
			a = sc.nextInt();
			System.out.println("B: ");
			b = sc.nextInt();
			System.out.println("C: ");
			c = sc.nextInt();
		} catch (InputMismatchException e) {
			comprobante = "N";
			System.out.println("Debe introducir un número entero");
		}
		
		if (comprobante == null) {
			System.out.println("Los valores son: ");
			System.out.println("A: " + a);
			System.out.println("B: " + b);
			System.out.println("C: " + c);
			System.out.println("¿Son estos datos correctos? S or N");
			sc.nextLine();
			comprobante = sc.next().toUpperCase();
		}
		
		switch (comprobante) {
		case "N":{
			System.out.println("Vuelva a introducir los datos por favor");
			sc.nextLine();
			program(name);
		}break;
		case "S":{
			String resultado = ecuation.calculo(a, b, c);
			System.out.println(name + ", los resultados de la ecuación " + a + "x^2+" + b +"x+" + c +" son los siguientes");
			System.out.println(resultado);
		}break;
		default:
			System.out.println("Vuelva a introducir los datos por favor");
			sc.nextLine();
			program(name);
		}
		
	}

}
