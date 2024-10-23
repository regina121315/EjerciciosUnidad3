
import java.util.Scanner;//Librería Scanner

class Tarea6 {//Se declara la clase Tarea6

    public static void main(String[] args) {//Método main
        Scanner opc = new Scanner(System.in);//Creación del objeto Scanner
        System.out.println("Ingresa la base del rectángulo");//Se pide al usuario ingrasar la base
        double b = opc.nextDouble();//Se escanea el dato que ingresará el usuario
        System.out.println("Ingresa la altura del rectángulo");//Se pide al usuario ingrasar la altura
        double h = opc.nextDouble();//Se escanea el segundo dato que ingresará el usuario
        System.out.println(area(b, h));//Se manda a llamar la función
    }//Llave que cierra el main

    public static double area(double base, double altura) {//Se crea la función área
        return base * altura;//Se realiza la operación
    }//Llave que cierra la función
}//Llave que cierra la clase
