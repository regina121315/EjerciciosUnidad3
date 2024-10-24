import java.util.Queue;
import java.util.LinkedList;

public class ArregloNUmeros {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7,8,9,10};
        Queue<Integer> name = new LinkedList<>();
        
        for (int i = 0; i < a.length; i++){
            name.add(a[i]);
        }
        name.add(77);
        name.add(80);
        name.peek();//muestra el primer elemento
        name.remove();//quita elementos de la cola
        System.out.println(name);
        name.poll();//return null
    }
}