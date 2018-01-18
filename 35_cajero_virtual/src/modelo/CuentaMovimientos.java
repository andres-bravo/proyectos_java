package modelo;
import java.util.ArrayList;
import modelo.Movimiento;
public class CuentaMovimientos extends Cuenta{
	private ArrayList<Movimiento> movimientos = new ArrayList();
	private double limite;
	public CuentaMovimientos(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}
	/*
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
	*/
	@Override
	public void ingresar(double cant) {
		// TODO Auto-generated method stub
		super.ingresar(cant);
		Movimiento mov = new Movimiento("Ingreso",cant);
		movimientos.add(mov);
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	@Override
	public void extraer(double cant) {
		// TODO Auto-generated method stub
		super.extraer(cant);
		Movimiento mov = new Movimiento("Extraccion",cant);
		movimientos.add(mov);
	}
	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return super.getSaldo();
	}
	public ArrayList<Movimiento> listaMovimientos(){
		return movimientos;
	}
	
	
	
}
