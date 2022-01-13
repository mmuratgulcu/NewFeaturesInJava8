package tr.com.kafein;

import java.util.ArrayList;

public class deneme {
    int i=0;
    ArrayList arrayList;

    public deneme(ArrayList arrayList) {
        this.arrayList=arrayList;
        arrayList.add(2);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public ArrayList getArrayList() {
        return arrayList;
    }

    public void denemeNew(){
        arrNew(this.arrayList);
    }
    public void denemeInsert(){
        arrInsert(this.arrayList);
    }

    public void arrNew(ArrayList arrayList){
        arrayList=new ArrayList();
    }
    public void arrInsert(ArrayList arrayList){
        arrayList.add(2);
    }

    public void arrTry(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(22);
        arrayList.add(23);
        ArrayList arrayList1=new ArrayList();
        arrayList1.add(2);
        System.out.println("arraylist' in eleman sayısı: "+arrayList.size());
        System.out.println("arraylist1' in eleman sayısı: "+arrayList1.size());
        arrayList=arrayList1;
        System.out.println("arrayList=arrayList1 işlemi");
        System.out.println("arraylist' in eleman sayısı: "+arrayList.size());
        System.out.println("arraylist' in eleman sayısı: "+arrayList1.size());

    }
}