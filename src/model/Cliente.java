package data;

import model.Registrable;

public class Cliente extends Persona implements Registrable {
    private int compras; //Número de compras que ha hecho

    public Cliente(String nombre, String rut, Direccion direccion, int compras) {
        super(nombre, rut, direccion);
        this.compras = compras;
    }

    public int getCompras() {return compras;}
    public void setCompras(int compras) {this.compras = compras;}

    @Override
    public void registrar() {
        System.out.println("Se ha registrado Cliente");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", RUT: " + rut + ", Dirección: " + direccion + "; Ha realizado " + compras + " compra(s).");
    }

    @Override
    public String toString() {
        return String.format(nombre + " es un(a) cliente.");
    }
}
