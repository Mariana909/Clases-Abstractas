/*
 * Duque Karla-Oviedo Daniel
 */

package ejercicio1;

public class Cuenta {
	protected int numCuenta;
	protected int anioApertura;
	protected Titular titular;
	protected long saldo;
	public Cuenta(int numCuenta, int anioApertura, Titular titular) {
		super();
		this.numCuenta = numCuenta;
		this.anioApertura = anioApertura;
		this.titular = titular;
	}
	@Override
	public String toString() {
		return "Cuenta Numero de Cuenta: " + numCuenta + ", Año de Apertura: " + anioApertura + ",\n" + titular + ", Saldo: "
				+ saldo;
	}

}
