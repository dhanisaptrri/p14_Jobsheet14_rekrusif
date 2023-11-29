import java.util.Scanner;

public class FungsiIteratif {

    static void fungsiIteratif(int n) {
        int fungsi = 0;
        for (int i = n; i >= 0; i--) {
            System.out.print( i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan Nilai n : ");
        int n = scan.nextInt();

        System.out.print("Fungsi Iteratif Nilai n : ");
        fungsiIteratif(n);
    }
}
