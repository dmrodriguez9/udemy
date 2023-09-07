import re

""" texto="Este auto verde es muy rapido"
patron="auto"
encontrado=re.search(patron,texto)
if encontrado:
    #print("Patron {} ha sido encontrado".format(patron))
    print(f"Patron {patron} ha sido encontrado")
    ini=encontrado.start()
    fin=encontrado.end()
    #print("Patron {} empieza en la posicion {}  y termina en {} ".format(patron,ini,fin)) 
    print(f"Patron {patron} empieza en la posicion {ini} y termina en {fin} ")
else:
    #print("Patron {} no encontrado".format(patron))
    print(f"Patron {patron} no encontrado") """

"""#Ver la cantidad que se repite una palabra en una oracion
texto="Me gusta el color amarillo y por eso he comprado pintura amarillo"
patron="amarillo"
resultado=re.findall(patron,texto)
print(resultado)
veces=len(resultado)
print(veces)"""


texto="Me gusta el color amarillo y por eso compre pintura de color amarillo"
patrones=["color","amarillo"]
for patron in patrones:
    print(f"Estamos buscando por el patron {patron}")
    resultado=re.findall(patron,texto)
    veces=len(resultado)
    print(veces)

