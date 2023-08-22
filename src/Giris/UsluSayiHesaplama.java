package Giris;
import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("xʸ Sayısı İçin X Değeri Girin :");
        int X = input.nextInt();

        System.out.print("xʸ Sayısı İçin Y Değeri Girin :");
        int Y = input.nextInt();

        int i = 1;
        int Toplam = 1;

        for (i=1; i<=Y; i++) {

            Toplam *= X;

        }
        System.out.print(Toplam);



    }
}
