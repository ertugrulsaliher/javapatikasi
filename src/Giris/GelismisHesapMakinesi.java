package Giris;

import java.util.Scanner;
public class GelismisHesapMakinesi {
    static double ToplamaIslemi (double X, double Y) {
        return X+Y;
    }
    static double CikarmaIslemi (double X, double Y) {
        return X-Y;
    }
    static double CarpmaIslemi (double X, double Y) {
        return X*Y;
    }
    static double BolmeIslemi (double X, double Y) {
        return X/Y;
    }
    static double UsluSayiIslemi (double X, double Y) {
        double Sonuc = 1 ;
        double i;
        for ( i=1; i<=Y; i++) {
            Sonuc *= X;
        }
        return Sonuc;
    }
    static double FaktoriyelBulmaIslemi (double X) {
        double Sonuc = 1;
        double i = 1;
        for (i=1; i<=X; i++) {
            Sonuc *= i;
        }
        return Sonuc;
    }
    static double ModAlmaIslemi (double X,double Y) {
        return X%Y;
    }
    static double DikdortgenAlanBulma (double X, double Y) {
        return X*Y;
    }
    static double DiktortgenCevreBulma (double X, double Y) {
        return 2*(X+Y);
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Lütfen Bir X Sayısı Seçin :");
       double X = input.nextDouble();

       System.out.print("Lütfen Bir Y Sayısı Seçin :");
       double Y = input.nextDouble();

       int Secenek;

       if (X>0 && Y>0) {

           do {
               System.out.print(
                       "1) X + Y\n" +
                               "2) X - Y\n" +
                               "3) X * Y\n" +
                               "4) X / Y\n" +
                               "5) Xʸ\n" +
                               "6) X!\n" +
                               "7) X mod Y\n" +
                               "8) X ve Y Kenarlarına Sahip Dikdörtgenin Alan ve Çevre  Hesabı\n" +
                               "0) Çıkış Yap!\n" +
                               "Lütfen Yapmak İstediğiniz İşlemi Seçin :");
               Secenek = input.nextInt();

               switch (Secenek) {
                   case 1:
                       System.out.println("X + Y = " + ToplamaIslemi(X, Y));
                       break;
                   case 2:
                       System.out.println("X - Y = " + CikarmaIslemi(X, Y));
                       break;
                   case 3:
                       System.out.println("X * Y = " + CarpmaIslemi(X, Y));
                       break;
                   case 4:
                       System.out.println("X / Y = " + BolmeIslemi(X, Y));
                       break;
                   case 5:
                       System.out.println("Xʸ = " + UsluSayiIslemi(X, Y));
                       break;
                   case 6:
                       System.out.println("X! = " + FaktoriyelBulmaIslemi(X));
                       break;
                   case 7:
                       System.out.println("X mod Y = " + ModAlmaIslemi(X, Y));
                       break;
                   case 8:
                       System.out.println("Alan = " + DikdortgenAlanBulma(X, Y));
                       System.out.println("Çevre = " + DiktortgenCevreBulma(X, Y));
                       break;
                   case 0:
                       System.out.print("Başarıyla Çıkış Yaptınız!");
                       break;
                   default:
                       System.out.println("Hatalı tuşlama Yaptınız!!");
                       break;
               }


           } while (Secenek != 0);
           {

           }
       } else {
           System.out.println("X ve Y Değerleri Pozitif Tam Sayı Olmalıdır!! ");
       }



    }
}
