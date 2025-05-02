package geometria;

public class Circunferencia extends ObjetoGeometrico {
	private double pi = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;
	private double raio;
	
	Circunferencia(double r) {
		raio = r;
	}
	
	public double getArea() {
		area = pi * (raio * raio);
		return area;
	}
	
	public double getPerimetro() {
		perimetro = 2 * pi * raio;
		return perimetro;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}