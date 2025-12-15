package model;

import data.CentroCultivo;
import data.PlantaProceso;

import javax.swing.*;

public class Formulario {
    static JTextField nom = new JTextField(10); //Se establecen los inputs
    static JTextField com = new JTextField(10);
    static JTextField cap = new JTextField(10); //Input para planta
    static JTextField ton = new JTextField(10); //Input para centro

    public static void mostrarInterfaz() {
        String[] options = { "Planta de Procesamiento", "Centro de cultivo" }; //Dos opciones de unidades que se pueden crear

        var crear = JOptionPane.showOptionDialog(null, "¿Qué desea crear?", "Creación de unidad operativa",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);

        if (crear == 0) { //Si se escoje Planta de procesamiento:
            crearPlanta();
        }
        if (crear == 1) { //Si se escoge Centro de cultivo
            crearCentro();
        }
    }

    public static void crearPlanta() {
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Nombre:"));
        myPanel.add(nom);
        myPanel.add(new JLabel("Comuna:"));
        myPanel.add(com);
        myPanel.add(new JLabel("Capacidad de Procesamiento:"));
        myPanel.add(cap);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Creación de planta de procesamiento", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) { //Si se hace click en OK:
            String nombre = nom.getText();
            String comuna = com.getText();
            String capacidadStr = cap.getText();

            try {
                int capacidadInt = Integer.parseInt(capacidadStr); //Intenta convertir el string del input en int
                PlantaProceso planta = new PlantaProceso(nombre, comuna, capacidadInt); //Crea una nueva planta
                JOptionPane.showMessageDialog(null,
                        "Se ha creado una nueva planta de procesamiento.", "Éxito", JOptionPane.INFORMATION_MESSAGE); //Muestra mensaje de éxito
            } catch (Exception e) { //Muestra un mensaje de error
                JOptionPane.showMessageDialog(null, "Ocurrió un error.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void crearCentro() {
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Nombre:"));
        myPanel.add(nom);
        myPanel.add(new JLabel("Comuna:"));
        myPanel.add(com);
        myPanel.add(new JLabel("Toneladas de producción:"));
        myPanel.add(ton);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Creación de centro de cultivo", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String nombre = nom.getText();
            String comuna = com.getText();
            String tonStr = ton.getText();

            try {
                int toneladaInt = Integer.parseInt(tonStr);
                CentroCultivo centro = new CentroCultivo(nombre, comuna, toneladaInt);
                JOptionPane.showMessageDialog(null,
                        "Se ha creado un nuevo centro de cultivo.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocurrió un error.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
