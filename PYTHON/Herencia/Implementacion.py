from Herencia.Descuento import precioFinal


def main():
    descuentos = precioFinal(50, 0.10)
    print("El descuento sera de:")
    print(descuentos.getCantidadFinal())


if __name__ == "__main__":
    main()
