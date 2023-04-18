/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;
public class Datos {
    public static String Informacion(String nombre, double salario_hora, double horas){
        double salario;
        salario = salario_hora*horas;
        if (salario>450000)
            return "El trabajador es "+nombre+"\ny tiene un salario de $"+salario;
        else
            return "El trabajador es "+nombre;
    }
}
