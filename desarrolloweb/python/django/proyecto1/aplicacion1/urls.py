from django.urls import re_path
from aplicacion1 import views

app_name='aplicacion1'

urlpatterns=[
    re_path('pagina4/',views.pagina4, name='pagina4'),
    re_path('pagina5/',views.pagina5, name='pagina5'),
    re_path('plantilla/',views.plantilla, name='plantilla'),


]