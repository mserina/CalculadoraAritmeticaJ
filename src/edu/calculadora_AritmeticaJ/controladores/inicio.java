package edu.calculadora_AritmeticaJ.controladores;

import java.util.Scanner;

import edu.calculadora_AritmeticaJ.servicios.MenuImplementacion;
import edu.calculadora_AritmeticaJ.servicios.MenuInterfaz;
import edu.calculadora_AritmeticaJ.servicios.OperacionImplementacion;
import edu.calculadora_AritmeticaJ.servicios.OperacionInterfaz;

/*
 * Clase principal pro donde se accede a la aplicacion
 * 031123
 * @author msm
 */
public class inicio {
	
	/*
	 * Metodo main,metodo que contiene el procedimiento de la aplicacion
	 * 031123
	 * @author msm
	 */
	public static void main(String[] args) {
		
		//Objetos		
		Scanner comunicacionKey = new Scanner(System.in);
		MenuInterfaz mi = new MenuImplementacion();
		OperacionInterfaz op = new OperacionImplementacion();
		
		//Variables
		boolean cerrarMenu = false;
		int seleccionUsuario;
		
		
		while(!cerrarMenu) {
			
			seleccionUsuario = mi.mostrarMenuYRespuesta(comunicacionKey);
			
			switch(seleccionUsuario){
			
			case 1:
				System.out.println("Has seleccionado la opcion suma");
				op.suma(comunicacionKey);
				break;
			case 2:
				System.out.println("Has seleccionado la opcion resta");
				op.resta(comunicacionKey);
				break;
			case 3:
				System.out.println("Has seleccionado la opcion multiplicacion");
				op.multiplicacion(comunicacionKey);
				break;
			case 4:
				System.out.println("Has seleccionado la opcion division");
				op.division(comunicacionKey);
				break;
			case 5:
				System.out.println("Cerrando menu");
				cerrarMenu = true;
				break;
			default:
				System.out.println("No existe esa opcion");
			}
		}
		
		
		
	}
}