package ejercicio2;

public class Ahorro extends Cuenta{
	private long interes;

	public Ahorro(int numeroCuenta, String titular, long interes) {
		super(numeroCuenta, titular);
		this.interes = interes;
	}

	@Override
	public void deposito(long valor) {
		// TODO Auto-generated method stub
		this.saldo+=valor;
		this.interes=(long) (saldo*0.03);
	}

	@Override
	public void retiro(long valor) {
		// TODO Auto-generated method stub
		if(valor<=saldo)
		{
			this.saldo=saldo-valor;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	
}
