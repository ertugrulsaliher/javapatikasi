package Giris;
import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {

        double  Fizik, Kimya, Biyoloji, Tarih, Muzik;

        Scanner input =new Scanner(System.in);

        System.out.print("Matematik Notu :");
        double Matematik = input.nextDouble();

        System.out.print("Fizik Notu :");
        Fizik = input.nextDouble();

        System.out.print("Kimya Notu :");
        Kimya = input.nextDouble();

        System.out.print("Biyoloji Notu :");
        Biyoloji = input.nextDouble();

        System.out.print("Tarih Notu :");
        Tarih = input.nextDouble();

        System.out.print("Müzik Notu :");
        Muzik = input.nextDouble();

        double Sonuc = ((Matematik+Fizik+Kimya+Biyoloji+Tarih+Muzik)/6) ;
        double GecmeNotu = 60;

        String GecmeDurumu = Sonuc>=GecmeNotu ? "Sınıfı GEÇTİ" : "Sınıfta KALDI" ;

        System.out.print("Not Ortalaması :");
        System.out.println(Sonuc);

        System.out.print("Geçme Durumu :");
        System.out.print(GecmeDurumu);

    }
}
