package Herencia;

public class precioFinal extends Descuento {
    private double cantidad;
    private double porcentaje;

    public precioFinal (double cantidad, double porcentaje){
        this.cantidad = cantidad;
        this.porcentaje = porcentaje;
        this.calcularCantidadFinal();
    }

    @Override
    public void calcularCantidadFinal() {
        this.cantidadFinal = this.cantidad * this.porcentaje;
    }
}
