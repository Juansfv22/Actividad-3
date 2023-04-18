/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;
public class Matricula {
    public static double ValorPago(double patrimonio, int estrato){
        double valor_pago = 50000;
        if (patrimonio>2000000 && estrato>3)
            valor_pago+=patrimonio*0.03;
        return valor_pago;
    }
}
