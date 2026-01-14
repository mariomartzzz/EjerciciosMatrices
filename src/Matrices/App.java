package Matrices;

import java.util.Scanner;

public class App {
	Scanner teclado= new Scanner(System.in);
	public App() throws Exception {
		
		int opcion;
		do {
		System.out.println("App para operar matrices:");
		System.out.println();
		System.out.println("1) Sumar Matrices.");
		System.out.println("2) Multiplicar Matrices.");
		System.out.println("Otra opción: salir.");
		opcion= teclado.nextInt();
		switch (opcion) {
		case 1:
			Matrices.sumaMatrices();
			break;
		case 2:
			Matrices.multiplicarMatrices();
			break;
		default:
			System.out.println("Saliendo de la aplicación...");
		}
		
		}while (opcion>0 && opcion<3);

	}
	
	public static void main(String[] args) throws Exception {
		App a= new App();
	}
}//comentario para github
