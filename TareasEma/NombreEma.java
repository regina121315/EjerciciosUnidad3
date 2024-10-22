import java.util.LinkedList;
import java.util.Queue;

public class NombreEma {
    public static void main(String[] args) {
        Queue<Character> name = new LinkedList<>();
        String nom = "Emanuel";
        
        for (int i = 0; i < nom.length(); i++) {
            char letra = nom.charAt(i);
            name.add(letra);
        }
        
        System.out.println(name);
    }
}