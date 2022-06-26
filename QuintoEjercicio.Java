import java.util.List;
import java.util.ArrayList;
import java.util.LocalDate;


public class QuintoEjercicio{
    public static void main(String[] args){

        Alumno alumnoA = new Alumno("Elle","Maria",LocalDate.of(1995,06,06));
        Alumno alumnoB = new Alumno("Masa","Lorena",LocalDate.of(1997,05,05));
        Alumno alumnoC = new Alumno("Caceres","Marta",LocalDate.of(1980,05,05));
        Alumno alumnoD = new Alumno("Torres","Sergio",LocalDate.of(2000,06,06));
        Alumno alumnoE = new Alumno("Gomez","Ezequiel",LocalDate.of(1995,05,06));

        List<Alumno> alumnos = List.of(alumnoA,alumnoB,alumnoC,alumnoD,alumnoE);

        System.out.println(alumnos);
    
        
        

    }

}

public class Alumno{
    private String Nombre;
    private String Apellido;
    private LocalDate FechaNac;

        public Alumno(String A, String N, LocalDate FN ){
            this.Nombre = N;
            this.Apellido =A;
            this.FechaNac = FN;
        }

        public String getApellido(){
            return this.Apellido;


        }

        public String getNombre(){
            return this.Nombre;
        }

        

    }






