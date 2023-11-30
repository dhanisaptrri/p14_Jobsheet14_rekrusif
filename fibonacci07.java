import java.util.Scanner;

public class fibonacci07 {
    
    static int jmlAnakMarmut(int n){

        if (n <= 1) {
            return n;
        } else {
            return jmlAnakMarmut(n - 1) + jmlAnakMarmut(n - 2);
        }

    }
    public static void main(String [] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Jumlah Marmut bulan ke-");
        int bulan = scan.nextInt();

        int totalMarmut = jmlAnakMarmut(bulan);

        System.out.print("Total jumlah marmut pada bulan ke-" + bulan + " : " + totalMarmut + " ekor");
    }
}
