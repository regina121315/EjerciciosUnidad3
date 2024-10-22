//Tipo de libreria
import java.util.Scanner;
    //Nombre de la clase
    class Ejercicio9{
    //Metodo main
    public static void main(String [] args){
        //Objeto scanner
        Scanner op = new Scanner(System.in);
        //Pide al usuario un perimetro
        System.out.println("Ingresa un perimetro: ");
        //Guarda el dato en la variable perimetro
        double perimetro = op.nextDouble();
        //Pide al usuario un apotema
        System.out.println("Ingresa un apotema: ");
        //Guarda el dato en la variable apotema
        double apotema = op.nextDouble();
        //Manda a llamar a la funcion
        double area = area(perimetro,apotema);
        //Imprime el resultado del area
        System.out.println("El area es " + area);
    }
    //hace la funcion
    public static double area(double perimetro, double apotema){
        //realiza la operacion
        return (perimetro * apotema)/2;
    }
}