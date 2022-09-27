
package Entidades;

import java.util.Scanner;

public class Cliente {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        private String Nombre;
        private int dni;

    public Cliente() {
    }

    public Cliente(String Nombre, int dni) {
        this.Nombre = Nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente:" + "Nombre= " + Nombre + ", dni= " + dni;
    }
    
    public void crearCliente(){
        System.out.println("\033[H\\033[2J");
        System.out.println("*****************");
        System.out.println("* NUEVO CLIENTE *");
        System.out.println("*****************");
        System.out.println("");
        System.out.print("Nombre: ");
        setNombre (leer.next());
        System.out.print("DNI: ");
        setDni (leer.nextInt());
    }
        
        
}
