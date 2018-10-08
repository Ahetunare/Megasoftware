package fiesta;
import java.util.Scanner;
import java.io.IOException;
public class Persona 
{
    String nombre, genero;
    int edad, id;
    
    public Persona()
    {
        nombre = "desconocido";
        genero = "desconocido";
        edad = 0;
        id = 0;
    }
    public static void lectura(String s) throws IOException
    {
        Scanner as = new Scanner(System.in);
        s = as.nextLine();
    }
}
/*La intención es crear un algoritmo que lea un string con el formato [NOMBRE APELLIDO, EDAD, SEXO]
**y que clasifique cada dato en los atributos de un objeto "persona". No es posible utilizar un 
**array pues los tipos de datos son distintos. Se podría convertir cada tipo de dato a String, pero
**esto implicaría conversiones cada vez que se necesite acceder al dato.

**Para almacenar los datos de una vez, el método a utilizar es una función que determine la
**longitud del String a leer y luego haga un for cuya instrucción sea leer los caracteres que 
**conforman el String de manera secuencial, de modo que cada vez que encuentre una coma, cree un
**substring que luego será convertido al tipo de dato correspondiente. */