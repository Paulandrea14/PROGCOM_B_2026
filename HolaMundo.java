package holamundo;
import java.util.*;

/**
 *
 * @author Paulandrea Bato y Gabriela Zafra 
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lluvia;
        //saludar al mundo 
        System.out.println("Hola mundo. Bienvenidos a PROGCOM-B");
        System.out.println("Esta lloviendo?");
        //Estamos definiendo un objeto de tipo Scanner
        Scanner play = new Scanner(System.in);
        lluvia = play.nextLine();
        System.out.println("Tu respuesta fue: " +  lluvia );
        if (lluvia.equals("si")){
        System.out.println("Use sombrilla, guarde la ropa ");
        }else{
        System.out.println("salga tranquilo");
        }
        
    }
    
}