package data;

/*
* Subclase de UnidadOperativa.
* Representa a los centros de cultivo con el atributo de toneladas producidas.
* */
public class CentroCultivo extends UnidadOperativa {
    private int toneladasProduccion;

    public CentroCultivo(String nombre, String comuna, int toneladasProduccion) {
        super(nombre, comuna);
        this.toneladasProduccion = toneladasProduccion;
    }

    public int getToneladasProduccion() {return toneladasProduccion;}
    public void setToneladasProduccion(int toneladasProduccion) {this.toneladasProduccion = toneladasProduccion;}

    @Override
    public void mostrarInformacion() {
        System.out.println("El centro de cultivo '" + nombre + "', ubicado en " + comuna + ", produjo " + toneladasProduccion + " toneladas." );
    }

    @Override
    public String toString() {
        return String.format("Nombre: " + nombre + ", Comuna: " + comuna + ", Toneladas producidas: " + toneladasProduccion);
    }
}
