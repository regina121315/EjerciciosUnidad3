import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("escribe un numero");
        int a=sc.nextInt();
        System.out.println("dame otro numero");
        int b= sc.nextInt();
        int r= sumaResultado(a,b);
        System.out.println("tu resultado es: " +r);
    }
    public static int sumaResultado(int y, int x){
        return  x + y;
    }
}