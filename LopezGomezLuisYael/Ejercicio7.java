import java.util.Scanner;
class Ejercicio7{
    public static void main(String[] args) {
        //crear Scanner 
        Scanner sc=new Scanner(System.in);
        //solicitar datos
        System.out.println("Ingresa el lado");
        double a= sc.nextDouble();
        //crear variable de resultado
        double r= obtenerarea(a);
        //imprimir resultado
System.out.println("El area es: " + r +" Metros");
    }
    //aplicar funcion
    public static double obtenerarea(double x){
        return x*x;
    }
}