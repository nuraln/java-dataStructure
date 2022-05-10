import java.util.Scanner;

public class LarikTigaDimensi {
    public static void main(String[] args) {
            // Membuat Array
        String[][][] matrik = new String[3][3][3];
        Scanner scan = new Scanner(System.in);

        // mengisi setiap elemen
        for(int bar = 0; bar < matrik.length; bar++){
            for(int kol = 0; kol < matrik.length; kol++){
                for(int ting = 0; ting < matrik.length; ting++){
                System.out.format("elemen matrik (%d,%d,%d): ", bar, kol, ting);
                matrik[bar][kol][ting] = scan.nextLine();
            }
        }
        }

        // menampilkan isi Array
        System.out.println("-------------------------");
        for(int bar = 0; bar < matrik.length; bar++){
            for(int kol = 0; kol < matrik.length; kol++){
                for(int ting = 0; ting < matrik.length; ting++){
                System.out.format(" %s \t", matrik[bar][kol][ting]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }
    }
}