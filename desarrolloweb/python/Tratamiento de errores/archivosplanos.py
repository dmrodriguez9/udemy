
#Tratamiento de errores
try:
    fichero= open("datos1.txt","w")
    fichero.write("Estos son los datos para el fichero")
    fichero.close()
except IOError: #Podemos espcificar el tipo de error
    print("Error de tipo IOerror, El fichero no existe")
except: #Error de tipo general
    print("Error general")
else:
    print("Tratamiento de fichero correcto")
finally:
    print("Tratamiento del fichero finalizado")


print("Continua el programa")