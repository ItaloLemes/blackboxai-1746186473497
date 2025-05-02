package geometria;

public class Quadrado extends ObjetoGeometrico {
	
	private double lado;
	
	Quadrado (double l) {
		lado = l;
	}
	
	public double getArea() {
		area = lado * lado;
		return area;
	}
	
	public double getPerimetro() {
		perimetro = 4 * lado;
		return perimetro;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	

}