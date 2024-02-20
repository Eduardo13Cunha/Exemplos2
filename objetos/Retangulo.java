package Exemplos2.objetos;

public class Retangulo extends Forma {
    double comprimento, largura;

    public Retangulo() {
    }

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea() {
        return Math.round(comprimento * largura * 100) / 100.0;
    }
}
