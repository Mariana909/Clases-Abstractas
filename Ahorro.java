/*
 * Duque Karla-Oviedo Daniel
 */

package ejercicio1;

public class Ahorro extends Cuenta implements IRetirable,IDepositable{
	private double interesA;
	@Override
	public String toString() {
		return super.toString()+" Ahorro Interes Acumulado: " + interesA;
	}

	public Ahorro(int numCuenta, int anioApertura, Titular titular, double interesA) {
		super(numCuenta, anioApertura, titular);
		this.interesA = interesA;
	}

	@Override
	public void deposito(long valor) {
		// TODO Auto-generated method stub
		if(valor>0) {
			this.saldo+=valor;
			this.interesA+=(long) (saldo*0.03);
			System.out.println("Interes: "+interesA+" Saldo: "+saldo);
		}else {
			System.out.println("No es posible depositar valores negativos");
		}
	}

	@Override
	public void retiro(long valor) {
		// TODO Auto-generated method stub
		if(valor<=saldo)
		{
			this.saldo=saldo-valor;
			System.out.println("Interes: "+interesA+" Saldo: "+saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
}
