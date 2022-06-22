package clasesAP;
//Clase publica
public class Descuento1 {
    public double cantidad;
    public double porcentaje;
    public double cantidadFinal;

    public Descuento1(double cantidad, double porcentaje) {
        this.cantidad = cantidad;
        this.porcentaje = porcentaje;
        this.cantidadFinal = this.cantidad * this.porcentaje;
    }

    public double getCantidadFinal() {
        return cantidadFinal;
    }
}
