package edu.calculadora_AritmeticaJ.servicios;

import java.util.Scanner;
/*
 * Clase que contiene la logica de los metodos 
 * 031123
 * @author msm
 */
public class MenuImplementacion implements MenuInterfaz {
	
	public int mostrarMenuYRespuesta(Scanner comunicacionTeclado){
		
		int opcionSeleccionada;
		
		System.out.println("##################");
		System.out.println("1 - SUMA");
		System.out.println("2 - RESTA");
		System.out.println("3 - MULTIPLICACION");
		System.out.println("4 - DIVISION");
		System.out.println("5 - Cerrar Menu");
		System.out.println("");
		System.out.println("Elige opcion");
		System.out.println("##################");
		
		opcionSeleccionada = comunicacionTeclado.nextInt();
		
		return opcionSeleccionada;

	}
}
