from Metodos import diaSemana
from Metodos.diaSemana import *


def main():
    # Metodo de clase
    print("Metodo de clase")
    print(diaSemana.calcularCantidadFinal(50, 0.10))

    # Metodo de instancia
    print("Metodo de instancia")
    print(diaSemana.calcularCantidadFinal(50, 0.10))


if __name__ == '__main__':
    main()
