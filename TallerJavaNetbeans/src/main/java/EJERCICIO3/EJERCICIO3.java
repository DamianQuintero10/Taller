/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EJERCICIO3;
import java.util.Scanner;
/**
 *
 * @author HOME
 */
public class EJERCICIO3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n;
        int i;
        double suma=0;
        System.out.print("DIGITE NUMERO DE DATOS A SUMAR");
        n=entrada.nextInt();
        for(i=1;i<=n;i++){
            suma=n/Math.pow(2,n);
        }
       System.out.println("LA SUMA ES: "+suma);
        
    }
}
