package j12_Lopps.L01_ForLoop.Task01;

import java.util.Scanner;

public class Task10_Nested {
    public static void main(String[] args) {

        /* Girilen bir ifadenin istenen harf sayısını print eden code create ediniz
        input : selam java'CANlar
        output: a sayısı:3
      */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle= sc.nextLine();
        System.out.println("Sayılacak harfi giriniz");
        char harf = sc.next().charAt(0);

        int harfsayisi = 0; // 0 atandı saymada etki etmemesi için

        for (int i = 0; i <= cumle.length()-1; i++) {
            if (cumle.charAt(i)==harf){
                harfsayisi++ ;
            }
        }

        System.out.println("girdiğiniz cumle :"+cumle+"de istediğiniz harf :"+harf+harfsayisi+" kadar var.");
    }
}
