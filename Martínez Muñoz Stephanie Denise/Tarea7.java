
import java.util.Scanner;//Librería Scanner

class Tarea7 {//Se declara la clase Tarea7

    public static void main(String[] args) {//Método main
        Scanner opc = new Scanner(System.in);//Creación del objeto Scanner
        System.out.println("Ingresa el lado del cuadrado");//Se pide al usuario ingresar un lado
        double l1 = opc.nextDouble();//Se escanea el dato que ingresará el usuario
        System.out.println("Ingresa el segundo lado del cuadrado");//Se pide al usuario ingresar otro lado
        double l2 = opc.nextDouble();//Se escanea el segundo dato que ingresará el usuario
        System.out.println(area(l1, l2));//Se manda a llamar la función
    }//Llave que cierra el main

    public static double area(double lado1, double lado2) {//Se crea la función área
        return lado1 * lado2;//Se realiza la operación
    }//Llave que cierra la función
}//Llave que cierra la clase
