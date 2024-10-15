package Ejercicio1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circulo = new Circulo(100);
		circulo.calcularArea();
		circulo.calcularPerimetro();
		Triangulo triangulo= new Triangulo(52, 23, 42);
		triangulo.calcularArea();
		triangulo.calcularPerimetro();
		Rectangulo rectangulo = new Rectangulo(14, 20);
		rectangulo.calcularArea();
		rectangulo.calcularPerimetro();
	}

}
