from django.shortcuts import render
from django.http import HttpResponse
from aplicacion1.models import Webs

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
    lista_webs=Webs.objects.order_by('nombre')
    diccionario={'lista_webs':lista_webs}
    return render(request,"aplicacion1/portada.html",context=diccionario)