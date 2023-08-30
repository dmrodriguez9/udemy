class Persona():
    texto= '' #otro tributo
    def __init__(self,nombre): #funcion de la inicializacion de la clase
        self.nombre=nombre   #crea el atributo
    def saludar(self):
        self.texto="Hola, mi nombre es " + self.nombre
        return self.texto

persona1= Persona("Danny")  #Creamos un objeto de la clase persona
print(type(persona1))
print(persona1.nombre)
mensaje= persona1.saludar()
print(mensaje)

#Herencia

class Adulto(Persona):
    def __init__(self, nombre):
        Persona.__init__(self,nombre)
    def saludar(self):   #sobrescribiendo la funcion
        self.texto="Hola, soy adulto"
        return self.texto
    def grabarTarjeta(self,tarjeta):
        self.tarjeta=tarjeta
    def __str__(self):
        self.texto ="Adulto: nombre = " + self.nombre
        return self.texto
    
adulto1= Adulto("Danny")
print(type(adulto1))
mensaje=adulto1.saludar()
print(mensaje)
adulto1.grabarTarjeta("1723983827")
print(adulto1.tarjeta)
print(adulto1)

