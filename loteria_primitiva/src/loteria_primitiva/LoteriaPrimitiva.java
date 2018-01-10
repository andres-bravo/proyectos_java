package loteria_primitiva;

import java.util.Arrays;
public class LoteriaPrimitiva {
	private static boolean repetido(int[] numeros, int numero) {
		for (int i:numeros) {
			if (numero==i) {
				return true;
			}
		}
		return false;
	}
	private static void mostrar(int[] numeros) {
		Arrays.sort(numeros);
		for (int i:numeros) {
			System.out.println(i);
			//System.out.println("posicion: " + Arrays.binarySearch(numeros, 50));
		}
	}
	
	public static void main(String[] args) {
		int[] numeros = new int[6];
		int contador = 0;
		while (contador<6) {
			int numero = (int)Math.floor(Math.random()*49+1);
			if (!repetido(numeros,numero)){ //Puede ser reemplazado por binarySearch pero primero ordenar
				numeros[contador]=numero;
				contador++;
			}
		}
		//System.out.println("posicion: " +Arrays.binarySearch(numeros, 0));
		mostrar(numeros);
		/*Arrays.sort(numeros);
		for (int i:numeros) {
			System.out.println(i);
			//System.out.println("posicion: " + Arrays.binarySearch(numeros, 50));
		}*/
		
	}
}
