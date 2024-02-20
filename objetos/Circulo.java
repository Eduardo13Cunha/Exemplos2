package Exemplos2.objetos;

public class Circulo extends Forma {
    double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.round(Math.pow(raio, 2) * Math.PI * 100) / 100.0;
    }
}
