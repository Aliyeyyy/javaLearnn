package j33_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {

        /*
        Queue coll. interface oldugu için child class olan LinkedList ve PriorityQueue ile obj üretilir.
        Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.
        Cons seçimine göre queque obj özellikleri belirlenr
        FİFO -> first in first out: coll. ilk giren eleman ilk çıkar. Eleman en sona eklenir enbaştan silinir
         */

        Queue<String>q1=new LinkedList<>(Arrays.asList("Cebrail","Sumeyra", "Yakup","Muharrem"));
        System.out.println("q1 = " + q1);//[Cebrail, Sumeyra, Yakup, Muharrem]
        q1.add("Erol");
        System.out.println("q1 = " + q1);//[Cebrail, Sumeyra, Yakup, Muharrem, Erol]
        Queue<String>q2=new PriorityQueue<>(Arrays.asList("JavaCan","javaSu", "javaNaz","jaViye"));
        System.out.println("q2 = " + q2);//[JavaCan, jaViye, javaNaz, javaSu]
        q2.add("javiDan");
        System.out.println("q2 = " + q2);//[JavaCan, jaViye, javaNaz, javaSu, javiDan]

        System.out.println("q1.element() = " + q1.element());// Cebrail
        System.out.println("q1.peek() = " + q1.peek());//Cebrail

        System.out.println("q1.remove() = " + q1.remove());//Cebrail

        System.out.println("q1.poll() = " + q1.poll());//Cebrail
        //peek()-> copt-paste gibi ilk elemanı return eder ama silmez
        //poll()-> cut-paste gibi ilk elemanı siler ve  return eder
        // element() -> ilk elemanı silmeden return eder.
        //remove() -> ilk elemnı siler ve return eder..

        //ahan da Trick kösesinde bugun : poll ve remove farkı ->  eger queue coll. boş ise remove NoSuchElementException
        // poll ise null return eder.

        q1.clear();//queue coll. elemanları silindi.
        System.out.println("q1 = " + q1);//[]
        System.out.println("q1.size() = " + q1.size());//0
        System.out.println("q1.poll() = " + q1.poll());//null
        System.out.println("q1.remove() = " + q1.remove());//NoSuchElementException5


        //offer()-> queue coll. eleman eklemek için kullnılır.
        System.out.println("q2.offer(\"küşleme\") = " + q2.offer("küşleme"));//true

            /*
            ahan da Trick kösesinde bugun : offer ve add farkı ->  eger queue coll. eleman kısıtlaması yapılmış ise
             add meth Exception fırlatır.offer ise true-false return eder.

            */



    }
}
