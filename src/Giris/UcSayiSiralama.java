package Giris;
import java.util.Scanner;

public class UcSayiSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("A Sayısını Girin :");
        double A = input.nextDouble();

        System.out.print("B Sayısını Girin :");
        double B = input.nextDouble();

        System.out.print("C Sayısını Girin :");
        double C = input.nextDouble();

        if ((A<B) && (A<C)) {
            if (B < C) {
                System.out.print("A < B < C");
            } else {
                System.out.print("A < C < B");
            }
        } else if ((B<A) && (B<C)) {
            if (A<C) {
                System.out.print("B < A < C");
            } else {
                System.out.print("B < C < A");
            }
        } else {
            if (B<A) {
                System.out.print("C < B < A");
            } else {
                System.out.print("C < A < B");
            }
        }
    }
}
