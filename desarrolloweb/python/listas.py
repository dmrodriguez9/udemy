lista = [1,2,3]
print(lista)

lista =[4,5,6,"Danny","Hola",7,8,9,10]
print(lista)

elemento= lista[2:4] #2 imprime, #4-1 imprime
print(elemento)

nuevosElementos= ["Amarillo","Azul","Rojo"]
#lista.append(nuevosElementos) #añade como una lista
lista.extend(nuevosElementos) #une con los demas elementos y pasan a ser elementos
print(lista)

elemento= lista[9]
print(elemento)
