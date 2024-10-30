//tipo de libreria para crear la lista
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    //nombre de la clase
    class Array{
        //metodo main
        public static void main(String[] args) {
            //objeto scanner
            Scanner op = new Scanner(System.in);
            //crea una lista para las personas
            List <Persona> personas = new ArrayList<>();
           //declara las variables
            String setNombre,setApellido;
            //declara las variables
            int setEdad, id = 0;
           //itera con el do
            do { 
                //pide al usuario un dato
                System.out.println("Ingresa un nombre: ");
                //guarda el dato en el setNombre
                setNombre = op.next();
                //pide al usuario otro dato
                System.out.println("Ingresa un apellido: ");
                //guarda el dato en el setApellido
                setApellido = op.next();
                //pide al usuario otro dato
                System.out.println("Ingresa una edad: ");
                //guarda el dato en el setEdad
                setEdad = op.nextInt();
                //agrega el arraylist
                personas.add(id, new Persona(setNombre, setApellido, setEdad));
                //incrementa
                id++;
                //hace el ciclo
            } while(personas.size() < 3);
            //itera y imprime    
            for(int i = 0; i < personas.size(); i++){
                //hace validar el bucle    
                if(personas.get(i).getClass().equals("kilo")){
                    //elimina un elemento    
                    personas.remove(i); break;
                }
            }
        }
    }
