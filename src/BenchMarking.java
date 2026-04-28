
import java.util.concurrent.Callable;
import models.Results;


public class BenchMarking {
    public static Results  medirTiempos(Callable<Void> funcion){
        try {
        // calcular tiempo inicio
        long inicio = System.nanoTime();
        // Ejecutar la funciona
        funcion.call();
        //Calcular tiempo fin
        long fin = System.nanoTime();
        // Calcular tiempo ejecucacion
        long duracion = (fin - inicio) / 1_000_000;
        Results results = new Results(duracion);    
        return results;

        } catch (Exception e) {
            throw new RuntimeException("Error en la funcion");

            //System.out.println("Error en la funcion");
            //return null;
        }

    }
}   
