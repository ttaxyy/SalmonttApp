package data;

/*
* Clase base/superclase de los objetos.
* Incluye solamente los atributos nombre y comuna.
* */

public class UnidadOperativa {
    protected String nombre;
    protected String comuna;

    public UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getComuna() {return comuna;}
    public void setComuna(String comuna) {this.comuna = comuna;}

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Comuna: " + comuna);
    }

    @Override
    public String toString() {
        return String.format("Nombre: " + nombre + ", Comuna: " + comuna);
    }
}
