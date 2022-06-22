#Clase publica
class diaSemana1:
    __dia = ("")
    __costo = float(0.0)
    __error = ("el dia ingresado es incorrecto")
    __minutos = int(0)
    __horas = int(0)
    __duracionT = int(0)

    def calcularTiempo(self, horas, minutos):
        self.__minutos = minutos
        self.__horas = horas

        if 5 > self.__minutos >= 0:
            self.__duracionT = self.__horas + 0

        elif 5 <= self.__minutos <= 59:
            self.__duracionT = self.__horas + 1

    def conocercosto(self, dia, duracionT):
        self.__dia = dia
        self.__duracionT = duracionT

        if self.__dia == "lunes":
            self.__costo = (2 * self.__duracionT)
            return self.__costo

        elif self.__dia == "martes":
            self.__costo = (2 * self.__duracionT)
            return self.__costo

        elif self.__dia == "miercoles":
            self.__costo = (2 * self.__duracionT)
            return self.__costo

        elif self.__dia == "jueves":
            self.__costo = (2.5 * self.__duracionT)
            return self.__costo

        elif self.__dia == "viernes":
            self.__costo = (2.5 * self.__duracionT)
            return self.__costo

        elif self.__dia == "6":
            self.__costo = (3 * self.__duracionT)
            return self.__costo

        elif self.__dia == "domingo":
            self.__costo = (3 * self.__duracionT)
            return self.__costo

        else:
            return self.__error
