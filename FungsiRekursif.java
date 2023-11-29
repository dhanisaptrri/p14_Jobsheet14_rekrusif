import java.util.Scanner;

public class FungsiRekursif {

    static void faktorialRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            faktorialRekursif( n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Nilai n : ");
        int n = scan.nextInt();

        System.out.print("Fungsi Rekursif Nilai n : ");
        faktorialRekursif(n);
    }
    
}
