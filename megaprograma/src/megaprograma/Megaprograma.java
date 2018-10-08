//le puse megaprograma porque de hecho creo que será el software más grande
//que he hecho
package megaprograma;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
public class Megaprograma 
{
    static void showMenu()
    {
        
    }
    
    static void e1(int a, int b)
    {
        int acumulador = 0;
        while(a<b-1){
            acumulador += a+1;
            a += 1;
        }
        System.out.println("El resultado es "+acumulador);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Este programa junta todos los ejercicios del taller"
        + "\n \"PROBLEMAS PROPUESTOS PRIMITIVA CONDICIONAL REPETITIVA MIENTRAS QUE\""
        + "\n\n ingrese el número del ejercicio al que desea acceder."
        + "ingrese 0 para salir");
        
        int entrada;
        try
        {
            entrada = sc.nextInt();
            switch (entrada)
            {
                case 1:
                    int num1, num2;
                    System.out.println("\nHallar la suma de los enteros entre dos números."
                    + "\nIngrese el primer número");
                    num1 = sc.nextInt();
                    System.out.println("Ingrese el segundo número");
                    num2 = sc.nextInt();
                   if(num1>num2)
                   {
                       Megaprograma.e1(num2, num1);
                   }
                   else if(num1<num2)
                   {
                       Megaprograma.e1(num1, num2);
                   }
                   else{
                       System.out.println("La suma es 0, pues ambos números son iguales");
                   }
                   break;
                case 2:
                   break;
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Valor no válido");
        }
        catch(Exception e)
        {
            System.out.println("Un error desconocido a ocurrido");
        }
    }
    
}
