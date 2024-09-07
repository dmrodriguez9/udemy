/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leccion;

/**
 *
 * @author Usuario
 */
import com.dneonline.calculator.*;

public class CalculatorSoap {

    public int add(int intA, int intB) {
        Calculator calculator = new Calculator(); // Instancia del servicio SOAP
        CalculatorSoap calculatorSoap = calculator.getCalculatorSoap(); // Obtener el puerto del servicio
        return calculatorSoap.add(intA, intB); // Llamar al método add del servicio SOAP
    }

    public int subtract(int intA, int intB) {
        Calculator calculator = new Calculator(); // Instancia del servicio SOAP
        CalculatorSoap calculatorSoap = calculator.getCalculatorSoap(); // Obtener el puerto del servicio
        return calculatorSoap.subtract(intA, intB); // Llamar al método subtract del servicio SOAP
    }
}
