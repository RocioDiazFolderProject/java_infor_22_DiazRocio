import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TercerEjercicio{

    public static void main(String[] args){

        List<String> peliculas = List.of("Batman","Aquaman","Flash", "Batgirl", "WonderWoman", "brainiac");

        System.out.println("La cantidad de peliculas con b o B son:" + peliculas.stream().filter(BB-> BB.startsWith("b") || BB.startsWith("B")).count());


    }
}