/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class MenuSaludable extends MenuRestaurante {

    @Override
    public Entrada crearEntrada() {
        System.out.println("Cocinando entrada saludable...");
        return new Entrada();
    }

    @Override
    public Plato crearPlato() {
        System.out.println("Cocinando plato saludable...");
        return new Plato();
    }

    @Override
    public Bebida crearBebida() {
        System.out.println("Sirviendo bebida saludable...");
        return new Bebida();
    }

    @Override
    public Postre crearPostre() {
        System.out.println("Cocinando postre saludable...");
        return new Postre();
    }

}
