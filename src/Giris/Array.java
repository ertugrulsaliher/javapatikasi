package Giris;

public class Array {
    static void printArray (int [] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void printArray (double [] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static int[] reverse (int [] list) {
        int [] reverse = new int [list.length];
        for (int i = 0, j = (list.length -1); i< list.length; i++, j--) {

            //reverse listenin ilk elemanı, kaynak alınan listenin son elemanına burada eşitleniyor.
            reverse[i] = list[j];
        }

        return reverse;
    }
    public static void main(String[] args) {

        int [] list = new int[10];

        for (int i = 0; i< list.length; i++) {
            list[i] = (i*10) + 10;

        }

        int [] list2 = {10,2,3,4,5,6,2,5,7,98,73,241,54,2,123,68};
        double [] list3 = {1.4,1.2,4.3,2.4,5.6,7.7};

        int[] newlist = reverse(list2);
        printArray(newlist);

    }

}
