import java.util.LinkedList;
import java.util.Queue;
    public class NombreCola {
    public static void main(String[] args) {
        Queue <String> name = new LinkedList<>();
        String name2 = "yael";
        
        for(int i = 0; i < name2.length();i ++){
            char letra =name2.charAt(i);
            System.out.println(name.add(letra));
        }
    }
} 