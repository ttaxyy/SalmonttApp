package model;

import util.InvalidRutException;

public class Rut {
    private String numero;

    public Rut(String numeroRut) throws InvalidRutException {
        if (!numeroRut.matches("[0-9]+-[0-9kK]")) {
            throw new InvalidRutException("Formato de Rut inválido.");
        }
        this.numero = numeroRut;
    }

    public String getNumero() {return numero;}

    @Override
    public String toString() {
        return String.format(numero);
    }
}
