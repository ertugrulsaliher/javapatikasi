package Giris;
import java.util.Scanner;
public class YildizlarlaSekil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısı Girin :");
        int N = input.nextInt();

        for (int i=1; i<=N; i++) {

            for (int k=1; k<=(N-i); k++) {
                System.out.print(" ");
            }

            for (int j=1; j<=((2*i)-1); j++) {
                System.out.print("*");
            }

            System.out.println(" ");

        }




    }
}
