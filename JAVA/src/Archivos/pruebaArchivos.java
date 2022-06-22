package Archivos;
import java.io.*;
import java.util.ArrayList;

public class pruebaArchivos {
    private ArrayList<String> contenidoArchivo = new ArrayList<>();
    private ArrayList<Descuento> listaEntrada = new ArrayList<>();
    private final String rutaWindows = "C:\\Documents\\Programacion\\Nueva carpeta\\Ernesto 2\\src\\Archivos\\datos.txt";
    public ArrayList<String> getContenidoArchivo() {
        return contenidoArchivo;
    }

    public ArrayList<Descuento> getListaEntrada() {
        return listaEntrada;
    }

    public void leerArchivo() {
        LeerArchivo leer = new LeerArchivo();
        this.contenidoArchivo =
                leer.leerArchivo(this.rutaWindows);
        for (int i = 0; i < this.contenidoArchivo.size(); i++) {
            String linea = this.contenidoArchivo.get(i);
            String elementosLinea[] = linea.split(";");
            try {
                int cantidad = Integer.parseInt(elementosLinea[0]);
                float porcentaje = Float.parseFloat(elementosLinea[1]);
                listaEntrada.add(new Descuento(cantidad, porcentaje));
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                listaEntrada.add(new Descuento(0, 0));
            }
        }
    }
    public void escribirArchivo(ArrayList<Descuento> lista){
        String archivo = "resultados.csv";
        File f = new File(archivo);
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write("");
            wr.append("Cantidad, Porcentaje, CantidadFinal\n");
            for (int i=0; i < lista.size(); i++){
                wr.append(lista.get(i).getCantidad() + "," + lista.get(i).getPorcentaje() +"," + lista.get(i).getCantidadFinal() +  "\n");
            }
            wr.close();
            bw.close();
        }catch(IOException e){

        }
    }
    public static void main (String args[]){
        pruebaArchivos prueba = new pruebaArchivos();
        prueba.leerArchivo();
        for (int i=0; i < prueba.getListaEntrada().size(); i++){
            System.out.println(prueba.getListaEntrada().get(i).getCantidad() +
                    "\t" + prueba.getListaEntrada().get(i).getPorcentaje() +
                    "\t" + prueba.getListaEntrada().get(i).getCantidadFinal());
        }
        prueba.escribirArchivo(prueba.getListaEntrada());
    }
}

