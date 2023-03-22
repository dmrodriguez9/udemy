#Diccionarios en python; Es un almacen de datos, se forman por clave y valor 

diccionario={"clave":"valor", "clave2":"valor2", "clave3":"valor3"} #Va en pares es decir clave y valor
print(diccionario)

#Para saber el valor de la clave que se requiera hacemos lo siguiente
elemento=diccionario["clave"]
print(elemento)

colores ={"amarillo":"yellow", "azul":"bluee", "rojo":"red"}
print(colores)

#cambiando el valor a una clave
colores["azul"]="blue"
print(colores)

#añadiendo mas colores
colores["celeste"]="skyblue"  #debemos acceder por la clave si deseamos los valores
print(colores)
