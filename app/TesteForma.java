package Exemplos2.app;

import Exemplos2.objetos.*;

public class TesteForma {
    public static void main(String[] args) {

        Forma Retangulo = new Retangulo(2, 2);
        Forma Circulo = new Circulo(4);

        System.out.println("Area do Circulo: " + Circulo.calcularArea());
        System.out.println("Area do Retangulo: " + Retangulo.calcularArea());
    }
}
