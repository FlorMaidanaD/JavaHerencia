
package Entidades;

public class Barco {
    protected int matricula;
    protected float eslora;
    protected int anoFab;


    public Barco() {
    }

    public Barco(int matricula, float eslora, int añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFab = añoFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public int getAnoFabricacion() {
        return anoFab;
    }

    public void setAnoFabricacion(int añoFabricacion) {
        this.anoFab = añoFabricacion;
    }

    @Override
    public String toString() {
        return "Barco: " + "matricula=" + matricula + ", eslora=" + eslora + ", año de Fabricacion=" + anoFab;
    }

    
  
    
}
