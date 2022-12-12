package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {
        //Bir Stringteki "m" hariç tüm karakterleri yazdırınız

        String str = "madam";
        for (int i = 0; i<str.length(); i++ ){
            char c = str.charAt(i);
            if (c!='m'){  //büyük küçük ayrımı olmasın istiyorsak if(c!='m' && 'M')
                System.out.print(c);
            }
        }
        System.out.println("");

        //2. Yol
        for (int i = 0; i<str.length(); i++ ) {
            char c = str.charAt(i);
            if (c=='m'){
                continue; //loop un içinde bazı değerler için Loop un çalışmamasını isterseniz "continue" kullanırız
            }System.out.print(c);
        }

        //Ex 2 : 1den 80 e kadar tüm tam sayıları ekrana yazdırınız, 4 ile bölünenler hariç
        System.out.println("");


        for ( int i = 1 ; i<81  ; i++){

            if (i%4==0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println(" ");

        //Ex 3: Size verilen stringteki "m" den önceki karakterleri yazdırınız

        String s = "Luxemburg";

        for (int i = 0; i<str.length(); i++){
            char ch = s.charAt(i);
            if (ch=='m'){
                break;
            }
            System.out.print(ch);

        }



    }
}
