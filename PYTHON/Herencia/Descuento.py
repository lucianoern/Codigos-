from abc import ABC


class Descuento(ABC):
    _cantidadFinal = float(0)

    @staticmethod
    def calcularCantidadFinal():
        pass

    def getCantidadFinal(self):
        return self._cantidadFinal

class precioFinal(Descuento):
    __cantidad = float(0)
    __porcentaje = float(0)

    def __init__(self, cantidad, porcentjae):
        self.__cantidad = cantidad
        self.__porcentaje = porcentjae
        self.calcularCantidadFinal()

    def calcularCantidadFinal(self):
        self._cantidadFinal = self.__cantidad * self.__porcentaje

