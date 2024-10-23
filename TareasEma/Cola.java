//Tipo de libreria para la cola
import java.util.LinkedList;
import java.util.Queue;
    //Nombre de la clase
    class Cola{
        //Metodo main
        public static void main(String[] args) {
            //Crea un arreglo
            int [] a = {1,2,3,4,5,6,7,8,9,10};
            //Manda a llamar la libreria Queue y LinkedList
            Queue <Integer> colita = new LinkedList<>();
            //Implementa un ciclo con el for
            for(int i = 0; i < a.length; i++){
                //Imprime y arregla
                colita.add(a[i]);
            }   //Agrega dos nuevos elementos
                colita.add(11);
                colita.add(12);
                //Imprime el ultimo elemento de la cola
                System.out.println(colita.peek());
                //Elimina un elemento de la cola
                colita.remove();
                //Imprime toda la cola
                System.out.println(colita);
                //Imprime si la cola esta vacia
                System.out.println(colita.poll());
        }
    }