package Giris;
import java.util.Scanner;
public class BasitHesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Birinci Sayıyı Girin :");
        double a1 = input.nextDouble();

        System.out.print("İkinci Sayıyı Girin :");
        double a2 = input.nextDouble();

        System.out.print("1 Toplama \n2 Çıkarma \n3 Çarpma \n4 Bölme \nYapmak İstediğiniz İşlemin Numarasını yazın: ");
        int a3 = input.nextInt();

        switch (a3) {
            case 1:
                System.out.print("Sonuç :");
                System.out.print(a1+a2);
                break;
            case 2:
                System.out.print("Sonuç :");
                System.out.print(a1-a2);
                break;
            case 3:
                System.out.print("Sonuç :");
                System.out.print(a1*a2);
                break;
            case 4:
                if (a2==0) {
                    System.out.print("Bir Sayı 0'a Bölünemez!");
                }

                else {
                    System.out.print("Sonuç :");
                    System.out.print(a1 / a2);

                }
                break;
            default:
                System.out.println("Yapmak istediğiniz işlem için 1'den 4'e kadar bir rakam seçmelisiniz!");
        }





    }
}
