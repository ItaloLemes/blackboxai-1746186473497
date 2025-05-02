package front;

import back.negocio.Fachada;
import back.negocio.iFachada;

public class QuadroNegro {
	
	private iFachada fachada;

	public QuadroNegro() {
		fachada = new Fachada();
	}
	
	public void limpaQuadro() {
		// Implementation if needed
	}

	public void mostraAreaObjetos() {
		System.out.println("Quadrado.  Área: " + fachada.getAreaQuadrado());
		System.out.println("Retângulo. Área: " + fachada.getAreaRetangulo());
		System.out.println("Triângulo. Área: " + fachada.getAreaTriangulo());
		System.out.println("Circunferência. Área: " + fachada.getAreaCircunferencia());
	}
	
	public void mostraPerimetroObjetos() {
		System.out.println("Quadrado.  Perímetro: " + fachada.getPerimetroQuadrado());
		System.out.println("Retângulo. Perímetro: " + fachada.getPerimetroRetangulo());
		System.out.println("Triângulo. Perímetro: " + fachada.getPerimetroTriangulo());
		System.out.println("Circunferência. Perímetro: " + fachada.getPerimetroCircunferencia());	
	}
	
	public void mostraCorObjetos() {
		System.out.println("Quadrado.  Cor: " + fachada.getCorQuadrado());
		System.out.println("Retângulo. Cor: " + fachada.getCorRetangulo());
		System.out.println("Triângulo. Cor: " + fachada.getCorTriangulo());
		System.out.println("Circunferência. Cor: " + fachada.getCorCircunferencia());	
	}
	
	public static void main(String[] args) {
		QuadroNegro quadroNegro = new QuadroNegro();
		quadroNegro.fachada.criaQuadrado(10.6);
		quadroNegro.fachada.criaRetangulo(50.5, 20.4);
		quadroNegro.fachada.criaTriangulo(6.7, 5.5);
		quadroNegro.fachada.criaCircunferencia(10);
		 
		quadroNegro.fachada.setCorQuadrado("Preto");
		quadroNegro.fachada.setCorRetangulo("Azul");
		quadroNegro.fachada.setCorTriangulo("Verde");
		quadroNegro.fachada.setCorCircunferencia("Branco");
		 
		quadroNegro.mostraAreaObjetos();
		quadroNegro.mostraPerimetroObjetos();
		quadroNegro.mostraCorObjetos();
	}
}
