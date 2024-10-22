
import java.util.Scanner;//Librería Scanner

class Tarea13 {//Se declara la clase Tarea13

    public static void main(String[] args) {//Método main
        Scanner opc = new Scanner(System.in);//Ceación del objeto Scanner
        int a;//Declaración de variable entera
        do { //Inicio del bucle do while
            System.out.println("Ingresa un número: ");//Se le pide un número al usuario
            a = opc.nextInt();//Se escanea el dato ingresado por el usuario
            validar(a);//Se manda a llamar la función
        } while (a < 20);//Condición del bucle do while
        System.out.println("Numero ingresado: " + a);//Se imprime mensaje en pantalla
    }

    public static void validar(int x) {//Se crea la función validar
        if (x < 20) {//Se realiza la condición If
            System.out.println("El número ingresado no es mayor a 20");//Impresión de mensaje en pantalla
        }//Llave que cierra la condición If
    }//Llave que cierra la función
}//Llave que cierra la clase
