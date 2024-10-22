
import java.util.Scanner;//Librería Scanner

class Tarea8 {//Se declara la clase Tarea8

    public static void main(String[] args) {//Método main
        Scanner opc = new Scanner(System.in);//Creación del objeto Scanner
        System.out.println("Ingresa la base del triángulo");//Se pide al usuario ingresar la base
        double b = opc.nextDouble();//Se escanea el dato que ingresará el usuario
        System.out.println("Ingresa la base del triángulo");//Se pide al usuario ingresar la altura
        double h = opc.nextDouble();//Se escanea el segundo dato que ingresará el usuario
        System.out.println(area(b, h));//Se manda a llamar la función
    }//Llave que cierra el main

    public static double area(double base, double altura) {//Se crea la función área
        return (base * altura) / 2;//Se realiza la operación
    }//Llave que cierra la función
}//Llave que cierra la clase
