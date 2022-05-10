import java.util.ArrayList;

public class ArrayListProject {
    public static void main(String[] args) {
    ArrayList jusBuah = new ArrayList();
    jusBuah.add("Jus Apel");
    jusBuah.add(5000);
    jusBuah.add("12");
    jusBuah.add(true);
    jusBuah.add("Jus Naga");
    jusBuah.add(6000);
    jusBuah.add("12");
    jusBuah.add(false);
    jusBuah.add(5000 + 6000);
    jusBuah.add(12 + "12");
    System.out.println(jusBuah);
    for (int i = 0; i < jusBuah.size(); i++) {
      System.out.println(jusBuah.get(i));
    }
  }
}