import java.util.Scanner;
class Ejercicio9{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa el perimetro");
        double a=sc.nextDouble();
        System.out.println("Ingresa la apotema ");
        double b=sc.nextDouble();
        double r= perimetroporapotema (a,b);
        System.out.println("El area es: " + r + " Metros");

    }
    public static double perimetroporapotema(double x , double y){
return x*y/2;
    }
        
    }