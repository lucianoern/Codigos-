package Metodos;
import Metodos.diaSemana;

public class Main {
    public static void main (String[] args) {
        System.out.println ("Metodo constructor");
        diaSemana diaSemana = new diaSemana(50, 0.10);

        System.out.println ("Metodo de instancia");
        System.out.println(diaSemana.calcularCantidadFinal(50, 0.10));

        System.out.println ("Metodo de clase");
        System.out.println(diaSemana.calcularCantidadFinal(50, 0.10));

    }
}
