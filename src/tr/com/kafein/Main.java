package tr.com.kafein;

import java.util.ArrayList;

public class Main extends Raptor{

    public static void main(String[] args) {
//        System.out.println("pre");
//        new Main();
//        System.out.println("hawk");
        ArrayList arrayList1= new ArrayList();
        deneme d =new deneme(arrayList1);
        System.out.println("cons sonrası arraylist size: " +d.arrayList.size());
        d.denemeInsert();
        System.out.println("arraylist insert edildikten sonra ki size: "+ d.arrayList.size());
        d.denemeNew();
        System.out.println("arraylist newlendikten sonra ki size: "+ d.arrayList.size());
        d.arrTry();
    }
}

class Bird{

    public Bird(){
        System.out.println("b2");
    }
    {
        System.out.println("b1");
    }
}

class Raptor extends Bird {
    static {
        System.out.println("r1");
    }
    public Raptor(){
        System.out.println("r2");
    }
    {
        System.out.println("r3");
    }
    static {
        System.out.println("r4");
    }
}
