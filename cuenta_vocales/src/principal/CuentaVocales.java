package principal;

import java.util.Scanner;

public class CuentaVocales {
	
	private static int cuentaVocales(String cadena) {
		char[] vocales = {'a','e','i','o','u','A','E','I','O','U','á'};
		int contador = 0;
		for (int i=0;i<cadena.length();i++) {
			char c=cadena.charAt(i);
			for (char checkchar:vocales) {
				if (checkchar==c) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		String cadena = new String();
		String cadenaMinuscula = new String();
		System.out.println("Introduce frase:");
		cadena = sc.nextLine();
		System.out.println(cadena);
		cadenaMinuscula = cadena.toLowerCase();
		System.out.println("Numero de vocales: " + cuentaVocales(cadena));
	}

}
