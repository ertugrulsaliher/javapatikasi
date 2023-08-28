package Giris;
import java.util.Scanner;
public class HarmonikSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Bir N Sayısı Girin :");
        double n = input.nextInt();
        double Sonuc = 0;

        for (double i=1; i<=n; i++) {
            Sonuc += (1/i);
        }

        System.out.println(Sonuc);

    }
}
