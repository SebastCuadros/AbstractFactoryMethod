
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sebas
 */
public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opc1 = 1;

        while (opc1 == 1) {

            System.out.println("Seleccione el menu que desea consumir: ");
            System.out.println("1. Menu vegetariano.");
            System.out.println("2. Menu gourmet.");
            System.out.println("3. Menu saludable.");

            int opcMenu = leer.nextInt();
            MenuRestaurante menu = null;

            switch (opcMenu) {
                case 1:
                    menu = new MenuVegetariano();
                    break;

                case 2:
                    menu = new MenuGourmet();
                    break;

                case 3:
                    menu = new MenuSaludable();
                    break;

                default:
                    System.out.println("Por favor seleccione una opcion valida.");
                    continue;
            }

            int a = 1;
            while (a == 1) {
                System.out.println("Desea pedir entrada?:");
                System.out.println("(1)Si    (2)No: ");
                a = leer.nextInt();

                if (a == 1) {
                    Entrada entrada = menu.crearEntrada();
                    entrada.preparar();
                    System.out.println("");
                    a = 0;

                } else if (a == 2) {
                    break;
                } else {
                    System.out.println("Digite una opción válida");
                    a = 1;
                }
            }

            int b = 1;
            while (b == 1) {
                System.out.println("Desea pedir plato fuerte?:");
                System.out.println("(1)Si    (2)No: ");
                b = leer.nextInt();

                if (b == 1) {
                    Plato plato = menu.crearPlato();
                    plato.preparar();
                    System.out.println("");
                    b = 0;

                } else if (b == 2) {
                    break;
                } else {
                    System.out.println("Digite una opción válida");
                    b = 1;
                }
            }

            int c = 1;
            while (c == 1) {
                System.out.println("Desea pedir bebida?:");
                System.out.println("(1)Si    (2)No: ");
                c = leer.nextInt();

                if (c == 1) {
                    Bebida bebida = menu.crearBebida();
                    bebida.preparar();
                    System.out.println("");
                    c = 0;

                } else if (c == 2) {
                    break;
                } else {
                    System.out.println("Digite una opción válida");
                    c = 1;
                }
            }

            int d = 1;
            while (d == 1) {
                System.out.println("Desea pedir postre?:");
                System.out.println("(1)Si    (2)No: ");
                d = leer.nextInt();

                if (d == 1) {
                    Postre postre = menu.crearPostre();
                    postre.preparar();
                    System.out.println("");
                    d = 0;

                } else if (d == 2) {
                    break;
                } else {
                    System.out.println("Digite una opción válida");
                    d = 1;
                }
            }

            System.out.println("\n");
            System.out.println("Orden creada con exito!");
            System.out.println("\n");

            System.out.println("Desea ordenar otro plato?");
            System.out.println("(1)Si    (2)No: ");
            opc1 = leer.nextInt();

        }

        System.out.println("Gracias por su visita!");
    }
}
