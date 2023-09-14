package Giris;

public class Recursive {
    static int f (int N) {
        if (N==1) {
            return 1;
        }
        return f(N-1) +N;

    }
    public static void main(String[] args) {
        System.out.println(f(4));
    }
}
