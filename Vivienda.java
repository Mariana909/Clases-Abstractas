/*
 * Duque Karla-Oviedo Daniel
 */

package ejercicio1;

public class Vivienda extends Cuenta implements IDepositable {
	private long precioV;
	private String tipo;
	
	@Override
	public String toString() {
		return super.toString()+" Vivienda Precio de Venta: " + precioV + ", Tipo: " + tipo;
	}

	public Vivienda(int numCuenta, int anioApertura, Titular titular, long precioV, String tipo) {
		super(numCuenta, anioApertura, titular);
		this.precioV = precioV;
		this.tipo = tipo;
	}

	@Override
	public void deposito(long valor) {
		// TODO Auto-generated method stub
		if(valor>0) {
			this.saldo+=valor;
			System.out.println("Saldo: "+saldo);
		}else {
			System.out.println("No es posible depositar valores negativos");
		}
	}
	
}
