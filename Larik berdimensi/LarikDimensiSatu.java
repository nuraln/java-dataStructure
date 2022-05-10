import java.util.Scanner;

public class LarikSatuDimensi {
    public static void main (String[] args){
        //membuat nama array
        String[] planet = new String[5];
        
        Scanner scan = new Scanner(System.in);
        
        for (int i=0; i < planet.length; i++){
        System.out.print("planet ke " + i + ":");
        planet[i]=scan.nextLine();
        }
        
        System.out.println("--------------------");
        
        //menampilkan semua data pada array
        for (String p : planet){
        System.out.println(p);
        }
        
        System.out.println("--------------------");
        
        //menampilkan data pada salah satu index array
        System.out.println(planet[3]);
    }
}