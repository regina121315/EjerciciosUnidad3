import java.util.Stack;
class NombrePila{
    public static void main(String[] args) {
        Stack<Character>pilas=new Stack <>();
        System.out.println(pilas.isEmpty());
        pilas.push  ('L');
        pilas.push ('u');
        pilas.push ('i');
        pilas.push ('s');
        System.out.println(pilas.peek());
        pilas.push ('Y');
        pilas.push ('a');
        pilas.push ('e');
        pilas.push ('l');
        System.out.println(pilas.search ('e'));
        pilas.push ('L');
        pilas.push ('o');
        pilas.push ('p');
        pilas.push ('e');
        pilas.push ('z');
        pilas.pop();
        pilas.pop();
        System.out.println(pilas);
        pilas.push ('G');
        pilas.push ('o');
        pilas.push ('m');
        pilas.push ('e');
        pilas.push ('z');
        for(Character pilita:pilas){
            System.out.println(pilita);
        }
    }
}




        

