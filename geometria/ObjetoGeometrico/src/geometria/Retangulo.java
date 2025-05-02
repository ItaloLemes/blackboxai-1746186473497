package geometria;

public class Retangulo extends ObjetoGeometrico {
	private double comprimento;
	private double altura;
	
	Retangulo(double c, double a) {
		comprimento = c;
		altura = a;
	}
	
	public double getArea() {
		area = comprimento * altura;
		return area;
	}
	
	public double getPerimetro() {
		perimetro = (2 * comprimento) + (2 * altura);
		return perimetro;
	}
	
	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}