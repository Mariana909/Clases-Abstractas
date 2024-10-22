package Ejercicio1;

public class Rectangulo extends Figura {
	private double ancho;
	private double largo;
	public Rectangulo(double ancho, double largo) {
		super();
		this.ancho = ancho;
		this.largo = largo;
	}
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.area=ancho*largo;
		System.out.println(area);
	}
	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro=ancho*2+largo*2;
		System.out.println(perimetro);
	}
	
}
