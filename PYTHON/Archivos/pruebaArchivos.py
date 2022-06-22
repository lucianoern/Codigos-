from abc import ABCMeta


class Descuento(ABCMeta):

    # Metodo de clase
    @staticmethod
    def calcularCantidadFinal(cantidad, porcentaje):
        cantidadFinal = cantidad * porcentaje
        return cantidadFinal


class pruebaArchivos:

    def leerArchivo(self, archivo):
        file = open(archivo, 'r')
        lineas = []
        lineas_archivo = []
        for linea in file.readlines():
            lineas.append(linea.replace('\n', '').split(";"))
        file.close()
        for f in range(0, len(lineas)):
            try:
                lineas_archivo.append(
                    [int(lineas[f][0]), int(lineas[f][1])])
            except ValueError:
                lineas_archivo.append([0, 0.0])
        return lineas_archivo

    def descuento1(self, lista):
        resultados = []
        for f in range(0, len(lista)):
            resultados.append(Descuento.calcularCantidadFinal(
                lista[f][0], lista[f][1]))
        return resultados

    def guardarResultados(self, entrada, resultados):
        file = open("resultados.txt", 'w')
        file.write('cantidad;descuento;precioFinal\n')
        for f in range(0, len(entrada)):
            linea = str(entrada[f][0]) + ';' + str(entrada[f][1]) + ';' + str(resultados[f]) + '\n'
            file.write(linea)
        file.close()


if __name__ == "__main__":
    prueba = pruebaArchivos()
    archivo = []
    archivo = prueba.leerArchivo("datos.txt")
    resultado = prueba.descuento1(archivo)
    prueba.guardarResultados(archivo, resultado)
