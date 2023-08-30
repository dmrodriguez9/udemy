lista=[1,2,3,4]

""" def verificarNumeroParImpar(numero):
    resultado=(numero%2)==0
    return resultado

filtro=filter(verificarNumeroParImpar,lista)
pares= list(filtro) #Crea una lista con los numeros pares
print(pares) """

filtro=filter(lambda numero: (numero%2)==0,lista)
pares=list(filtro)
print(pares)