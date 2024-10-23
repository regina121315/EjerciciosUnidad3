//Tipo de libreria
import java.util.Stack;
    //Nombre de la clase
    class Pila{
        //Metodo main
        public static void main(String[] args) {
            //Crea un arreglo
            String [] a = {"Juego","Hola","Mundo","Color","Mesa"};
            //Manda a llamar la libreria Stack
            Stack <String> pilita = new Stack<>();
            //Implementa un ciclo con el for
            for(int i = 0; i < a.length; i++){
                //Imprime y arregla
                pilita.push(a[i]);
        }       //Agrega dos nuevos elementos
                pilita.push("Puerta");
                pilita.push("Gorra");
                //Imprime el ultimo elemento de la pila
                System.out.println(pilita.peek());
                //Elimina un elemento en la pila
                pilita.pop();
                //Imprime toda la pila
                System.out.println(pilita);
                //Imprime si la pil esta vacia
                System.out.println(pilita.isEmpty());
        }
    }