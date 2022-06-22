class diaSemana:
    __cantidad = float(0)
    __porcentaje = float(0)
    __cantidadFinal = float(0)

    # Metodo constructor
    def __init__(self, cantidad, porcentaje):
        self.__cantidad = float(0)
        self.__porcentaje = float(0)
        self.calcularCantidadFinal()

    # Metodo destructor
    def __del__(self):
        self.calcularCantidadFinal()

    # Sobrecarga de operadores
    def __str__(self):
        return "el" + self.__porcentaje + "de" + self.__cantidad + "es" + self.__cantidadFinal

    # Metodo de clase
    @classmethod
    def calcularCantidadFinal(cls, cantidad, porcentaje):
        cantidadFinal = cantidad * porcentaje
        return cantidadFinal

    # Metodo de instancia
    def calcularCantidadFinal(self):
        self.__cantidadFinal = self.__cantidad * self.__porcentaje

    def get_cantidadFinal(self):
        return self.__cantidadFinal
