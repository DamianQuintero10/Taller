
//Crear un programa que valore el salario neto semanal de los
//trabajadores de una empresa de acuerdo a las siguientes
//normas:
//• Horas semanales trabajadas <38 a una tasa.
//• Horas extras (38 o más) a una tasa 50% superior a la ordinaria.
//• Impuestos de 0%, si el salario bruto es menor o igual a 750 euros; 10%, si el 
//salario bruto es mayor que 750 euros.
//Lea los datos necesarios para calcular el salario de un trabajador.



package EJERCICIO7;

import java.util.Scanner;

public class EJERCICIO7 {

    
     
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int horast;
        double impuesto=0,tasaor, salariobruto, salariototal, aumentado=0, agregado;
        System.out.println("INGRESE HORAS TRABAJDAS");
        horast=entrada.nextInt();
        
        System.out.println("INGRESE TASA ORDINARIA POR HORAS");
        tasaor=entrada.nextInt();
        
        if(horast<30){
            salariobruto= horast*tasaor;
        }else{
            agregado=tasaor*0.5;
            aumentado=tasaor+agregado;
            salariobruto=horast*agregado;
        }
        if(salariobruto<=750){
            salariototal=salariobruto;
        }else{
            impuesto=salariobruto*0.1;
            salariototal=salariobruto-impuesto;
        }
        System.out.println("IMPUESTOS: "+ impuesto + "dolares");
         System.out.println("SALARIO BRUTO: "+ salariobruto + "dolares");
          System.out.println("SALARIO NETO: "+ salariototal + "dolares");
    }
    
}
