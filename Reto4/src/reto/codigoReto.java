package reto;

import java.util.Scanner;


import reto.Funciones;


public class codigoReto {

	public static void main(String[] args) {
	
		// Esto es el main pero no funciona
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		do {
		System.out.println("Selecciona el tipo de conversion");
		System.out.println("1.Longitud");
		System.out.println("2.Peso");
		System.out.println("3.Temperatura");
		System.out.println("4.Volumen");
		System.out.println("0.Salir");
		opcion =Funciones.opcion("Elige una opción", sc);
		
		switch(opcion) {
		case 1:
			Funciones.menuLongitud();//menu lonmgitud
			break;
		case 2:
			Funciones.menuPeso(); //menu peso
		case 3:
			Funciones.menuTemperatura();// menu Temperatura
			
		case 4:
			Funciones.menuVolumen();
		}
	
		
		}while(Funciones.opcion==0);

	}
	}


