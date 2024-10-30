//tipo de libreria
import java.util.Stack;
    //nombre de la clase
    class Pilita1{
        //metodo main
        public static void main(String[] args) {
            //manda a llamar el stack con el nombre pila1
            Stack<Integer> Pila1 = new Stack<>();
            //manda a llamar el stack con el nombre pila2
            Stack<Integer> Pila2 = new Stack<>();
            //crea un arreglo
            int[] a = {3, 5, 4, 1, 2};
        //implementa un ciclo con el for
        for (int numero : a) {
            //imprime y arregla
            Pila1.push(numero);
            }
            //imprime la pila1
            System.out.println("pila original: " + Pila1);
            
            while(!Pila1.isEmpty()){
                //guarada la pila1 en la variable b
                int b = Pila1.pop();
                
                while(!Pila2.isEmpty() && Pila2.peek() > b){
                    //agrega un dato en la pila
                    Pila1.push(Pila2.pop());
                }
                //agrega un dato en la pila
                Pila2.push(b);
            }
            //imprime la pila2
            System.out.println("Pila ordenada: " + Pila2);
        }
    }