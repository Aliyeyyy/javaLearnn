package j12_Lopps.L01_ForLoop.Task01;

import java.util.Scanner;

public class Task02_Polindrome {


    public static void main(String[] args) {
         /* Girilen ifadenin polindrome olmasını ifade eden method create ediniz..
         polindrome: Her iki yönden okunduğunda eşit olan ifadeler
         ey edip adanada pide ye
          */

        Scanner sc = new Scanner(System.in);
        System.out.println("bir metin giriniz : " );
        String str = sc.nextLine();
        polindrome(str);//String parametreli method call


    }//main dışı

    private static void polindrome(String str) {//
        String  tersStr="";//bos bir String kutu kulah
        for (int i =str.length()-1; i >=0 ; i--) {

            tersStr+=str.charAt(i);//strnin i.Ci karakterini tersStr'ye ekler(concat)
        }
        System.out.println("girilen ifadenin tersi :"+tersStr);

        if (str.equalsIgnoreCase(tersStr)){//str ile tersSTr eşitlik kontrolu
            System.out.println("girilen ifade POLİNDROME ");

        }else System.out.println("girlen ifade polindrome değil");

    }


}








