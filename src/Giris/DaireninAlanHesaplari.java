package Giris;
import java.util.Scanner;
public class DaireninAlanHesaplari {
    public static void main(String[] args) {

        double r, a;

        Scanner input = new Scanner(System.in);

        System.out.print("Daire'nin Yarı Çapı (cm) (r) :");
        r = input.nextDouble();

        double DaireninAlani = (Math.PI*Math.pow(r,2));
        double DaireninCevresi = (Math.PI*r*2);

        System.out.print("Dairenin Alanı (cm2) :");
        System.out.println(DaireninAlani);

        System.out.print("Dairenin Çevresi (cm) :");
        System.out.println(DaireninCevresi);

        System.out.print("Alfa Açısı :");
        a = input.nextDouble();

        double AlfaAcisinaAitDilimAlani = (Math.PI*Math.pow(r,2)*a)/(360);

        System.out.print("Alfa Açısına Sahip Dilimin Alanı (cm2) :");
        System.out.print(AlfaAcisinaAitDilimAlani);

    }
}
