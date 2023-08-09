package Giris;
import java.util.Scanner;
public class HipotenusBulma {
    public static void main(String[] args) {

        double a,b;
        Scanner input =new Scanner(System.in);

        System.out.print("A Kenarı :");
        a = input.nextDouble();

        System.out.print("B Kenarı :");
        b = input.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.print("Hipotenüs :");
        System.out.println(c);

        double u = ((a+b+c)/2);
        Double Alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("ABC Üçgeninin Alanı :");
        System.out.print(Alan);

    }
}
