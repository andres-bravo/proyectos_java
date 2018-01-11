package gestion_notas_alumnos;

import java.util.ArrayList;
import java.util.Scanner;

	
public class GestionNotas {
	static ArrayList<Double> notas = new ArrayList<>();
	//Metodo añadir notas
	private static void anyadirNota(double nota) {
		notas.add(nota);
	}
	private static void mostrarTodas() {
		for (Double i:notas) {
			System.out.println(i);
		}
	}
	private static void verAprobados() {
		for (Double i:notas) {
			if (i>=5) 
				System.out.println(i);
		}		
	}
	private static void mostrarMedia() {
		double media=0;
		for (Double i:notas) {
			media+=i; 
		}
		System.out.println("La Media es:"+media/notas.size());
	}
	public static void main(String[] args) {
		//creamos Objeto de la clase Scanner leer opciones menu
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		double nota = 0;
		//Variable global de gestion de notas
		//ArrayList<Integer> notas = new ArrayList<>();
		while (opcion!=5) {
			System.out.println("Menu opciones");
			System.out.println("1.-Añadir nota.");
			System.out.println("2.-Ver Aprobados");
			System.out.println("3.-Nota Media");
			System.out.println("4.-Mostrar Todas");
			System.out.println("5.-Salir");
			opcion = sc.nextInt();
			switch (opcion){
	    	case 1:
	    		System.out.println("Introducir nota a añadir");
	    		nota = sc.nextDouble();
	    		//Llamar a Añadir
	    		anyadirNota(nota);
	    		break;
	    	case 2:
	    		//Llamar a visualizarAprobados
	    		verAprobados();
	    		break;
	    	case 3:
	    		//Llamar a notaMedia
	    		System.out.println("Nota Media");
	    		mostrarMedia();
	    		break;
	    	case 4:
	    		//Llamar a mostrarTodas
	    		System.out.println("Listado de notas");
	    		mostrarTodas();
	    		break;
	    	case 5:
	    		//Salir
	    		break;
	    	default:
	    		System.out.println("opción no válida");
			}
		}
		sc.close();
	}
}
