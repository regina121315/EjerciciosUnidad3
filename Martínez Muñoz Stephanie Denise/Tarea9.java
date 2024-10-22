
import java.util.Scanner;//Librería Scanner

class Tarea9 {//Se declara la clase Tarea9

    public static void main(String[] args) {//Método main
        Scanner opc = new Scanner(System.in);//Creación del objeto Scanner
        System.out.println("Ingresa el perímetro del polígono");//Se pide al usuario ingresar el perímetro
        double p = opc.nextDouble();//Se escanea el dato que ingresará el usuario
        System.out.println("Ingresa el apotema del polígono");//Se pide al usuario ingresar el apotema
        double a = opc.nextDouble();//Se escanea el segundo dato que ingresará el usuario
        System.out.println(area(p, a));//Se manda a llamar la función
    }//Llave que cierra el main

    public static double area(double perímetro, double apotema) {//Se crea la función área
        return (perímetro * apotema) / 2;//Se realiza la operación
    }//Llave que cierra la función
}//Llave que cierra la clase
