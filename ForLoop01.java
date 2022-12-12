package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {
        //Ex 1: 3 den 6 ya kadar tam sayıların toplamını bulan kodu yazınız

        int sum = 0;
        for (int i = 3; i < 7; i++) {
            sum = sum + i;
        }
        // sout loop un dışına yazılırsa sadece sum ın son değerini yazdırır.
        // Loop un için eyazılırsa her bir loop için sum ın hangi değerleri aldığını yazdırır.
        System.out.println(sum);

        //Ex 2: 6 dan 3 e kadar tam sayıların çarpımını bulan kodu yazınız

        int multiply = 1;
        for (int i = 6; i > 2; i--) {

            multiply = multiply * i;

        }
        System.out.println(multiply);

        //Size verilen bir tam sayinin rakamları toplamını bulunuz.

        int num = -385;
        num = Math.abs(num);
        int sonuc = 0;
        for (int i = num; i > 0; i = i / 10) {

            sonuc = sonuc + i%10;
        }
        System.out.println(sonuc);

        //Ex 4: Size verilen bir String i ters ceviren kodu yazınız.
        // "Kaba" -->"abaK"

        String str = "Kaba";
        String ters = "";
        for (int i = str.length()-1   ; i>-1  ; i-- ){
             char ch =str.charAt(i);
             ters = ters + ch;
        }
        System.out.println(ters);



    }
}
