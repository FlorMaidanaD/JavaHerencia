
package Entidades;

import java.util.Scanner;

public class Velero extends Barco{
    private int mastiles;
    private boolean disponible=true;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

   public Velero() {
  }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void crearVelero(){
        System.out.println("\033[H\\033[2J");
        System.out.println("****************");
        System.out.println("* CREAR VELERO *");
        System.out.println("****************");
        System.out.println("");

        System.out.println("* Matrícula: ");
        setMatricula (leer.nextInt());
        System.out.println("* Eslora: ");
        setEslora (leer.nextFloat());
        System.out.println("* Año de Fabricación (formato 2020): ");
        setAnoFabricacion (leer.nextInt());
        System.out.println("* Mastiles: ");
        setMastiles (leer.nextInt());        
    }
    
    public void fabricaVeleros(int x){
       setMatricula (x);
       setEslora (x*10);
       setAnoFabricacion (1990+x);
       setMastiles (x+5);
    }
    public float valorModulo(){
        float valor=this.eslora*10;
        return valor;
    }

    @Override
    public String toString() {
        return super.toString() +  " mastiles= " + mastiles + ", disponible= " + disponible;
    }
    
}
