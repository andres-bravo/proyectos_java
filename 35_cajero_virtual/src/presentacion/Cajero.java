package presentacion;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Movimiento;
import modelo.CuentaMovimientos;

/*
 * Al inicial el programa, se solicita al usuario el saldo inicial y el 
 * límite de la cuenta (máxima cantidad a extraer en un proceso)
 * Con herencia a partir de Cuenta hacer todo esto.
 * Una vez solicitado límite de la cuenta motrar el menu:
 * 1. Ingresar
 * 2. Extraer
 * 3. Movimientos y saldo
 * 4. Salir
 * 
 * 1. Se solicita la cantidad a ingresar y se procede al ingreso
 * 2. Se solicita la cantidad a extraer, si es inferior o igual al límite
 * se realiza la extraccion. si no no se hace
 * 3. Muestra los movimientos realizados en la cuenta y el saldo final.
 * Cada movimiento se caracteriza por un tipo (ingreso o extraccion) y una cantidad.
 */
public class Cajero {

	public static void main(String[] args) {
		int op;
		double saldo;
		int limite;
		int cantidad;
		boolean resultado;
		ArrayList<Movimiento> mov = new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca Saldo Incial");
		saldo = Double.parseDouble(sc.nextLine());
	    System.out.println("Introduzca Limite en Cajero");
	    limite = 
		do{
			System.out.println("1.- Ingresar");
		    System.out.println("2.- Extraer");
		    System.out.println("3.- Movimientos y Saldo");
		    System.out.println("4.- Salir");
		    op=Integer.parseInt(sc.nextLine());
		    switch(op){
		    	case 1:
		    		System.out.println("Cantidad a Ingresar:");
		            cantidad=Integer.parseInt(sc.nextLine());
		            
		            
		            
		            break;
		        case 2:
		        	/*
		        	System.out.println("Email:");
		            email=sc.nextLine();
		            Contacto con= gcontactos.buscarContacto(email);
		            if(con!=null) {
		            	System.out.println(con.getNombre()+","+con.getEmail()+","+con.getTelefono()); 
		                }else {
		                	System.out.println("Contacto no encontrado"); 
		                }*/
		            break;
		        case 3:
		        	/*
		        	 System.out.println("Email:");
		             email=sc.nextLine();
		             if(gcontactos.eliminarContacto(email)) {
		            	 System.out.println("Contacto eliminado!"); 
		             }else {
		            	 System.out.println("No existe ese email!"); 
		             }*/
		             break;
		        case 4:
		        	/*
		        	Contacto[] todos=gcontactos.recuperarContactos();
		        	for(Contacto s:todos) {
		        		System.out.println(s.getNombre()+","+s.getEmail()+","+s.getTelefono());
		            }*/
		        	break;
		        default:
		            System.out.println("debes escribir una opción válida");
		        }
		    }while(op!=4);
	}

}
