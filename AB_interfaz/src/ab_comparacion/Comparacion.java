/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ab_comparacion;
public class Comparacion {
    public static String Comparar(double a, double b){
        if (a>b)
            return a+" es mayor que "+b;
        else if (a<b)
            return a+" es menor que "+b;
        else
            return a+" es igual que "+b;
    }
}
