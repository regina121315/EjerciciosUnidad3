//Tipo de libreria
import java.util.Scanner;
    //Nombre de la clase
    class Ejercicio7{
    //Metodo main
    public static void main(String [] args){
        //Objeto scanner
        Scanner op = new Scanner(System.in);
        //Pide al usuario un lado 
        System.out.println("Ingresa un lado: ");
        //Guarda el dato en la variable lado
        double lado = op.nextDouble();
        //Manda a llamar a la funcion
        double area = area(lado);
        //Imprime el resultado del area
        System.out.println("El area es " + area);
    }
    //hace la funcion
    public static double area(double lado){
        //realiza la operacion
        return lado * lado;
    }
}