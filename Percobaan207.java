import java.util.Scanner;

public class Percobaan207 {

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x *hitungPangkat(x, y - 1));
        }
    }

    public static void main (String[] args) {

    Scanner scan = new Scanner (System.in);

    int pangkat;
    int bilangan;

    System.out.print("Bilangan yang dihitung : ");
    bilangan = scan.nextInt();
    System.out.print("Pangkat : ");
    pangkat = scan.nextInt();

    System.out.println(hitungPangkat(bilangan, pangkat));
    }
    
}