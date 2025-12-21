package model;

import interfaces.Registrable;

public class Empleado extends Persona implements Registrable {
    private String lugarTrabajo;

    public Empleado(String nombre, Rut rut, Direccion direccion, String lugarTrabajo) {
        super(nombre, rut, direccion);
        this.lugarTrabajo = lugarTrabajo;
    }

    public String getLugarTrabajo() {return lugarTrabajo;}
    public void setLugarTrabajo(String lugarTrabajo) {this.lugarTrabajo = lugarTrabajo;}

    @Override
    public void registrar() {
        System.out.println("Se ha registrado Empleado");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", RUT: " + rut + ", Dirección: " + direccion + ", Trabaja en: " + lugarTrabajo + ".");
    }

    @Override
    public String toString() {
        return String.format(nombre + " es un(a) empleado/a.");
    }
}
