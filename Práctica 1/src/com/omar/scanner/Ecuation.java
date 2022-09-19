package com.omar.scanner;

public class Ecuation {
	
	public String calculo(Integer a, Integer b, Integer c) {
		
		Double x = (double) (b*b-4*a*c);
		
		
		if (x < 0) {
			return "El resultado no es real";
		}
		else {
			Double raiz = Math.sqrt(x);
			Double y = (-b + raiz)/2*a;
			Double z = (-b - raiz)/2*a;
			return "Los valores son " + y + " y " + z;
		}
	}

}
