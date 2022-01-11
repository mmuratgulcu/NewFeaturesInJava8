package tr.com.kafein._01_interfaces;

public class App {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();

        System.out.println("Tür : " + eagle.getBreed());
        System.out.println("Yaş : " + eagle.getAge());
        System.out.println("Kanat Açıklığı : " + eagle.getWingSpan() + " metre");

        eagle.land();
        eagle.eat();

        System.out.println("Kartalın Hızı : " + Fly.calculateSpeed(1000.0,10.0));

        System.out.println("*****************************");

        WoodPecker woodPecker = new WoodPecker();

        System.out.println("Tür : " + woodPecker.getBreed());
        System.out.println("Yaş : " + woodPecker.getAge());
        System.out.println("Kanat Açıklığı : " + woodPecker.getWingSpan() + " 20 santimetre");

        woodPecker.eat();
        woodPecker.land();

        System.out.println("Ağaçkakanın Hızı : " + Fly.calculateSpeed(100,2));
    }
}
