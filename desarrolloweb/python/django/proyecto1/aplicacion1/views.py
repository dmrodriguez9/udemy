from django.shortcuts import render
from django.http import HttpResponse
from aplicacion1.models import Webs
from aplicacion1.models import Temas #ejercicio2
from aplicacion1 import forms
#from . import forms #El . hace referencia a los archivos de la carpeta aplicacion1 es decir se cambia al archivo deseado

# Create your views here.
def vista1(request):
    return HttpResponse("Hola, buenas tardes")

def vista2(request):
    return HttpResponse("Holi, Scarleth")

def vista3(request):
    diccionario={'etiqueta':'Este es el valor de la etiqueta'}
    return render(request,"aplicacion1/pagina1.html",context=diccionario)

def vista4(request):
    diccionario={'etiqueta2':'Este es el nuevo valor de la etiqueta'}
    return render(request,"aplicacion1/pagina2.html",context=diccionario)

def vista5(request):
    diccionario={}
    return render(request,"aplicacion1/pagina3.html",context=diccionario)

def vista6(request):
    lista_temas=Temas.objects.all()
    lista_webs=Webs.objects.order_by('nombre')
    diccionario={'lista_webs':lista_webs,'lista_temas':lista_temas}
    return render(request,"aplicacion1/portada.html",context=diccionario)

def vista7(request):
    formulario=forms.Formulario()
    diccionario={'formulario':formulario}
    
    if request.method== 'POST':
        formulario1= forms.Formulario(request.POST)
        if formulario1.is_valid():
            nombre=formulario1.cleaned_data['nombre']
            correo=formulario1.cleaned_data['email']
            print("Nombre: "+ nombre)
            print("Correo electrónico: "+ correo)

    return render(request,"aplicacion1/formulario.html",context=diccionario)

def pagina4(request):
    diccionario={'texto': 'Hola buenos días', 'numero':300}
    return render(request,"aplicacion1/pagina4.html",context=diccionario)

def pagina5(request):
    diccionario={}
    return render(request,"aplicacion1/pagina5.html",context=diccionario)

def plantilla(request):
    diccionario={}
    return render(request,"aplicacion1/plantilla.html",context=diccionario)


#ejercicio1
def vista8(request):
    diccionario={'etiqueta3':'Esta etiqueta pertenece a la pagina 6'}
    return render(request,"aplicacion1/pagina6.html",context=diccionario)

