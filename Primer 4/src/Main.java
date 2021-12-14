
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<String> lista = new ArrayList<>();
        lista.add("Barcelona");
        lista.add("Real Madrid");
        lista.add("Chelsea");

        System.out.println("Listata sodrzi: " + lista.size() +  " elementi.");
        System.out.println("Se brise elementot " + lista.remove("Barcelona"));
    }
}