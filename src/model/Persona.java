package data;

public class Persona {
    protected String nombre;
    protected String rut;
    protected Direccion direccion;

    public Persona(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getRut() {return rut;}
    public void setRut(String rut) {this.rut = rut;}

    public Direccion getDireccion() {return direccion;}
    public void setDireccion(Direccion direccion) {this.direccion = direccion;}
}
