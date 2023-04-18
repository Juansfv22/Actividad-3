/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;
public class Salarios {
    public static double bruto(double horas_mes, double valor_hora){
        double salario_bruto;
        salario_bruto = horas_mes*valor_hora;
        return salario_bruto;
    }
    public static double neto(double salario_bruto, double retencion_fuente){
        double salario_neto;
        salario_neto = salario_bruto*(1-(retencion_fuente/100));
        return salario_neto;
    }
}
