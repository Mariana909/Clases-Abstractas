/*
 * Duque Karla-Oviedo Daniel
 */

package ejercicio1;
import java.time.*;

public class Corriente extends Cuenta implements IRetirable,IDepositable {
	private LocalDate fechaUltM;
	private long valorUltM;
	
	public Corriente(int numCuenta, int anioApertura, Titular titular, long valorUltM) {
		super(numCuenta, anioApertura, titular);
		this.fechaUltM = LocalDate.now();
		this.valorUltM = valorUltM;
	}

	@Override
	public String toString() {
		return super.toString()+" Corriente Fecha Ultimo Movimiento: " + fechaUltM + ", Valor Ultimo Movimiento: " + valorUltM;
	}

	@Override
	public void deposito(long valor) {
		// TODO Auto-generated method stub
		if(valor>0) {
			this.saldo+=valor;
			this.fechaUltM=LocalDate.now();
			this.valorUltM=valor;
			System.out.println(" Saldo: "+saldo+"Valor ultimo movimiento: "+valorUltM+"\nFecha ultimo movimiento: "+fechaUltM);
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
			this.fechaUltM=LocalDate.now();
			this.valorUltM=valor;
			System.out.println(" Saldo: "+saldo+"Valor ultimo movimiento: "+valorUltM+"\nFecha ultimo movimiento: "+fechaUltM);
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
}
