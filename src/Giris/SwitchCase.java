package Giris;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("1'den 7'ye kadar bir rakam seçin :");
        int Day = input.nextInt();

        switch (Day) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı Giriş");
        }

    }
}
