package ui;
import data.CentroCultivo;
import data.PlantaProceso;
import model.Formulario;
import model.GestorUnidades;
import model.Registrable;

import javax.swing.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        GestorUnidades.creacionUnidades();
        Formulario.mostrarInterfaz();

        // Acá se pueden agregar las unidades creadas a través de la interfaz a una lista.
    }
}