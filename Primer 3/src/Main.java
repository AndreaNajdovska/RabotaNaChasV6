import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<String> lista = new ArrayList<>();
        lista.add("FIKT");
        lista.add("FILOLOSHKI");
        lista.add("PEDAGOSHKI");

        System.out.println("Listata sodrzi: " + lista.size() + " elementi.");
        System.out.println("Elementite na listata se: " + lista);
    }
}