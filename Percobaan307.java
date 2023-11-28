import java.util.Scanner;

public class Percobaan307 {

    static double hitungLaba (double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        Double saldoAawal;
        int tahun;

        System.out.print("Jumlah saldo awal : ");
        saldoAawal = scan.nextDouble();
        System.out.print("Lamanya investasi (tahun) : ");
        tahun = scan.nextInt();

        System.out.print("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.print(hitungLaba(saldoAawal, tahun));
    }
    
}
