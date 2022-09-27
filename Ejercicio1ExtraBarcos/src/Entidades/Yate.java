
package Entidades;

import java.util.Scanner;

public class Yate extends BarcoMotor{
    private int camarotes;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public int getCamarotes() {
        return camarotes;
    }


    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    public void CrearYate(){

        crearBarcoMotor();
        System.out.println("*Camarotes: ");
        setCamarotes (leer.nextInt());     
    } 
    public void FabricaYates(int i){
        fabricaBarcoMotor(i);
        setCamarotes(i+5);        
    }
    
    @Override
    public float valorModulo(){
        float valor=(this.eslora*10)+getPotencia()+this.camarotes;
        return valor;
    }

    @Override
    public String toString() {
        return super.toString() + " Yate" + " camarotes=" + camarotes;
    }
    
     
}
