package ejercicio2;

public class Corriente extends Cuenta {
	private long sobregiro;

	public Corriente(int numeroCuenta, String titular, long sobregiro) {
		super(numeroCuenta, titular);
		this.sobregiro = sobregiro;
	}

	@Override
	public void deposito(long valor) {
		// TODO Auto-generated method stub
		this.saldo+=valor;
	}

	@Override
	public void retiro(long valor) {
		// TODO Auto-generated method stub
		
	}
	
}
