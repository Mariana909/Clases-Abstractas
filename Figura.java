package Ejercicio1;

public abstract class Figura {
	protected double area;
	protected double perimetro;
	public double getArea() {
		return area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public abstract void calcularArea();
	public abstract void calcularPerimetro();
	@Override
	public String toString() {
		return "Figura [area=" + area + ", perimetro=" + perimetro + "]";
	}
	
}
