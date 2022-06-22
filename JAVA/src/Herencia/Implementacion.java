package Herencia;

public class Implementacion {
    public static void main(String[] args) {

        // Clase hija 1
        precioFinal descuento = new precioFinal(50, 0.10);

        System.out.println(descuento.getCantidadFinal());
    }
}