package Giris;
import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {

        double Boy, Kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuz Kaç m? :");
        Boy = input.nextDouble();

        System.out.print("Kilonuz Kaç Kg? :");
        Kilo = input.nextDouble();

        double Endeks = Kilo/(Math.pow(Boy,2));

        System.out.print("Vücut Kitle İndeksi :");
        System.out.println(Endeks);

    }
}
