package j02_DataTypes_WrapperClass;

public class C01_VariableCreate {
    public static void main(String[] args) {
        // 1. Yol yavsiye edilen
        int yas=28;
        int maas= 33000;
        System.out.println("yas");//yaş
        System.out.println(yas);//48
        System.out.println(maas);//33000;
        System.out.println("nur hanımın başlangıç maası:"+maas);// nur hanımın başlangıç maaşı:33000;
        // 2.Yol
        int boy; // değeri olmayan boy isminde bir int tanımlandı declaration
        // System.out.println(boy);//değeri atanmamış değişkeni hiçbir aksiyonda kullanılmaz CTE
        boy=175;
        System.out.println("boyunuz:" +boy);//175

        //3.Yol
        int yevmiye,kilo,age ; //birden çok aynı tipte değişken tanımlandı
        yas=33;
        yevmiye=1000;
        kilo=99; // yanımlama değişkenlere değer ataması yapıldı..
        int gunluk=1500, yıl=2022, agırlık=99;
        //TRICK bir variable sadece bir kez tanımlanabilir ama birden çok değer atanabilir
        System.out.println(gunluk);//1500
        gunluk=1800; // yeni değer atandı
        System.out.println("gunluk son değeri:"+gunluk); // 1800
        System.out.println("gunluk değeri:"+gunluk+"yıl değeri:"+yıl+" "+yas+yevmiye+agırlık);






    }
}
