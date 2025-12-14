package ui;
import data.UnidadOperativa;
import model.GestorUnidades;

import java.util.List;

public class Main {
    static List<UnidadOperativa> unidades;

    public static void main(String[] args) {
        unidades = GestorUnidades.creacionUnidades();

        for (UnidadOperativa unidad : unidades) {
            unidad.mostrarInformacion();
        }
    }
}