/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero_mayor;
public class Numero {
    public static String Mayor(String numeros){
        String list[] = numeros.split(",");
        int i; double mayor=0;
        for (i=0;i<list.length;i++){
            if (Double.parseDouble(list[i].strip())>mayor)
                mayor=Double.parseDouble(list[i].strip());
        }
        return "El número mayor es "+mayor;
    }
}
