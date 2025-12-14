package data;

import model.Registrable;

/*
* Subclase de UnidadOperativa.
* Representa a los centros de cultivo con el atributo de toneladas producidas.
* */
public class CentroCultivo extends UnidadOperativa implements Registrable {
    private int toneladasProduccion;

    public CentroCultivo(String nombre, String comuna, int toneladasProduccion) {
        super(nombre, comuna);
        this.toneladasProduccion = toneladasProduccion;
    }

    public int getToneladasProduccion() {return toneladasProduccion;}
    public void setToneladasProduccion(int toneladasProduccion) {this.toneladasProduccion = toneladasProduccion;}

    public void mostrarResumen() {
        System.out.println("Nombre: " + nombre + ", Comuna: " + comuna + ", Toneladas producidas: " + toneladasProduccion);
    }

    @Override
    public String toString() {
        return String.format("Nombre: " + nombre + ", Comuna: " + comuna + ", Toneladas producidas: " + toneladasProduccion);
    }
}
