
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

            Entrada entrada = menu.crearEntrada();
            Plato plato = menu.crearPlato();
            Bebida bebida = menu.crearBebida();
            Postre postre = menu.crearPostre();
            
            System.out.println("\n");
            
            entrada.preparar();
            plato.preparar();
            bebida.preparar();
            postre.preparar();
            

            System.out.println("Desea ordenar otro plato?");
            System.out.println("(1)Si    (2)No: ");
            opc1 = leer.nextInt();

        }

        System.out.println("Gracias por su visita!");
    }
}
