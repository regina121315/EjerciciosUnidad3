
    // introduce libreria 
import java.util.Stack;

class Main { //crea una clase 
public static void main (String[] args) { // introduce main 
    Persona p1= new persona ("Stephanie", "Muñoz", 19);
    Persona p2= new persona ("Emmanuel", "Enriquez", 19);
    Persona p3= new persona ("Regina", "Diaz", 20);
    Persona p4= new persona ("Yael", "Lopez", 19);
    Persona p5= new Persona ("Eduardo", "Sanchez", 19);

   Stack <Persona> sc=new Stack <>();
// introduce datos a la pila

sc.push(p1);
sc.push(p2);
sc.push(p3);
sc.push(p4);
sc.push(p5);
//iterar 
for (Persona p:op){
System.out.println(p.nombre+ "" +p.apellido+ "" + p.edad);

}
}
}


    

