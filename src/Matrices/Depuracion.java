package Matrices;

public class Depuracion {
	private static boolean DEPURACION=true;
	
	public static void imprimirTraza(String mensaje) {
		if(DEPURACION==true)
			System.err.println("[TRAZA] "+mensaje);
	}

}
