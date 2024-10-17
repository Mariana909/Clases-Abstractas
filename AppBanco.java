package ejercicio2;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ahorro ahorro = new Ahorro(12244,"Maria Perez");
		System.out.println("Cuenta Ahorros");
		ahorro.deposito(100000L);
		ahorro.retiro(50000L);
		Corriente corriente = new Corriente(4356, "Carlos Cubios",5000000);
		System.out.println("Cuenta Corriente: ");
		corriente.deposito(2000000);
		corriente.retiro(40000000L);
	}

}
