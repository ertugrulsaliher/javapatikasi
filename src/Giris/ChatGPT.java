package Giris;
import java.util.Scanner;
public class ChatGPT {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        double n = scanner.nextInt();

        double sum = 0;
        double count = 0;

        for (double i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Girilen aralıkta 3 ve 4'e tam bölünen sayı yok.");
        } else {
            double average = (double) sum / count;
            System.out.println("Girilen aralıkta 3 ve 4'e tam bölünen sayıların ortalaması: " + average);
        }

        scanner.close();

    }
}
