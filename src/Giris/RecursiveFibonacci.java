package Giris;
import java.util.Scanner;
public class RecursiveFibonacci {
    static int fibb(int N) {

        if (N==1 || N==2) {
            return 1;
        }

        return fibb(N-1) +fibb(N-2);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci Serisinin Kaçıncı Basamağını Öğrenmek İstediğinizi Girin :");
        int GirilenBasamak = input.nextInt();
        System.out.println(fibb(GirilenBasamak));

    }
}
