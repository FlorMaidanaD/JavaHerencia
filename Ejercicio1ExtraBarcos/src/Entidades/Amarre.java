
package Entidades;

public class Amarre {
    private int num;
    private boolean libre=true;

    public Amarre(int num, boolean libre) {
        this.num = num;
        this.libre = libre;
    }

    public Amarre() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    @Override
    public String toString() {
        return "Amarre:" + "num= " + num + ", libre= " + libre;
        
    }
    public void CrearAmarre(){
        System.out.println("Ingrese el numero: ");
        
    }
    
}
