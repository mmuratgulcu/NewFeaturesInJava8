package tr.com.kafein._01_interfaces;

public class App {
    public static void main(String[] args) {

        Fly flyEagle = new Eagle();

        System.out.println("The wingspan of the Eagle : "+ flyEagle.getWingSpan() + " meters");

        flyEagle.land();
        flyEagle.eat();

        System.out.println("Eagle's speed : " + Fly.calculateSpeed(1000,10));

    }
}
