package Giris;

public class PatikaninSacmaSorulari {
    public static void main(String[] args) {

        /* if dışında (va2 = 6) dese de, if bloğu içinde (var2 = 1) diyerek var2'yi tekrar atamakta.

        Dolayısıyla artık if bloğu içinde (var2= 1),

        var2 = 1 için, (++var2)= 2 olacaktır.

        Patikanın saçma sorusunu olarak class açtım ama benim mallığım.

         */

        int var1 = 5;
        int var2 = 6;

        if ((var2 = 1) == var1) {

            System.out.println(var2);
        } else {
            System.out.println(++var2);

        }
    }
}