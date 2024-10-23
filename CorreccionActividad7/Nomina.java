/*
 * Duque Karla-Oviedo Daniel
 */

package ejercicio1;

import java.time.LocalDate;

public class Nomina extends Cuenta implements IRetirable {
	private String empresa;
	private LocalDate fechaURetiro;
	
	public Nomina(int numCuenta, int anioApertura, Titular titular, String empresa) {
		super(numCuenta, anioApertura, titular);
		this.empresa = empresa;
		this.fechaURetiro = LocalDate.now();
	}

	@Override
	public String toString() {
		return super.toString()+" Nomina Empresa: " + empresa + ", Fecha Ultimo Retiro: " + fechaURetiro;
	}

	public void retiro(long valor) {
		// TODO Auto-generated method stub
		if(valor>saldo)
			{
				System.out.println("No es posible realizar la operación");
			}else {
				this.saldo-=valor;
				this.fechaURetiro=LocalDate.now();
				System.out.println("Saldo: "+saldo);
			}
	}
}
