//tipo de libreria de la cola
import java.util.LinkedList;
import java.util.Queue;
    //nombre de la clase
    class Main2 {
        //metodo main
        public static void main(String[] args) {
            //guarda datos en el p1
            Persona p1 = new Persona("stephanie ", "gomez ", 20);
            //guarda datos en el p2
            Persona p2 = new Persona("yael ", " ", 20);
            //guarda datos en el p3
            Persona p3 = new Persona("regina ", "diaz ", 20);
            //guarda datos en el p4
            Persona p4 = new Persona("oscar ", "rozales ", 19);
            //guarda datos en el p5
            Persona p5 = new Persona("edgar ", "perez ", 19);
            //crea la cola
            Queue<Persona> op = new LinkedList<>();
                //agrega datos a la cola
                op.add(p1);
                //agrega datos a la cola
                op.add(p2);
                //agrega datos a la cola
                op.add(p3);
                //agrega datos a la cola
                op.add(p4);
                //agrega datos a la cola
                op.add(p5);
            //itera la cola
            for (Persona p : op) {
                //imprime toda la cola
                System.out.println(p.nombre + "" + p.apellido + "" + p.edad);
        }
    }
}