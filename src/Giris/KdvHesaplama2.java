package Giris;
import java.util.Scanner;
public class KdvHesaplama2 {
    public static void main(String[] args) {

        double UrunKdvSizTutari;

        Scanner input = new Scanner(System.in);

        System.out.print("Ürünün KDV'siz Tutarı : ");
        UrunKdvSizTutari = input.nextDouble();

        double UrunKdvOrani = (UrunKdvSizTutari<=1000 ? 0.18 : 0.08) ;

        System.out.print("Ürün KDV Oranı :");
        System.out.println(UrunKdvOrani);

        double UrunKdvTutari = UrunKdvSizTutari*UrunKdvOrani;

        System.out.print("Ürünün KDV Tutarı :");
        System.out.println(UrunKdvTutari);

        double UrunKdvDahilFiyati = UrunKdvSizTutari+UrunKdvTutari;

        System.out.print("Ürünün KDV Dahil Tutarı :");
        System.out.println(UrunKdvDahilFiyati);







    }
}
