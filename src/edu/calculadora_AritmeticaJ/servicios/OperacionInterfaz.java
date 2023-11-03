package edu.calculadora_AritmeticaJ.servicios;

import java.util.Scanner;
/*
 * Interfaz que contiene la cabezera de los metodos
 * 031123
 * @author msm
 */

public interface OperacionInterfaz {
	
	/*
	 * Metodo suma 
	 * 031123
	 * @author msm
	 */
	public void suma (Scanner comunciacionNumero);
	
	/*
	 * Metodo resta 
	 * 031123
	 * @author msm
	 */
	public void resta(Scanner comunciacionNumero);
	
	/*
	 * Metodo multiplicacion 
	 * 031123
	 * @author msm
	 */
	public void multiplicacion(Scanner comunciacionNumero);
	
	/*
	 * Metodo division, y el resto 
	 * 031123
	 * @author msm
	 */
	public void division(Scanner comunciacionNumero);
	
	 

}
