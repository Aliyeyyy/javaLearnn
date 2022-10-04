package day02;

public class Q03_IncrementDecrement {
    public static void main(String[] args) {

        System.out.println("-----Arttirma-----");

        int a = 1;

        System.out.println(++a); //2  value :2
        System.out.println(a++); //2  value :3
        System.out.println(a); //3

        System.out.println("-----Azaltma----");

        int b = 5;

        System.out.println(--b); //4  value :4
        System.out.println(b--); //4  value :3
        System.out.println(b); //3

        System.out.println("---soru1---");
        int x = 20;
        int y = 15;

        System.out.println(++x + y--);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int k =5;
        System.out.println(++k + k++ + k++ + --k + k-- + k); //6+6+7+7+7+6 ->39







    }



}
