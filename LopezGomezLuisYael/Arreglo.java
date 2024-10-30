
//introduce libreria 
import java.util.Stack;
//crea clase
class Arreglo{
//introduce metodo main
    public static void main(String[] args) {
       //crea un arreglo 
        int [] a={3,5,4,1,2};
    //crea pilas 
        Stack<Integer>pila=new Stack<>();
        Stack<Integer>pilamax=new Stack<>();
        Stack<Integer>pilafn=new Stack<>();
       //itera
        for (int i=0;i<a.length;i++){
            //introduce datos
pila.push(a[i]);
        }
        //crea ciclo con sus restricciones
        while(!pilamax.isEmpty()&&!pilafn.isEmpty()){
            if(pilamax.isEmpty()){
                int b=pila.pop();
                pila.push(b);
            }
            else if(pilamax.peek()<pila.peek()){
                int c=pila.pop();
                pilamax.push(c);
            }
                else if (pila.peek()<pilamax.peek()){
int d=pilamax.pop();
pilafn.push(d);
                } 
                else if(pilamax.peek()<pilafn.peek()){
                    int e=pilafn.pop();
                    pilamax.push(e);
                }

            }
            //imprime pilas
            System.out.println(pila);
            System.out.println(pilamax);
            System.out.println(pilafn);
            }

        }

       

    
   