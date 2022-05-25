import java.util.Scanner;

public class Ejercicio_6_bis {

    public static void main(String[] args){

       
            Scanner scan = new Scanner(System.in);
            int nro;
            int continuar = 1;
    
           
    
            do {
                System.out.println("Por favor ingrese un nro");
                nro = scan.nextInt();
                System.out.println("El nro ingresado es: "+nro);
    
                System.out.println("si quiere continuar presione 1, sino cualquier otro número");
                continuar = scan.nextInt();
            }while (continuar ==1);
            
            scan.close();
        }
    
    
}
