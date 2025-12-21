package model;

/*
* Clase que se encarga de crear objetos de las distintas subclases, y las añade a un ArrayList.
* Se muestra en consola cuando se llama a través de Main.
* */

import data.Cliente;
import data.Direccion;
import data.Empleado;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorPersonas {
    public static ArrayList<Cliente> listaClientes() throws FileNotFoundException {
        File file = new File("resources/clientes.txt");         //Importa el archivo
        Scanner sc = new Scanner(file);

        ArrayList<Cliente> clientes = new ArrayList<>();

        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            String[] partes = linea.split(";"); //Separa la linea por el caracter ";"

            Cliente cli = new Cliente(
                    partes[0],                                  //Primera parte: Nombre
                    partes[1],                                  //Segunda parte: RUT
                    new Direccion(partes[2], partes[3], partes[4], Integer.parseInt(partes[5])), //Tercera parte: Dirección
                    Integer.parseInt(partes[6])                 //Cuarta parte: Número de compras
            );
            clientes.add(cli);
        }
        return clientes;
    }

    public static ArrayList<Empleado> listaEmpleados() throws FileNotFoundException {
        File file = new File("resources/empleados.txt");         //Importa el archivo
        Scanner sc = new Scanner(file);

        ArrayList<Empleado> empleados = new ArrayList<>();

        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            String[] partes = linea.split(";"); //Separa la linea por el caracter ";"

            Empleado emp = new Empleado(
                    partes[0],                                  //Primera parte: Nombre
                    partes[1],                                  //Segunda parte: RUT
                    new Direccion(partes[2], partes[3], partes[4], Integer.parseInt(partes[5])), //Tercera parte: Dirección
                    partes[6]                                   //Cuarta parte: Lugar de trabajo
            );
            empleados.add(emp);
        }
        return empleados;
    }
}
