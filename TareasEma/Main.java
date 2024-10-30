//tipo de libreria
import java.util.Stack;
    //nombre de la clase
    class Main{
        //metodo main
        public static void main(String[] args){
            //guarda datos en el p1
            Persona p1= new Persona("emanuel ","enriquez ",19);
            //guarda datos en el p2
            Persona p2= new Persona("stephanie ","martinez ",19);
            //guarda datos en el p3
            Persona p3= new Persona("yael ","lopez ",20);
            //guarda datos en el p4
            Persona p4= new Persona("regina ","diaz ",20);
            //guarda datos en el p5
            Persona p5= new Persona("pedro ","ramirez ",20);
            //crea la pila
            Stack <Persona> op = new Stack<>();
                //agrega datos a la pila
                op.push(p1);
                //agrega datos a la pila
                op.push(p2);
                //agrega datos a la pila
                op.push(p3);
                //agrega datos a la pila
                op.push(p4);
                //agrega datos a la pila
                op.push(p5);
            //itera la pila
            for(Persona p :op){
                //imprime toda la pila
                System.out.println(p.nombre + "" + p.apellido + "" + p.edad);
        }
    }
}