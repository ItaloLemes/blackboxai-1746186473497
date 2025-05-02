package back.negocio;

public interface iFachada {
    void criaQuadrado(double lado);
    void criaRetangulo(double comprimento, double altura);
    void criaTriangulo(double base, double altura);
    void criaCircunferencia(double raio);

    double getAreaQuadrado();
    double getAreaRetangulo();
    double getAreaTriangulo();
    double getAreaCircunferencia();

    double getPerimetroQuadrado();
    double getPerimetroRetangulo();
    double getPerimetroTriangulo();
    double getPerimetroCircunferencia();

    String getCorQuadrado();
    String getCorRetangulo();
    String getCorTriangulo();
    String getCorCircunferencia();

    void setCorQuadrado(String cor);
    void setCorRetangulo(String cor);
    void setCorTriangulo(String cor);
    void setCorCircunferencia(String cor);
}
