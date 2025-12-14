package ui;
import data.CentroCultivo;
import data.PlantaProceso;
import model.GestorUnidades;
import model.Registrable;

import java.util.ArrayList;

public class Main {
    static ArrayList<Registrable> unidades;

    public static void main(String[] args) {
        unidades = GestorUnidades.creacionUnidades();

        for (Registrable r : unidades) {
            if (r instanceof PlantaProceso) {
                System.out.println("Planta de proceso detectada:");
            } else if (r instanceof CentroCultivo) {
                System.out.println("Centro de cultivo detectado:");
            }

            r.mostrarResumen();
        }
    }
}