package back.negocio;

import back.dado.Quadrado;
import back.dado.Retangulo;
import back.dado.Triangulo;
import back.dado.Circunferencia;

public class Fachada implements iFachada {
    private Quadrado quadrado;
    private Retangulo retangulo;
    private Triangulo triangulo;
    private Circunferencia circunferencia;

    @Override
    public void criaQuadrado(double lado) {
        quadrado = new Quadrado(lado);
    }

    @Override
    public void criaRetangulo(double comprimento, double altura) {
        retangulo = new Retangulo(comprimento, altura);
    }

    @Override
    public void criaTriangulo(double base, double altura) {
        triangulo = new Triangulo(base, altura);
    }

    @Override
    public void criaCircunferencia(double raio) {
        circunferencia = new Circunferencia(raio);
    }

    @Override
    public double getAreaQuadrado() {
        return quadrado != null ? quadrado.getArea() : 0;
    }

    @Override
    public double getAreaRetangulo() {
        return retangulo != null ? retangulo.getArea() : 0;
    }

    @Override
    public double getAreaTriangulo() {
        return triangulo != null ? triangulo.getArea() : 0;
    }

    @Override
    public double getAreaCircunferencia() {
        return circunferencia != null ? circunferencia.getArea() : 0;
    }

    @Override
    public double getPerimetroQuadrado() {
        return quadrado != null ? quadrado.getPerimetro() : 0;
    }

    @Override
    public double getPerimetroRetangulo() {
        return retangulo != null ? retangulo.getPerimetro() : 0;
    }

    @Override
    public double getPerimetroTriangulo() {
        return triangulo != null ? triangulo.getPerimetro() : 0;
    }

    @Override
    public double getPerimetroCircunferencia() {
        return circunferencia != null ? circunferencia.getPerimetro() : 0;
    }

    @Override
    public String getCorQuadrado() {
        return quadrado != null ? quadrado.getCor() : null;
    }

    @Override
    public String getCorRetangulo() {
        return retangulo != null ? retangulo.getCor() : null;
    }

    @Override
    public String getCorTriangulo() {
        return triangulo != null ? triangulo.getCor() : null;
    }

    @Override
    public String getCorCircunferencia() {
        return circunferencia != null ? circunferencia.getCor() : null;
    }

    @Override
    public void setCorQuadrado(String cor) {
        if (quadrado != null) quadrado.setCor(cor);
    }

    @Override
    public void setCorRetangulo(String cor) {
        if (retangulo != null) retangulo.setCor(cor);
    }

    @Override
    public void setCorTriangulo(String cor) {
        if (triangulo != null) triangulo.setCor(cor);
    }

    @Override
    public void setCorCircunferencia(String cor) {
        if (circunferencia != null) circunferencia.setCor(cor);
    }
}
