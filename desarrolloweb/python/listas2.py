lista =[ 2,4 ,"amarillo",5,"Danny"]
print(lista)
#Para el eliminar el ultimo elemento de la lista
#lista.pop()
#print(lista)

#lista.pop(0)
#print(lista)

#Darle una vuelta a una lista
lista.reverse()
print(lista)

#ordenarLista
lista=[5,9,2,3,1]
lista.sort()
print(lista)

#listas anidadas
lista=[1,2,3,4,["verde","rojo"]]
print(lista)

#accediendo a los elementos de una lista de otra lista
elemento=lista[4][1]
print(elemento)

#Lista que a su vez tienen otras listas
matriz=[[1,2,3], ["Danny","Natasha","Belen"], ["Cuadrado","Rectangulo","Trianguulo"]]
listaNueva=[ elemento[0] for elemento in matriz]
print(listaNueva)