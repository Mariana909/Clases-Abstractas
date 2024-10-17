package ejercicio2;

public class Ahorro extends Cuenta{
	private long interes;

	public Ahorro(int numeroCuenta, String titular) {
		super(numeroCuenta, titular);
	}

	@Override
	public void deposito(long valor) {
		// TODO Auto-generated method stub
		if(valor>0) {
			this.saldo+=valor;
			this.interes+=(long) (saldo*0.03);
			System.out.println("Interes: "+interes+" Saldo: "+saldo);
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
			System.out.println("Interes: "+interes+" Saldo: "+saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	
}
