package Arrise;

import java.util.Scanner;

public abstract class Ejemplos {

	public static int generarNumeroAleatorio(int minimo, int maximo) {
		
		double r=Math.random()*(maximo-minimo);
		int r2=(int)r+minimo;
		return r2;	
	}
	
	public static void imprirArrayAleatorio(int longitud) {
		Scanner t=new Scanner(System.in);
		String arrayString[]=new String[longitud];
		String cadena="";
		
		;
		
		for(int i=0;i<arrayString.length;i++) {
			System.out.println("Introduce el nombre de la persona "+(i+1)+":");
			arrayString[i]=t.next();
			cadena+="Persona "+(i+1)+" se llama "+arrayString[i]+"\n";
			
		
		}System.out.println(cadena);
		System.out.println("");
		Ejemplos.imprimirArrayInverso(arrayString);	
		}
	
	public static void imprimirArrayEnterosAleatorios(int longitud) {
		int arrayEnteros[]=new int[longitud];
		String cadena="{";
		for(int i=0;i<longitud;i++) {
		int r=Ejemplos.generarNumeroAleatorio(0,9);
		arrayEnteros[i]=r;
		cadena+=r;
		if(i<longitud-1)
			cadena+=",";
		
		
		}
		cadena+="}";
		System.out.println(cadena);
		
	}
	public static void imprimirArrayPersonasIndefinidas(int longitud) {
		Scanner t=new Scanner(System.in);
		String cadena="";
		String arrayPersonas[]=new String[longitud];
		for(int i=0;i<longitud;i++) {
			System.out.println("Introduce el nombre de la persona "+(i+1)+":");
			arrayPersonas[i]=t.next();
			cadena+="La persona "+(i+1)+" se llama "+arrayPersonas[i]+"\n";
		}
		System.out.println(cadena);
			
	}
	
	public static void imprimirArrayInverso(String arrayString[]) {
		
				for(int i=(arrayString.length-1);i>=0;i--) {
					System.out.println(arrayString[i]);
					
					
				}
		
	}
	
	
	}

