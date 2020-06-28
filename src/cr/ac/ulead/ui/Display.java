package cr.ac.ulead.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class Display {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);

    public void showMainMenu() {
        output.println("=======================================================================");
        output.println("========================   MENU PRINCIPAL   ===========================");
        output.println("=======================================================================");
        output.println("Tipos de objeto a serializar: ");
        output.println(" - 1) Persona");
        output.println(" - 2) Mascota");
        output.println(" - 3) Salir");
    }

    public void showSerializationMenu() {
        output.println("=======================================================================");
        output.println("=========================   SERIALIZADOR   ============================");
        output.println("=======================================================================");
        output.println("Formatos posibles para serializar la informacion: ");
        output.println(" - 1) XML");
        output.println(" - 2) Json");
    }

    public void showMenuPointA() {
        output.println("=======================================================================");
        output.println("=======================   PILA DE PERSONAS   ==========================");
        output.println("=======================  Parte 2 -- Punto A  ==========================");
        output.println("=======================================================================");
        output.println(" - 1) Introducir persona en la pila");
        output.println(" - 2) Sacar persona de la pila");
        output.println(" - 3) Salir");
    }

    public void showMenuPointB() {
        output.println("=======================================================================");
        output.println("=======================   PILA DE PERSONAS   ==========================");
        output.println("=======================  Parte 2 -- Punto B  ==========================");
        output.println("=======================================================================");
        output.println(" - 1) Introducir persona en la pila");
        output.println(" - 2) Sacar persona de la pila");
        output.println(" - 3) Menor altura en al pila");
        output.println(" - 4) Salir");
    }

    public void showMenuPointC() {
        output.println("=======================================================================");
        output.println("=======================   COLA DE MASCOTAS   ==========================");
        output.println("=======================  Parte 2 -- Punto C  ==========================");
        output.println("=======================================================================");
        output.println(" - 1) Introducir mascota en la cola");
        output.println(" - 2) Sacar mascota de la cola");
        output.println(" - 3) Salir");
    }

    public void showMenuPointD() {
        output.println("=======================================================================");
        output.println("==================   COLA DE PERSONAS/MASCOTAS   ======================");
        output.println("=======================  Parte 2 -- Punto D  ==========================");
        output.println("=======================================================================");
        output.println(" - 1) Introducir persona");
        output.println(" - 2) Introducir mascota");
        output.println(" - 3) Sacar objeto de la cola");
        output.println(" - 4) Salir");
    }

    public int readValue() {
        output.println("Escoja una de las opciones anteriores: ");
        int option = input.nextInt();
        this.input.skip("[\r\n]");
        return option;
    }

    public String readName() {
        output.println("Escriba el nombre: ");
        return input.nextLine();
    }

    public String readLastName() {
        output.println("Escriba el apellido: ");
        return input.nextLine();
    }

    public String readDateOfBirth() {
        output.println("Ingrese la fecha de nacimiento (mm/dd/aaaa): ");
        return input.nextLine();
    }

    public double readWeight() {
        output.println("Ingrese el peso (kilos): ");
        return input.nextDouble();
    }

    public double readHeight() {
        output.println("Ingrese la altura (cm): ");
        return input.nextDouble();
    }

    public String readType() {
        output.println("Ingrese el tipo: ");
        return input.nextLine();
    }

    public String readAge() {
        output.println("Ingrese la edad: ");
        return input.nextLine();
    }

    public void printObjectCreated() {
        output.println("\n");
        output.println("=======================================================================");
        output.println("                    Se ha creado un nuevo objeto.");
        output.println("=======================================================================");
        output.println("\n");
    }

    public void printObjectAdded() {
        output.println("\n");
        output.println("=======================================================================");
        output.println("              El objeto fue introducido en la estructura.");
        output.println("=======================================================================");
        output.println("\n");
    }

    public void printObjectRemoved() {
        output.println("\n");
        output.println("=======================================================================");
        output.println("               Se ha sacado un objeto de la estructura.");
        output.println("=======================================================================");
        output.println("\n");
    }

    public void printFormat(String format) {
        output.println(format);
    }

    public void printLeastHeight(Double height) {
        output.println("\n");
        output.println("=======================================================================");
        output.println("               La menor altura en la pila es de " + height + " cm.");
        output.println("=======================================================================");
        output.println("\n");
    }

    public void invalidSelection() {
        output.println("Seleccion invalida. Intente de nuevo.");
    }

    public void printFull() {
        output.println("\n");
        output.println("***OJO***===***===***===***===***===***===***===***===***OJO***===***==");
        output.println("***   ***   ***    * OJO! La estructura esta LLENA.   ***   ***   ***");
        output.println("***===***OJO***===***===***===***===***===***===***===***===***OJO***==");
        output.println("\n");
    }

    public void printEmpty() {
        output.println("\n");
        output.println("***OJO***===***===***===***===***===***===***===***===***OJO***===***==");
        output.println("***   ***   ***    * OJO! La estructura esta VACIA.   ***   ***   ***");
        output.println("***===***OJO***===***===***===***===***===***===***===***===***OJO***==");
        output.println("\n");
    }

    public void printDelimitator() {
        output.println("\n");
        output.println("=======================================================================");
        output.println("\n");
    }

    public void printExitMessage() {
        output.println("\n");
        output.println("=======================================================================");
        output.println("        Muchas gracias por usar el programa, le esperamos pronto.");
        output.println("=======================================================================");
        output.println("\n");
    }
}
