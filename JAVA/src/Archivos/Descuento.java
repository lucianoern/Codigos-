package Archivos;

public class Descuento {
    private int cantidad;
    private float porcentaje;
    private double cantidadFinal;

    public Descuento(int cantidad, float porcentaje) {
        this.cantidad = cantidad;
        this.porcentaje = porcentaje;
        this.calcularCantidadFinal();

    }
    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPorcentaje(){
        return cantidad;
    }
    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    public double getCantidadFinal(){
        return cantidadFinal;
    }
    public void calcularCantidadFinal(){
        this.cantidadFinal = this.cantidad * this.porcentaje;
    }
    public static void main(String[] args){
        Descuento descuento = new Descuento (50, (float) 0.10);
        System.out.println(descuento.getCantidadFinal());
    }
}

