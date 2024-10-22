//Tipo de libreria
import java.util.Scanner;
    //Nombre de la clase
    class Ejercicio6{
    //Metodo main
    public static void main(String [] args){
        //Objeto scanner
        Scanner op = new Scanner(System.in);
        //Pide al usuario una base
        System.out.println("Ingresa una base: ");
        //Guarda el dato en la variable base
        double base = op.nextDouble();
        //Pide al usuario una altura
        System.out.println("Ingresa una altura: ");
        //Guarda el dato en la variable altura
        double altura = op.nextDouble();
        //Manda a llamar a la funcion
        double area = area(base,altura);
        //Imprime el resultado del area
        System.out.println("El area es " + area);
    }
    //hace la funcion
    public static double area(double base, double altura){
        //realiza la operacion
        return base * altura;
    }
}