
package Entidades;

//import java.util.ArrayList;
import java.util.Scanner;

public class BarcoMotor extends Barco {
    private int potencia;
    private boolean disponible=true;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

  public BarcoMotor() {
  }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
  
//
//    public BarcoMotor(int potencia) {
//        this.potencia = potencia;
//    }
//
//    public BarcoMotor(int potencia, int matricula, float eslora, int añoFabricacion) {
//        super(matricula, eslora, añoFabricacion);
//        this.potencia = potencia;
//    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

      
    public void crearBarcoMotor(){
        System.out.println("\033[H\\033[2J");
        System.out.println("***********************");
        System.out.println("* CREAR BARCO A MOTOR *");
        System.out.println("***********************");
        System.out.println("");

        System.out.println("* Matrícula: ");
        setMatricula (leer.nextInt());
        System.out.println("* Eslora: ");
        setEslora (leer.nextFloat());
        System.out.println("* Año de Fabricación (formato 2020): ");
        setAnoFabricacion (leer.nextInt());
        System.out.println("* Potencia (CV): ");
        setPotencia (leer.nextInt());                
    }

    public void fabricaBarcoMotor(int i){           
            setMatricula (i);
            setEslora (i*10);
            setAnoFabricacion (1990+i);
            setPotencia (i*25);      

    }
    public float valorModulo(){
        float valor=(this.eslora*10)+this.potencia;
        return valor;
    }

    @Override
    public String toString() {
        return super.toString() + " potencia=" + potencia + ", disponible= " + disponible;
    }
    
}
