package Giris;
import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Girin :");
        int DogumYili = input.nextInt();

        if (DogumYili>=0) {


            int CinZimbirtisi = 12;
            int mod = DogumYili % 12;

            switch (mod) {

                case 0:
                    System.out.println("Maymunsunuz!!");
                    System.out.print("Böyle Saçmalıklarla Uğraşmayın!!");

                    break;

                case 1:
                    System.out.println("Horozsunuz!!");
                    System.out.print("Böyle Saçmalıklarla Uğraşmayın!!");

                    break;
                case 2:
                    System.out.println("Köpeksiniz!!");
                    System.out.print("Böyle Saçmalıklarla Uğraşmayın!!");

                    break;
                case 3:
                    System.out.println("Domuzsunuz!!");
                    System.out.print("Böyle Saçmalıklarla Uğraşmayın!!");

                    break;
                case 4:
                    System.out.println("Faresiniz!!");
                    System.out.print("Böyle Saçmalıklarla Uğraşmayın!!");

                    break;
                case 5:
                    System.out.println("Öküzsünüz!!");
                    System.out.print("Böyle Saçmalıklarla Uğraşmayın!!");

                    break;
                case 6:
                    System.out.println("Kaplansınız!!");
                    System.out.print("Böyle Saçmalıklarla Uğraşmayın!!");

                    break;
                case 7:
                    System.out.println("Tavşansınız!!");
                    System.out.print("Böyle Saçmalıklarla Uğraşmayın!!");

                    break;
                case 8:
                    System.out.println("Ejdehasınız!!");
                    System.out.print("Böyle Saçmalıklarla Uğraşmayın!!");

                    break;
                case 9:
                    System.out.println("Yılansınız!!");
                    System.out.print("Böyle Saçmalıklarla Uğraşmayın!!");

                    break;
                case 10:
                    System.out.println("Atsınız!!");
                    System.out.print("Böyle Saçmalıklarla Uğraşmayın!!");

                    break;
                case 11:
                    System.out.println("Koyunsunuz!!");
                    System.out.print("Böyle Saçmalıklarla Uğraşmayın!!");

                    break;
                default:
            }

        } else {

            System.out.print("Sıfırdan Küçük Doğum Yılı Olmaz!!!");

        }



    }
}
