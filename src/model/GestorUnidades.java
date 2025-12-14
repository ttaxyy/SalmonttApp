package model;
import data.CentroCultivo;
import data.PlantaProceso;

import java.util.ArrayList;

/*
* Clase que se encarga de crear objetos de las distintas subclases, y las añade a un ArrayList.
* Se muestra en consola cuando se llama a través de Main.
* */

public class GestorUnidades {
    public static ArrayList<Registrable> creacionUnidades() {
        ArrayList<Registrable> unidades = new ArrayList<>();

        CentroCultivo centro1 = new CentroCultivo("Las Gaviotas", "Ñuñoa", 1280);
        CentroCultivo centro2 = new CentroCultivo("Arcoíris", "Valparaíso", 1301);
        PlantaProceso planta1 = new PlantaProceso("Zafiro", "Providencia", 2000);
        PlantaProceso planta2 = new PlantaProceso("Esmeralda", "Viña del Mar", 2500);
        CentroCultivo centro3 = new CentroCultivo("Tortuga Marina", "Valparaíso", 1522);

        unidades.add(centro1);
        unidades.add(centro2);
        unidades.add(planta1);
        unidades.add(planta2);
        unidades.add(centro3);

        return unidades;
    }
}
