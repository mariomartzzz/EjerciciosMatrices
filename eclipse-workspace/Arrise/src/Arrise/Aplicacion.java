package Arrise;

import java.util.Scanner;

public class Aplicacion {

	public Aplicacion(){
		int opcion=-1;
		Scanner s=new Scanner(System.in);
		
		do {
			
			System.out.println("Escoge una opción:");
			System.out.println("0) Salir");
			System.out.println("1) Generar cien número aleatorio");
			System.out.println("2) Generar array");
			
			opcion=s.nextInt();
			switch (opcion) {
			case 0:
				System.out.println("salir");
				break;
			case 1:
				for(int i=0;i<100;i++)
				System.out.println(Ejemplos.generarNumeroAleatorio(1, 10));
				break;
			case 2:
				Ejemplos.imprirArrayAleatorio(5);
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			
			
			}
		}while(opcion>0 && opcion<3);
		
		
	}
	
	public static void main(String[] args) {
		Aplicacion a =new Aplicacion();

	}

}
