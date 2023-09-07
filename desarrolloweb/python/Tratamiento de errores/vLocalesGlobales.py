#Varianbles globales
numero=30
texto="Hola"

def funcion1():
    #Variables locales solo existen en la función
    numero2=50
    saludo="Buenos días"
    print(numero2)
    print(saludo)
    print(locals()) #ver por consola las variables locales

#funcion1()

print(numero)
print(texto)
print(globals()) #ver por consola las variables globales