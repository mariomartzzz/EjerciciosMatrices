package Matrices;

import java.util.Scanner;

public class Matrices {
	Scanner t = new Scanner(System.in);
	// public static boolean DEPURACION = false;

	private static int[][] crearMatriz(int filas, int columnas, int vMin, int vMax) {
		int matriz[][] = new int[filas][columnas];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numeroAleatorio(vMin, vMax);
			}
		}
		Depuracion.imprimirTraza(toString(matriz));
		return matriz;
	}

	private static int numeroAleatorio(int vMin, int vMax) {
		int a = (int) (Math.random() * vMax);
		return a;
	}

	private static String toString(int[][] array) {
		String cadena = "{";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				cadena += (array[i][j] + " ");

			}
			cadena += " Salto de linea ";

		}
		cadena += "}";
		return cadena;

	}

	private static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void sumaMatrices() throws Exception {

		Scanner t = new Scanner(System.in);

		int filas1, columnas1, filas2, columnas2;
		System.out.println("Introduce el número de filas de la primera matriz");
		filas1 = t.nextInt();
		System.out.println("Introduce el número de columnas de la primera matriz");
		columnas1 = t.nextInt();
		System.out.println("Introduce el número de filas de la segunda matriz");
		filas2 = t.nextInt();
		System.out.println("Introduce el número de columnas de la segunda matriz");
		columnas2 = t.nextInt();
		if (filas1 == filas2 && columnas1 == columnas2) {
			int[][] matriz1 = crearMatriz(filas1, columnas1, 0, 9);
			int[][] matriz2 = crearMatriz(filas2, columnas2, 0, 9);
			int filas = matriz1.length;
			int columnas = matriz1[0].length;

			int resultado[][] = new int[filas][columnas];

			for (int i = 0; i < matriz1.length; i++) {
				for (int j = 0; j < matriz1[i].length; j++) {
					resultado[i][j] = matriz1[i][j] + matriz2[i][j];
				}
			}
			System.out.println("Resultado de la suma de las matrices ");
			imprimirMatriz(matriz1);
			System.out.println("");
			imprimirMatriz(matriz2);
			System.out.println("=");
			imprimirMatriz(resultado);
		} else
			throw new Exception("Las dimansiones de las matrices han de ser iguales.");

	}

	public static void multiplicarMatrices() throws Exception {
		Scanner t = new Scanner(System.in);

		int filas1, columnas1, filas2, columnas2;
		System.out.println("Introduce el número de filas de la primera matriz");
		filas1 = t.nextInt();
		System.out.println("Introduce el número de columnas de la primera matriz");
		columnas1 = t.nextInt();
		System.out.println("Introduce el número de filas de la segunda matriz");
		filas2 = t.nextInt();
		System.out.println("Introduce el número de columnas de la segunda matriz");
		columnas2 = t.nextInt();
		if (columnas1 == filas2) {
			int[][] matriz1 = crearMatriz(filas1, columnas1, 0, 9);
			int[][] matriz2 = crearMatriz(filas2, columnas2, 0, 9);
			Depuracion.imprimirTraza(toString(matriz1));
			Depuracion.imprimirTraza(toString(matriz2));
			int filas = matriz1.length;
			int columnas = matriz2[0].length;

			int[][] resultado = new int[filas][columnas];

			for (int i = 0; i < matriz1.length; i++) { // Recorre filas de A
				for (int j = 0; j < matriz2[0].length; j++) { // Recorre columnas de B
					for (int k = 0; k < matriz1[0].length; k++) { // Recorre el factor común (n)
						resultado[i][j] += matriz1[i][k] * matriz2[k][j];

					}
				}
			}
			System.out.println("Resultado de la multiplicación de las matrices ");
			imprimirMatriz(matriz1);
			System.out.println("");
			imprimirMatriz(matriz2);
			System.out.println("=");
			imprimirMatriz(resultado);

		} else
			throw new Exception("El número de columnas de la primera matriz ha de ser igual al numero de filas de la segunda.");
	}

}
