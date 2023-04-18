/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulo;
public class Calculos {
    public static double Perimetro(double lado){
        double perimetro;
        perimetro = 3*lado;
        return perimetro;
    }
    public static double Altura(double lado){
        double altura;
        altura=(Math.sqrt(3)/2)*lado;
        return altura;
    }
    public static double Area(double lado){
        double area;
        area=(lado*Calculos.Altura(lado))/2;
        return area;
    }
}
