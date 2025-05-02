package geometria;

public abstract class ObjetoGeometrico implements InterfaceGeometria {
	protected double area;
	protected double perimetro;
	protected String cor;
	
	public abstract double getArea();
	public abstract double getPerimetro();
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String c) {
		cor = c;
	}
}