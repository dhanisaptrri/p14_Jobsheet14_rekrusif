import java.util.Scanner;

public class CekPrimaRekursif07 {

      static boolean  priksaPrima(int n,int i) {
        if (n <= 1) {
            return false;
        }

        if (i == 1) {
            return true;
        }

        if (n % i == 0) {
            return false;

        } else {

            return priksaPrima(n, i - 1);
        }

    }
    
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan Bilangan Prima : ");
        int n = scan.nextInt();

        boolean hasilPrima = priksaPrima(n, n - 1);

        if (hasilPrima) {
            System.out.println(n + " Termasuk dalam Bilangan Prima");
        } else {
            System.out.println(n + " Bukan Termasuk dalam Bilangan Prima");
        }
    }
}