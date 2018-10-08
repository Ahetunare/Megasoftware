package fiesta;
import java.util.Scanner;
import java.util.ArrayList;
public class Fiesta 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int menu1, menu2;
        //la variable nullpoint debería resolver el bug de la función nextLine
        String clave, confirm, nullpoint;
        System.out.println("¡Simulador de fiesta!"
                + "\n\n¿quieres empezar una fiesta? digita 1"
                + "\ndigita 0 para salir :'(");
        menu1 = sc.nextInt();
        switch(menu1)
        {
            case 1:
                System.out.println("Primero, debes crear una clave de administrador.");
                
                /*por ahora, no se me ocurre nada más que obligar al usuario a repetir eternamente
                  hasta que las claves coincidan*/
                do
                {
                    System.out.println("ingresa tu clave a continuación:");
                    clave = sc.nextLine();
                    System.out.println("\nPor favor, confirma tu clave");
                    confirm = sc.nextLine();
                    if(clave.equals(confirm))
                    {
                        System.out.println("Clave confirmada. Presiona enter para continuar");
                        nullpoint = sc.nextLine();
                    }
                    else
                    {
                        System.out.println("Las claves no coinciden, vuelve a intentarlo");
                    }
                }
                while(!clave.equals(confirm));
                System.out.println("\n Bueno, ¡empecemos esta fiesta!");
                System.out.println("ingresa el número que corresponda a la opción a elegir:"
                        + "\n1. Añadir invitados"
                        + "\n2. Ver lista de invitados"
                        + "\n3. Ver lista de rechazados"
                        + "\n4. Cambiar clave"
                        + "\n5. Terminar/cancelar fiesta");
                
        }
    }
    
}
