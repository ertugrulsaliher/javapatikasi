package Giris;
import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Ay :");
        int Ay = input.nextInt();

        if (1<=Ay && 12>=Ay) {

            System.out.print("Doğduğunuz Gün :");
            int Gun = input.nextInt();

            if (Ay == 2 && Gun > 28) {
                System.out.print("Şubat Ayında 28 gün vardır!!");
            } else if ((Ay == 4 && Gun > 30)) {
                System.out.print("Mayıs ayında 30 gün vardır!!");
            } else if (Ay == 6 && Gun > 30) {
                System.out.print("Haziran ayında 30 gün vardır!!");
            } else if (Ay == 9 && Gun > 31) {
                System.out.print("Eylül ayında 30 gün vardır!!");
            } else if (Ay == 11 && Gun > 30) {
                System.out.print("Kasım ayında 30 gün vardır!!");
            } else if (Ay == 1 && Gun > 31) {
                System.out.print("Ocak ayında 31 gün vardır!!");
            } else if (Ay == 3 && Gun > 31) {
                System.out.print("Mart ayında 31 gün vardır!!");
            } else if (Ay == 5 && Gun > 31) {
                System.out.print("Mayıs ayında 31 gün vardır!!");
            } else if (Ay == 7 && Gun > 31) {
                System.out.print("Temmuz ayında 31 gün vardır!!");
            } else if ((Ay == 8) && (Gun > 31)) {
                System.out.print("Ağustos ayında 31 gün vardır!!");
            } else if (Ay == 10 && Gun > 31) {
                System.out.print("Ekim ayında 31 gün vardır!!");
            } else if (Ay == 12 && Gun > 31) {
                System.out.print("Aralık ayında 31 gün vardır!!");
            }

            if (Ay==3 && Gun>=21) {
                System.out.println("Kova Burcusunuz");
            } else if (Ay==4 && Gun<=20) {
                System.out.println("Kova Burcusunuz");
            }  else if (Ay==4 && Gun>=21) {
                System.out.println("Boğa Burcusunuz");
            } else if (Ay==5 && Gun<=21) {
                System.out.println("Boğa Burcusunuz");
            } else if (Ay==5 && Gun>21) {
                System.out.println("İkizler Burcusunuz");
            } else if (Ay==6 && Gun<=22) {
                System.out.println("İkizler Burcusunuz");
            } else if (Ay==6 && Gun>22) {
                System.out.println("Yengeç Burcusunuz");
            } else if (Ay==7 && Gun<=22) {
                System.out.println("Yengeç Burcusunuz");
            } else if (Ay==7 && Gun>22) {
                System.out.println("Aslan Burcusunuz");
            } else if (Ay==8 && Gun<=22) {
                System.out.println("Aslan Burcusunuz");
            } else if (Ay==8 && Gun>22) {
                System.out.println("Başak Burcusunuz");
            } else if (Ay==9 && Gun<=22) {
                System.out.println("Başak Burcusunuz");
            } else if (Ay==9 && Gun>=23) {
                System.out.println("Terazi Burcusunuz");
            } else if (Ay==10 && Gun<=22) {
                System.out.println("Terazi Burcusunuz");
            } else if (Ay==10 && Gun>22) {
                System.out.println("Akrep Burcusunuz");
            } else if (Ay==11 && Gun<=21) {
                System.out.println("Akrep Burcusunuz");
            } else if (Ay==11 && Gun>21) {
                System.out.print("Yay Burcusunuz");
            } else if (Ay==12 && Gun<=21) {
                System.out.println("Yay Burcusunuz");
            } else if (Ay==12 && Gun>21) {
                System.out.println("Oğlak Burcu");
            } else if (Ay==1 && Gun<=21) {
                System.out.println("Oğlak Burcusunuz");
            } else if (Ay==1 && Gun>21) {
                System.out.println("Kova Burcusunuz");
            } else if (Ay==2 && Gun<=19) {
                System.out.println("Kova Burcusunuz");
            } else if (Ay==2 && Gun>19) {
                System.out.println("Balık Burcusunuz");
            } else if (Ay==3 && Gun<=20) {
                System.out.println("Balık Burcusunuz");
            }
            System.out.print("Burç gibi boş boş işlerle uğraşmayın!!");

        } else {

            System.out.print("Hatalı Ay Seçimi");

        }







    }


}
