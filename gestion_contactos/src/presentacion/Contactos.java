package presentacion;

import java.util.Scanner;

import modelo.GestionContactos;


public class Contactos {

	public static void main(String[] args) {
		GestionContactos gcontactos=new GestionContactos();		
		//creamos Objeto de la clase Scanner leer opciones menu
		Scanner sc = new Scanner(System.in);
		String nombre = new String();
		String email = new String();
		int opcion = 0;
		double nota = 0;
		//Variable global de gestion de notas
		//ArrayList<Integer> notas = new ArrayList<>();
		while (opcion!=5) {
			System.out.println("Menu opciones");
			System.out.println("1.-Añadir Contacto.");
			System.out.println("2.-Buscar Contacto");
			System.out.println("3.-Nota Media");
			System.out.println("4.-Mostrar Todas");
			System.out.println("5.-Salir");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion){
	    	case 1:
	    		//
	    		System.out.println("Introducir nota a añadir");
	    		nombre = sc.nextLine();
	    		email = sc.nextLine();
	    		if (gcontactos.agregarContacto(email, nombre)) {
	    			System.out.println("Añadido");
	    		}else {
	    				System.out.println("Email repetido.");
	    		}
	    		break;
	    	case 2:
	    		//Buscar contacto
	    		nombre = gcontactos.buscarContacto(email);
	    		System.out.println(nombre);
	    		break;
	    	case 3:
	    		//Llamar a notaMedia
	    		System.out.println("Nota Media:" + gnotas.media());
	    		break;
	    	case 4:
	    		//Llamar a mostrarTodas
	    		System.out.println("Listado de notas");
	    		mostrarNotas(gnotas.devolverNotas());
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

}
