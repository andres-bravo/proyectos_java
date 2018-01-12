package modelo;

import java.util.Collection;
import java.util.HashMap;

public class GestionContactos {
	//Atributos que necesito en esta capa
	//almacen notas
	HashMap<String,String> contactos; 
	//Metodos que necesito
	//Constructor
	public GestionContactos(){
		contactos = new HashMap<>();
	}
	//Funciones del programa
	public boolean agregarContacto(String email, String nombre) {
		if (!contactos.containsKey(email)) {
			contactos.put(email, nombre);
			return true;
		}
		else {
			return false;
		}
	}
	public String buscarContacto(String email) {
		//Devuelve null
		return contactos.get(email);
	}
	public boolean eliminarContacto(String email) {
		return (contactos.remove(email)!=null);
	}
	
	public String[] recuperarContactos(){
		String[] listacontactos;
		Collection<String> nombres=contactos.values();
		//recorrer la tabla
		return(nombres.toArray(new String[0]));		
	}
}
