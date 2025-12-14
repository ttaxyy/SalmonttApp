package data;

import model.Registrable;

/*
* Subclase de UnidadOperativa.
* Representa las plantas de procesamiento, e incluye su capacidad máxima de procesamiento en toneladas.
* */
public class PlantaProceso extends UnidadOperativa implements Registrable {
    private int capacidadProceso;

    public PlantaProceso(String nombre, String comuna, int capacidadProceso) {
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }

    public int getCapacidadProceso() {return capacidadProceso;}
    public void setCapacidadProceso(int capacidadProceso) {this.capacidadProceso = capacidadProceso;}

    @Override
    public void mostrarResumen() {
        System.out.println("Nombre: " + nombre + ", Comuna: " + comuna + ", Capacidad de Procesamiento: " + capacidadProceso);
    }

    @Override
    public String toString() {
        return String.format("Nombre: " + nombre + ", Comuna: " + comuna + ", Capacidad de Procesamiento: " + capacidadProceso);
    }
}
