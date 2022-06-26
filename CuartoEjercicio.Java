import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class CuartoEjercicio{
    public static void main(String[] args){

    List<Integer> lista = List.of(1,2,4,4,4);
    List<Long> lista2 = lista.stream()
                        .distinct()
                        .map(lis->LongStream.rangeClosed(1,lis).reduce(1,(long a,long b)->a*b)).collect(Collectors.toList());
    System.out.println(lista2);

    }
}