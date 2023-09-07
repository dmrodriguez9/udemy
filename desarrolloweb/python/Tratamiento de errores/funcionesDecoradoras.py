def asteriscos(funcion):
    def poner_asteriscos():
        print("***************")
        funcion()
        print("***************")
    return poner_asteriscos

@asteriscos  #modificar y lo mismo que la linea 12
def imprimir():
    print("Hola, buenos días")

#imprimir=asteriscos(imprimir)
imprimir()
