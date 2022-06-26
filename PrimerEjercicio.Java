import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimerEjercicio {
    
    public static void main(String[] args){

        List<String> palabras = new ArrayList<>();
         
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        List<String> palabras2 = palabras.stream().filter(pp ->pp!=null && pp!="").collect(Collectors.toList());

        System.out.println(palabras2);
                
                  
        
        
    }
}
