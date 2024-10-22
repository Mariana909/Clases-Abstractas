package ejercicio2;

public class Vivienda extends Cuenta implements IDepositable {

	public Vivienda(int numeroCuenta, String titular) {
		super(numeroCuenta, titular);
		// TODO Auto-generated constructor stub
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
