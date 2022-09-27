package Entidades;

import Calculos.calculosFormas;

public class Rectangulos implements calculosFormas {

    private double base;
    private double altura;

    public Rectangulos() {
    }

    public Rectangulos(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void area() {
        System.out.println("El area del rectangulo es: " + (base * altura));
    }

    @Override
    public void perimetro() {
        System.out.println("El perimetro del rectangulo es: " + ((base + altura) * 2));
    }

}
