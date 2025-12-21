package model;

public class Persona {
    protected String nombre;
    protected Rut rut;
    protected Direccion direccion;

    public Persona(String nombre, Rut rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public Rut getRut() {return rut;}
    public void setRut(Rut rut) {this.rut = rut;}

    public Direccion getDireccion() {return direccion;}
    public void setDireccion(Direccion direccion) {this.direccion = direccion;}
}
