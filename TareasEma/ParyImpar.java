//Tipo de libreria
import java.util.Stack;
    //Nombre de la clase
    class ParyImpar{
    //Metodo main
    public static void main(String[] args) {
        //Declara las pilas
        Stack<Integer> pilaPar = new Stack<Integer>();
        Stack<Integer> pilaImpar = new Stack<Integer>();
        //Itera el ciclo for
        for (int i = 1; i <= 30; i++) {
            //Itera el if si es par o impar
            if (i % 2 == 0) {
                pilaPar.push(i);
            }else{
                pilaImpar.push(i);
            }
        }
        //Imprime los numeros par y impar
        System.out.println("Pila Par: " + pilaPar);
        System.out.println("Pila Impar: " + pilaImpar);
    }
}