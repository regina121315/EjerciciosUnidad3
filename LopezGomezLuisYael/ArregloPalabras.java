import java.util.Stack;
public class ArregloPalabras {
    public static void main(String[] args) {
        String [] datos = {"Mesa", "Silla", "Banca", "Sillon ", "Pasto", "Luz"};
           Stack <String>words=new Stack<>();
       
        for (int i = 0; i < datos.length; i++) {
          words.push(datos[i]);
        }
        
        words.push("Bruno");
        words.push("jorge");

        System.out.println(words.peek());
        words.pop();
        System.out.println(words);
        System.out.println(words.isEmpty());
    }
}