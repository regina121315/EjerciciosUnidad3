//Tipo de libreria
import java.util.Scanner;
    //Nombre de la clase
    class Ejercicio2{
    //Metodo main
    public static void main(String [] args){
        //Objeto scanner
        Scanner op = new Scanner(System.in);
        //Pide al usuario un dato
        System.out.println("Ingresa un Numero: ");
        //Guarda el dato en la variable a
        int a = op.nextInt();
        //Pide al usuario otro dato
        System.out.println("Ingresa otro Numero: ");
        //Guarda el dato en la variable b
        int b = op.nextInt();
        //Manda a llamar a la funcion y imprime el resultado
        System.out.println(restar(a,b));
    }
    //hace la funcion
    public static int restar(int x, int y){
        //realiza la operacion
        return x - y;
    }
}