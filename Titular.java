package ejercicio1;

public class Titular {
	protected String nombreT;
	protected int idT;
	protected String correoT;
	public Titular(String nombreT, int idT, String correoT) {
		super();
		this.nombreT = nombreT;
		this.idT = idT;
		this.correoT = correoT;
	}
	@Override
	public String toString() {
		return "Titular Nombre: " + nombreT + ", ID: " + idT + ", Correo: " + correoT;
	}
	
}
