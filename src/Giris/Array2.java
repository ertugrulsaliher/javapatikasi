package Giris;

public class Array2 {
    public static void main(String[] args) {
        int number = 1;
        int [][] matris = new int[3][3] ;
        for (int i = 0 ; i<matris.length; i++){
            for (int j = 0; j<matris[i].length; j++) {
                matris[i][j] = number++;
                System.out.print(matris[i][j]);
            }
            System.out.println();
        }
    }
}
