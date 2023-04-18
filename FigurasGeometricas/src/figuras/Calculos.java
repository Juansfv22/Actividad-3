/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;
public class Calculos {
    public class Circulo{
        static double Area(double radio) { 
            return Math.PI*Math.pow(radio,2); 
        } 
        static double Perímetro(double radio) { 
            return 2*Math.PI*radio; 
        } 
        public static String datos(double radio){
            return "El area del circulo es de "+Circulo.Area(radio)+"\ny el perimetro es de "+Circulo.Perímetro(radio);
        }
    }
    public class Cuadrado{
        static double Area(double lado) { 
            return  lado*lado; 
        } 
        static double Perímetro(double lado) { 
            return  4*lado; 
        } 
        public static String datos(double lado){
            return "El area del cuadrado es de "+Cuadrado.Area(lado)+"\ny el perimetro es de "+Cuadrado.Perímetro(lado);
        }
    }
    public class Rectangulo{
        static double Area(double base, double altura) { 
            return   base * altura; 
        } 
        static double Perímetro(double base, double altura) { 
            return  2*base + 2*altura;
        } 
        public static String datos(double base, double altura){
            return "El area del rectangulo es de "+Rectangulo.Area(base,altura)+"\ny el perimetro es de "+Rectangulo.Perímetro(base,altura);
        }
    }
    public class TrianguloRectangulo{
        static double Area(double base, double altura) { 
            return   (base * altura)/2; 
        } 
        static double Perímetro(double base, double altura) { 
            return  base+altura+TrianguloRectangulo.Hipotenusa(base, altura);
        }
        static double Hipotenusa(double base, double altura){
            return Math.sqrt(base*base + altura*altura);
        }
        static String Tipo(double base, double altura){
            Double h = TrianguloRectangulo.Hipotenusa(base, altura);
            if (base==altura && base==h)
                return "equilatero";
            else if (base!=altura && base!=h)
                return "escaleno";
            else
                return "isosceles";
        }
        public static String datos(double base, double altura){
            return "El triangulo es "+TrianguloRectangulo.Tipo(base, altura)+",\ntiene un area de "+TrianguloRectangulo.Area(base, altura)+",\nun perimetro de "+TrianguloRectangulo.Perímetro(base, altura)+"\ny una hipotenusa de "+TrianguloRectangulo.Hipotenusa(base, altura);
        }
    }
}
