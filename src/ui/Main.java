package ui;

import model.Cliente;
import model.Direccion;
import model.Empleado;
import data.GestorPersonas;
import interfaces.Registrable;
import model.Rut;
import util.InvalidRutException;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Cliente> clientes;
    static ArrayList<Empleado> empleados;
    static ArrayList<Registrable> personas = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);
    static boolean isFinished = false;


    public static void main(String[] args) throws FileNotFoundException, InvalidRutException {
        clientes = GestorPersonas.listaClientes(); //Copia el ArrayList de clientes en GestorPersonas
        empleados = GestorPersonas.listaEmpleados(); //Lo mismo pero para empleados

        personas.addAll(clientes);
        personas.addAll(empleados);

        Direccion direccionmanual = new Direccion("Biobío", "Concepción", "Los Mirlos", 12);
        Rut rutmanual = new Rut("12345963-2");
        Cliente clientemanual = new Cliente("Jorge Díaz", rutmanual, direccionmanual, 17);

        personas.add(clientemanual);

        System.out.println("Bienvenido a Salmontt.");

        while (!isFinished) {
            menu();
        }
        scanner.close();
    }

    public static void menu() {
        System.out.println("-----------------------------------------");
        System.out.println("¿Qué desea hacer?");
        System.out.println("Ingrese '1' para ver las personas registradas.");
        System.out.println("Ingrese '2' filtrar los clientes por mínimo de compras realizadas.");
        System.out.println("Ingrese '3' para agregar un nuevo cliente.");
        System.out.println("Ingrese '4' para salir.");
        try {
            int opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1: {
                    mostrarDatos();
                    break;
                }
                case 2: {
                    filtrarLista();
                    break;
                }
                case 3: {
                    agregarCliente();
                    break;
                }
                case 4: {
                    System.out.println("¡Nos vemos!");
                    isFinished = true;
                    System.exit(0);
                }
                default: {
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                }
            }
        } catch (NumberFormatException e) { //Maneja error de formato.
            System.out.println("Error: Se ha ingresado un valor inválido. La operación ha sido cancelada.");
            System.exit(0); //Se termina la ejecución.
        }
    }

    public static void mostrarDatos() {
        for (Registrable r : personas) {
            if (r instanceof Cliente) {
                System.out.println("Datos de cliente:");
            } else if (r instanceof Empleado) {
                System.out.println("Datos de empleado:");
            }

            r.mostrarDatos();
        }
    }

    public static void filtrarLista() {
        System.out.println("Ingrese un número para mostrar los clientes que superaron el valor en compras.");
        try {
            int opcion = Integer.parseInt(scanner.nextLine());
            if (opcion > 0) {
                for (Cliente cli : clientes) {
                    if (cli.getCompras() > opcion) {  //Se establece un filtro de centros con producción mayor al valor ingresado.
                        cli.mostrarDatos();
                    }
                }
            } else {
                System.out.println("Ingrese un número mayor a 0.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Se ha ingresado un valor inválido. La operación ha sido cancelada.");
            System.exit(0);
        }
    }

    public static void agregarCliente() {
        Rut rutInput = null;
        int numeroInput = 0;

        System.out.println("Ingrese el nombre del cliente:");
        String nombreInput = scanner.nextLine();
        try {
            System.out.println("Ingrese el rut (SIN puntos y CON guión):");
            String rutScan = scanner.nextLine();
            rutInput = new Rut(rutScan);
        } catch (InvalidRutException e) {
            System.out.println("Error: Se ha ingresado un valor inválido. La operación ha sido cancelada.");
            System.exit(0);
        }
        System.out.println("Ingrese la dirección de residencia:");
        System.out.println("Región:");
        String regionInput = scanner.nextLine();
        System.out.println("Comuna:");
        String comunaInput = scanner.nextLine();
        System.out.println("Calle:");
        String calleInput = scanner.nextLine();
        System.out.println("Número de calle:");
        try {
            numeroInput = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Se ha ingresado un valor inválido. La operación ha sido cancelada.");
            System.exit(0);
        }
        Direccion direccionInput = new Direccion(regionInput, comunaInput, calleInput, numeroInput);
        Cliente clienteCreado = new Cliente(nombreInput, rutInput, direccionInput, 0); //Se crea el cliente con 0 compras hechas.
        personas.add(clienteCreado);
        clienteCreado.registrar();
    }
}