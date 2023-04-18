/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuacion;
public class Soluciones {
    public static double X1(double A, double B, double C){
        double x1;
        x1 = (-B+Math.sqrt(Math.pow(B,2)-4*A*C))/(2*A);
        return x1;
    }
    public static double X2(double A, double B, double C){
        double x2;
        x2 = (-B-Math.sqrt(Math.pow(B,2)-4*A*C))/(2*A);
        return x2;
    }
}
