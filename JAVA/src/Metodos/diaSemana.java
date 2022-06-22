package Metodos;

public class diaSemana {
    private final double cantidad;
    private double porcentaje;
    private double cantidadFinal;

    //Metodo Constructor
    public diaSemana(double cantidad, double porcentaje) {
        this.cantidad = cantidad;
        this.porcentaje = porcentaje;
        this.calcularCantidadFinal();

    }
    //Metodo De Clase
    public static double calcularCantidadFinal(double cantidad, double porcentaje) {
        double cantidadFinal = cantidad * porcentaje;
        return cantidadFinal;
    }

    //Metodo De Instancia
    public double calcularCantidadFinal(){
        this.cantidadFinal = this.cantidad * this.porcentaje;
        return cantidadFinal;
    }

}
