/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class MenuVegetariano extends MenuRestaurante {

    @Override
    public Entrada crearEntrada() {
        System.out.println("Cocinando entrada vegetariana...");
        return new Entrada();
    }

    @Override
    public Plato crearPlato() {
        System.out.println("Cocinando plato vegetariano...");
        return new Plato();
    }

    @Override
    public Bebida crearBebida() {
        System.out.println("Sirviendo bebida vegetariana...");
        return new Bebida();
    }

    @Override
    public Postre crearPostre() {
        System.out.println("Cocinando postre vegetariano...");
        return new Postre();
    }

}
