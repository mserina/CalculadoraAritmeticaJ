package edu.calculadora_AritmeticaJ.servicios;

import java.util.Scanner;
/*
 * Clase que contiene la logica de los metodos 
 * 031123
 * @author msm
 */

public class OperacionImplementacion implements OperacionInterfaz {
	
	private double darNumero(Scanner comunciacionNumero) {
		
		double numero;
		System.out.println("Dame un numero");
		numero = comunciacionNumero.nextDouble();
		return numero;
	}
	
	public void suma (Scanner comunciacionNumero) {
		
		double n1 = darNumero(comunciacionNumero);
		double n2 = darNumero(comunciacionNumero);
		System.out.println("Resultado: ");
		System.out.println(n1 + n2);

	}
	
	public void resta(Scanner comunciacionNumero) {
		double n1 = darNumero(comunciacionNumero);
		double n2 = darNumero(comunciacionNumero);
		System.out.println("Resultado: ");
		System.out.println(n1 - n2);
	}
	
	public void multiplicacion(Scanner comunciacionNumero) {
		double n1 = darNumero(comunciacionNumero);
		double n2 = darNumero(comunciacionNumero);
		System.out.println("Resultado: ");
		System.out.println(n1 * n2);
	}
	
	public void division(Scanner comunciacionNumero) {
		double n1 = darNumero(comunciacionNumero);
		double n2 = darNumero(comunciacionNumero);
		System.out.println("Resultado: ");
		double division = n1 / n2;
		System.out.println("Resultado");
		System.out.println(division);
		System.out.println("Modulo de dvision:");
		System.out.println(n1 % n2);


		
	}

}
