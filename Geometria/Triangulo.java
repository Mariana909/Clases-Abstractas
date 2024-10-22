package Ejercicio1;

public class Triangulo extends Figura {
	private double lado1;
	private double lado2;
	private double lado3;
	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.area=Math.pow((4*lado1*lado1*lado2*lado2)-Math.pow(lado1*lado1+lado2*lado2-lado3*lado3,2), 0.5)*0.25;
		System.out.println(area);
	}
	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro=lado1+lado2+lado3;
		System.out.println(perimetro);
	}
	
}
