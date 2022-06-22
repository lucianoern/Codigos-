package Herencia;

public abstract class Descuento {
    protected double cantidadFinal;

    public abstract void calcularCantidadFinal();

    public double getCantidadFinal() {return this.cantidadFinal;}
}
