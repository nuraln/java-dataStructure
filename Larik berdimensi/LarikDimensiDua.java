import java.util.Scanner;

public class LarikDuaDimensi {
    public static void main(String[] args) {

        // Membuat Array
        String[][] matrik = new String[3][3];
        Scanner scan = new Scanner(System.in);

        // mengisi setiap elemen
        for(int bar = 0; bar < matrik.length; bar++){
            for(int kol = 0; kol < matrik[bar].length; kol++){
                System.out.format("elemen matrik (%d,%d): ", bar, kol);
                matrik[bar][kol] = scan.nextLine();
            }
        }

        // menampilkan isi Array
        System.out.println("-------------------------");
        for(int bar = 0; bar < matrik.length; bar++){
            for(int kol = 0; kol < matrik[bar].length; kol++){
                System.out.format(" %s \t", matrik[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }
}