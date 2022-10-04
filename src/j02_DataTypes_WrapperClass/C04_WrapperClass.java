package j02_DataTypes_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {


    String name ="Aliye";
    int yas=28;
        System.out.println(  name.toUpperCase()); //ALİYE

        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir// ancak primitive data turlerinin boyle bir ozelligi yoktu
        // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        // Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.

        String tc ="1234455";
        String id ="98765";

        //TASK id ve tc String değerlernin toplamını print eden code yazınız





      int yeniTc= Integer.valueOf (tc); //tc String değerini int çevirdi ve yeni TC yi 2 ye ayırdı
      int yeniId= Integer.valueOf (id); //id String değerini int çevirdi ve yeni id yi 2 ye ayırdı
        System.out.println(yeniId+yeniTc); //aritmetik toplama = 1333220

        String okulNo="2345431";
        int yeniOkulNo=Integer.valueOf(okulNo);// run time Exception =çalışma zamanı hatası
        System.out.println("yeniOkulNo=" + yeniOkulNo);


        // TASK-> byte short int maximum ve minimum değerlerini print eden code yazınız

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);


        byte maxByteDegeri = Byte.MAX_VALUE;
        byte minByteDegeri = Byte.MIN_VALUE;

        System.out.println("maxByteDegeri = " + maxByteDegeri);
        System.out.println("minByteDegeri = " + minByteDegeri);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        int a=5;
        System.out.println(a);// 5
        System.out.println(5);// 5



    }
}
