/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class MenuGourmet extends MenuRestaurante {

    @Override
    public Entrada crearEntrada() {
        System.out.println("Cocinando entrada gourmet...");
        return new Entrada();
    }

    @Override
    public Plato crearPlato() {
        System.out.println("Cocinando plato gourmet...");
        return new Plato();
    }

    @Override
    public Bebida crearBebida() {
        System.out.println("Sirviendo bebida gourmet...");
        return new Bebida();
    }

    @Override
    public Postre crearPostre() {
        System.out.println("Cocinando postre gourmet...");
        return new Postre();
    }

}
