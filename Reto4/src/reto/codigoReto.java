package reto;

import java.util.Scanner;


import reto.Funciones;


public class codigoReto {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		do {
		System.out.println("Selecciona el tipo de conversion");
		System.out.println("1.Longitud");
		System.out.println("2.Peso");
		System.out.println("3.Temperatura");
		System.out.println("4.Volumen");
		System.out.println("0.Salir");
		opcion =.dimeEntero("Elige una opción", sc);
		
		switch(opcion) {
		case 1:
			Funciones.menuLongitud();
			break;
		case 2:
			Funciones.menuPeso();
		case 3:
			Funciones.menuTemperatura();
			
		case 4:
			Funciones.menuVolumen();
		}
	
		
		}while(Funciones.=0);

	}
	}


