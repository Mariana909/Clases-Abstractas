package ejercicio2;

public class Nomina extends Cuenta implements IRetirable {

	public Nomina(int numeroCuenta, String titular) {
		super(numeroCuenta, titular);
		this.saldo=1300000;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void retiro(long valor) {
		// TODO Auto-generated method stub
		if(valor>saldo)
			{
				System.out.println("No es posible realizar la operación");
			}else {
				this.saldo-=valor;
				System.out.println("Saldo: "+saldo);
			}
	}
	
}
