package j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {

        String ad="aliye";
        String soyad="yörüdü";

        int a=7;
        int b=11;
        // Birden çok string variable ile farklı data type variableler + ile işleme alınırsa java birleştirme
        // yaparak yeni bir String oluşturur.

        // TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
        // işlem yapılıp String variable'a Concatenation yapılır.


        System.out.println(ad+soyad+a+b);//aliyeyörüdü711
        System.out.println(a+ad+soyad+b);//7aliyeyörüdü11
        System.out.println(a+b+ad+soyad);//18aliyeyörüdü
        System.out.println(" "+a+b);// 711
        System.out.println(ad+soyad+(a+b));//aliyeyörüdü18
        System.out.println((a+b)+ad+soyad);//18aliyeyörüdü
        System.out.println(ad+(a-b)+(a-b));//aliye-4-4
        System.out.println(ad+((a-b)+(a-b)));//aliye-8

        char ch='1';//
        System.out.println(ad+ch);//aliye1
        System.out.println(a+ch+ad);//56aliye
        System.out.println(ad+(ch+b));//aliye60
        System.out.println(a+ad+ch);//7aliye1

        /* TRICK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
     eger isleme girdigi variables  aritmetik bir islemse  ascii değeri ile işelm yapar ->
      */


    }
}
