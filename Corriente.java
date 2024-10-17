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
		if(valor>0) {
			this.saldo+=valor;
			System.out.println("Sobregiro: "+sobregiro+" Saldo: "+saldo);
		}else {
			System.out.println("No es posible depositar valores negativos");
		}
		
	}

	@Override
	public void retiro(long valor) {
		// TODO Auto-generated method stub
		if(valor>saldo)
		{
			if(sobregiro>valor-saldo)
			{
				this.sobregiro=sobregiro-(valor-saldo);
				this.saldo=saldo-valor;
			}else {
				System.out.println("No es posible realizar la operación");
			}
		}else{
			this.saldo=saldo-valor;
		}
		System.out.println("Sobregiro: "+sobregiro+" Saldo: "+saldo);
	}
	
}
