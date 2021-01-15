package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero = 0;
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Porfavor Ingresar un numero entre 50 y 500 ");
        numero = Entrada.nextInt();
        
        for(int i = numero ; i <= 500 ; i+=2){
            System.out.println(i + ", ");
        }

    }
}
