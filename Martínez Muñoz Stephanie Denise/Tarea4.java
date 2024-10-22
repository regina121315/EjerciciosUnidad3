
import java.util.Scanner;//Librería Scanner

class Tarea4 {//Se declara la clase Tarea4

    public static void main(String[] args) {//Método main
        Scanner opc = new Scanner(System.in);//Creación del objeto Scanner
        System.out.println("Ingresa un número");//Se pide al usuario ingrasar un número
        int a = opc.nextInt();//Se escanea el dato que ingresará el usuario
        System.out.println("Ingresa otro número");//Se pide al usuario ingrasar otro número
        int b = opc.nextInt();//Se escanea el segundo dato que ingresará el usuario
        System.out.println(dividir(a, b));//Se manda a llamar la función
    }//Llave que cierra el main

    public static int dividir(int x, int y) {//Se crea la función dividir
        return x / y;//Se realiza la operación
    }//Llave que cierra la función
}//Llave que cierra la clase
