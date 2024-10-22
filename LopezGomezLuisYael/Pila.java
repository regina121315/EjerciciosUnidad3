import java.util.Stack;
 class Pila {
    public static void main(String[] args) {
        Stack<Integer>par=new Stack<>();
        Stack<Integer>impar=new Stack<>();
        for(int i=0;i<=30;i++){
            if(i%2==0){
                par.push(i);
            }else{
                impar.push(i);
            }
        }
        System.out.println(par);
        System.out.println(impar);
    }
    
}