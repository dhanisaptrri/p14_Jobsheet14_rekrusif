import java.util.Scanner;

public class PenjumlahanRekursif07 {

    static int penjumlahan(int f) {
        if (f == 1) {
            return 1;
        } else {
            return f + penjumlahan(f - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan angka : ");
        int f = scan.nextInt();

        int hasilPenjumlahan = penjumlahan(f);
        System.out.print("Hasil dari penjumlahan angka " + f + " : ");
        for (int i = 1; i < f; i++) {
            System.out.print(i + " + ");
        }
        System.out.print(f + " = " + hasilPenjumlahan);
    }
}