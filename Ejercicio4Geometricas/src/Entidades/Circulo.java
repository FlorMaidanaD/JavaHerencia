
package Entidades;

import Calculos.calculosFormas;

public class Circulo implements calculosFormas{
    private double radio;
    private final double PI=3.14;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void area() {
        System.out.println("El área del circulo es: " + (PI*radio*radio));
    }

    @Override
    public void perimetro() {
        System.out.println("El perímetro del circulo es: " + (PI*radio*2));        
    }
        
}
