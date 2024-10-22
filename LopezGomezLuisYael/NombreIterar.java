import java.util.Queue;
import java.util.LinkedList;

public class NombreIterar {
    public static void main(String[] args) {
        Queue<Character> name = new LinkedList<>();
        String nom = "Yael";
        
        for (int i = 0; i < nom.length(); i++) {
            char letra = nom.charAt(i);
            name.add(letra);
        }
        
        System.out.println(name);
    }
}