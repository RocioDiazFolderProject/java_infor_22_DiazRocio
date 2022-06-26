import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SegundoEjercicio {

    public static void main(String[] args){

        List<Integer> numeros = List.of(1,2,3,4,5);

        List<Integer> nros2 = numeros.stream().map(nn->nn*nn).collect(Collectors.toList());
        System.out.println(nros2);

    }
}