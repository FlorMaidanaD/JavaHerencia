
package Entidades;

import java.util.Date;

public class Alquiler {
    private Cliente cliente;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private Amarre num;
    private Barco barco;
    private float precioTotal;

    public Alquiler() {
    }

    public Alquiler(Cliente cliente, Date fechaAlquiler, Date fechaDevolucion, Amarre num, Barco barco, float precioTotal) {
        this.cliente = cliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.num = num;
        this.barco = barco;
        this.precioTotal = precioTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Amarre getNum() {
        return num;
    }

    public void setNum(Amarre num) {
        this.num = num;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Alquiler: " + "/ncliente=" + cliente + "/nfecha Alquiler=" + fechaAlquiler + "/nfecha Devolucion=" + fechaDevolucion + "/nAmarre= " + num + "/nbarco= " + barco + "/nprecio Total=" + precioTotal;
    }
    
    
    
}
