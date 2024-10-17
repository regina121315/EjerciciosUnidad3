import java.util.Scanner;
class Ejercicio6{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa la base");
        double a=sc.nextDouble();
        System.out.println("Ingresa la altura ");
        double b=sc.nextDouble();
        double r= baseporaltura (a,b);
        System.out.println("El area es: " + r + " Metros");

    }
    public static double baseporaltura(double x , double y){
return x*y;
    }
        
    }

