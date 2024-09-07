/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leccion;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;


/**
 *
 * @author Usuario
 */
public class Leccion {

   public static void main(String[] args) {
        try {
            // URL del servicio WSDL
            URL url = new URL("http://www.dneonline.com/calculator.asmx?WSDL");

            // QName del servicio y el puerto
            QName qname = new QName("http://tempuri.org/", "Calculator");
            QName portName = new QName("http://tempuri.org/", "CalculatorSoap");

            // Crear la instancia del servicio
            Service service = Service.create(url, qname);

            // Obtener el puerto del servicio
            CalculatorSoap calculator = service.getPort(portName, CalculatorSoap.class);

            // Llamar a los métodos del servicio
            int resultAdd = calculator.add(10, 5);
            System.out.println("Resultado de la suma: " + resultAdd);

            int resultSubtract = calculator.subtract(10, 5);
            System.out.println("Resultado de la resta: " + resultSubtract);
        } catch (Exception e) {
            // Manejar errores de la llamada SOAP
            System.out.println("Error al llamar al servicio SOAP: " + e.getMessage());
        }
    }
}
