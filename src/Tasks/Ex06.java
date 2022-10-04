package Tasks;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

      /*  TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
        kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
        kontrol edip kalan yıl ve prim gununu print eden code create ediniz */

        Scanner sc = new Scanner(System.in);

        System.out.print("cinsiyetiniz \n KADIN için-> K\n ERKEK için-> E\n giriniz : ");

        char cnsyt = sc.next().charAt(0);

        System.out.println("yasınızı giriniz : ");
        int yas = sc.nextInt();
    }
}
