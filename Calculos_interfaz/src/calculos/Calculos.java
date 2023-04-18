/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos;
public class Calculos {
    public static String Raiz(String numeros){
        String list[] = numeros.split(",");
        int i;
        for (i=0;i<list.length;i++){
           list[i]=String.valueOf(Math.sqrt(Integer.parseInt(list[i].strip())));
        }
    return String.join(" , ", list);
    }
    public static String Cuadrado(String numeros){
        String list[] = numeros.split(",");
        int i;
        for (i=0;i<list.length;i++){
           list[i]=String.valueOf(Math.pow(Integer.parseInt(list[i].strip()),2));
        }
    return String.join(" , ", list);
    }
    public static String Cubo(String numeros){
        String list[] = numeros.split(",");
        int i;
        for (i=0;i<list.length;i++){
           list[i]=String.valueOf(Math.pow(Integer.parseInt(list[i].strip()),3));
        }
    return String.join(" , ", list);
    }
}
