//Tipo de libreria
import java.util.Scanner;
    //Nombre de la clase
    class Ejercicio5{
    //Metodo main
    public static void main(String [] args){
        //Objeto scanner
        Scanner op = new Scanner(System.in);
        //Pide al usuario un dato
        System.out.println("Ingresa un Numero: ");
        //Guarda el dato en la variable a
        int a = op.nextInt();
        //Guarda el la variable a en al modulo
        int modulo = (a);
        //Manda a llamar a la funcion y imprime el resultado
        System.out.println(modulo(a));
    }
    //hace la funcion
    public static int modulo(int a){
        //realiza la operacion
        return a % 1;
    }
}