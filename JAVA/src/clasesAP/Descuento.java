package clasesAP;
//Clase abstracta
public abstract class Descuento {

    public static double calcularDescuentoDeCantidad(double cantidad, double porcentaje) {
        double cantidadFinal = cantidad * porcentaje;
        return cantidadFinal;

    }
}
