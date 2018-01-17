package modelo;


import java.util.Collection;
import java.util.HashMap;
import beans.Contacto;

import beans.Contacto;

public class GestionContactos {
	HashMap<String,Contacto> agenda;
	boolean resultado;
	public GestionContactos() {
		agenda=new HashMap<>();
	}
	public boolean agregarContacto(Contacto contacto) {
		//se a�ade si la clave no est� ocupada
		return agregarContacto(contacto.getEmail(),contacto.getNombre(),contacto.getTelefono());
	}
	
	public boolean agregarContacto(String email, String nombre, int telefono) {
		//se a�ade si la clave no est� ocupada
		if(!agenda.containsKey(email)) {
			Contacto c = new Contacto(nombre,email,telefono);
			agenda.put(email, c);
			return true;
		}else {
			return false;
		}
	}	
	public Contacto buscarContacto(String email) {
		return agenda.get(email);
	}
	public boolean eliminarContacto(String email) {
		if(agenda.containsKey(email)) {
			agenda.remove(email);
			return true;
		}else {
			return false;
		}
	}
	public Contacto[] recuperarContactos() {
			
		Collection<Contacto> nombres=agenda.values();
		return nombres.toArray(new Contacto[0]);
	}
	public boolean buscarPorTelefono(int tel) {
		//La variable resultado tiene que ser global a la clase para poderla modificar
		//en la funcion lambda
		resultado=false;
		agenda.forEach((k,v)->{if (v.getTelefono() == tel) {
								int prueba = 5;
								resultado=true;
								}
							});
		return resultado;
	}
	public void cambiarDominio(String nuevo) {
		//replaceAll recibe un BiFunction y lo que implementamos es el m�todo apply de BiFunction
		//y devolvemos el objeto v modificado que coge replaceAll y es lo que escribe en el ArrayList.
		//Esto es solo teorico en este ejemplo ya que no puedo modificar la clave de un HashMap
		agenda.replaceAll((k,v)->{
			String email=v.getEmail();
			email=email.substring(0, email.lastIndexOf("."));
			email+="."+nuevo;
			v.setEmail(email);
			return v;
		});
	}
								
	
}
