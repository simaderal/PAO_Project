import java.util.List;

public class Main {

    public static void main(String[] args) {
        Aliment aliment1 = new Lapte("fulga", 12L, 2.5, 100d, "lapte praf, chimie");
        Aliment aliment2 = new Carne("piept", 32L, 20d, 500d, "apa");
        Aliment aliment3 = new Cereale("ovaz", 2025L, 2d, 500d, "ovaz100%");
        Aliment aliment4 = new Lapte("starbys", 4090L, 10d, 490d, "soy100%");
        List<Aliment> listaAlim = List.of(aliment1, aliment2, aliment3, aliment4);
        List<Aliment> sortedList = listaAlim.stream()
                .sorted((a1, a2) -> (int) (a1.getCalorii() - a2.getCalorii()))
                .toList();
        System.out.println(sortedList.stream().map(Aliment::getNume).toList());
    }
}