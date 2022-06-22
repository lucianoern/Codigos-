from abc import abstractmethod
from abc import ABCMeta


# Clase abstracta
class diaSemana(ABCMeta):

    @staticmethod
    def calcularCosto(dia, horas, minutos):

        if minutos < 5 and minutos >= 0:
            duracionT = horas + 0
        elif minutos >= 5 and minutos <= 59:
            duracionT = horas + 1

        if dia == "1":
            costo = (2 * duracionT)
            return costo

        elif dia == "2":
            costo = (2 * duracionT)
            return costo

        elif dia == "3":
            costo = (2 * duracionT)
            return costo

        elif dia == "4":
            costo = (2.5 * duracionT)
            return costo

        elif dia == "5":
            costo = (2.5 * duracionT)
            return costo

        elif dia == "6":
            costo = (3 * duracionT)
            return costo

        elif dia == "7":
            costo = (3 * duracionT)
            return costo
