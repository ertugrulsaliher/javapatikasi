package Giris;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Hastanin Kilosu :");
        double HastaninKilosu = input.nextDouble();

        System.out.print("Hastanın Yaşı :");
        double HastaninYasi = input.nextDouble();

        if ((HastaninYasi >= 18)) {
            if (HastaninKilosu>=48) {

                System.out.println("Kan Verebilirsiniz.");
            }
            else {
                System.out.println("Kan Veremezsiniz.");
            }
        }
        else {
            System.out.println("Kan Verebilmeniz Reşit Olmanız Gerekmektedir!");
        }






    }
}
