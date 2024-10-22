package ejercicio2;

public class AppBanco {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ahorro ahorro = new Ahorro(12244,"Maria Perez");
		System.out.println("Cuenta Ahorros");
		ahorro.deposito(100000L);
		ahorro.retiro(50000L);
		Corriente corriente = new Corriente(4356, "Carlos Cubios",5000000);
		System.out.println("Cuenta Corriente: ");
		corriente.deposito(2000000);
		corriente.retiro(4000000L);
		Nomina nomina = new Nomina(21544, "Wendy Williams");
		System.out.println("Cuenta Nomina: ");
		nomina.retiro(245551);
		Vivienda vivienda = new Vivienda(64962, "Ramiro López");
		System.out.println("Cuenta Vivienda: ");
		vivienda.deposito(2000000L);
	}

}
