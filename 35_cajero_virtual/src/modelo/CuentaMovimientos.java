package modelo;
import java.util.ArrayList;
import modelo.Movimiento;
public class CuentaMovimientos extends Cuenta{
	private ArrayList<Movimiento> movimientos = new ArrayList();
	private int limite;
	public CuentaMovimientos(double saldo, int limite) {
		super(saldo);
		this.limite = limite;
	}
	public boolean nuevoMovimiento(String tipo, double cantidad) {
		if (cantidad>this.limite) {
			return false;
		}
		Movimiento mov = new Movimiento(tipo,cantidad);
		movimientos.add(mov);
		if (tipo == "Ingresar") {
			this.ingresar(cantidad);
		}else this.extraer(cantidad);
		return true;
	}
	public ArrayList<Movimiento> listaMovimientos(){
		return movimientos;
	}
	
	
	
}
