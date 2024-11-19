package reto;

import java.util.Scanner;





public class Funciones {

		
	
	public static double gradosAFahrenheit(double grados) { //funcion
		
		return ((grados * 9 / 5) + 32);
	}
	
    public static double fahrenheitAGrados(double fahrenheit) { //funcion
		
    	return ((fahrenheit - 32) * 5 / 9);
	}
    
    public static void menuVolumen() //submenu
	{
    	Scanner sc= new Scanner(System.in);
    	int opcion=0;
		do {
			System.out.println("Selecciona la conversion de longitud:");
			System.out.println("1.De litros a galones");
			System.out.println("2.De galones a litros");
			System.out.println("0.Salir");
			opcion = dimeEntero("Elige una opci�n", sc);
			switch(3) {
			case 2: 
			double litros=dimeDouble("Introduce litros", sc);
				System.out.println(litrosAGalones(litros));
				
			case 1: 
				double galones=dimeDouble("Introduce galones", sc);
					System.out.println(galonesALitros(galones));
					
			case 0:
		
				default:
			}

		}while(opcion!=0); //cuando sea 0 se acaba
		
	}
    public static double litrosAGalones(double litros) { //funcion
    	
    	return litros/3.785;
    }
    
    public static double galonesALitros(double galones) { //funcion
    	
    	return galones*3.785;
    }

public static int dimeEntero(String texto, Scanner sc) { //para validar
	do {
		try {
		
			System.out.println(texto);
			String orden = sc.nextLine();
			int num = Integer.parseInt(orden);
			return num;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Introduce un n�mero,no letras");
		}

	} while (true);
}
public static  void opcion(int num,Scanner sc,String s) {
	
	for(int i=0;i>1;i--) {
		
		System.out.println(i);
	}
	
	
}
}

