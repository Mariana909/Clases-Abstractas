/*
 * Duque Karla-Oviedo Daniel
 */

package ejercicio1;

import java.util.ArrayList;

public class AppBanco {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cuenta>listaCuenta= new ArrayList<Cuenta>();
		Titular titular1 = new Titular("Maria Perez", 154585, "maria@hotmail.com");
		Titular titular2 = new Titular("Carlos Cubios",5245867, "carlos@hotmail.com");
		Titular titular3 = new Titular("Wendy Williams", 4687, "wendy@gmail.com");
		Titular titular4 = new Titular("Ramiro López", 5648, "ramiro@gmail.com");
		Ahorro ahorro = new Ahorro(12244,2010, titular1, 13466L);
		listaCuenta.add(ahorro);
		/*
		ahorro.deposito(100000L);
		ahorro.retiro(50000L);
		*/
		Corriente corriente = new Corriente(4356, 2002,titular2, 1357687);
		listaCuenta.add(corriente);
		/*
		corriente.deposito(2000000);
		corriente.retiro(4000000L);
		*/
		Nomina nomina = new Nomina(21544, 2013, titular3, "Candy");
		listaCuenta.add(nomina);
		/*
		nomina.retiro(245551);
		*/
		Vivienda vivienda = new Vivienda(64962, 2020,titular4, 2500000000L, "Interes social");
		listaCuenta.add(vivienda);
		/*
		vivienda.deposito(2000000L);
		*/
		for (Cuenta cuenta : listaCuenta) {
			System.out.println(cuenta);
		}
	}

}