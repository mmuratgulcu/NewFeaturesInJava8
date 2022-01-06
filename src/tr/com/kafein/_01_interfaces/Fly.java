package tr.com.kafein._01_interfaces;

public interface Fly {

    int getWingSpan();

    default void land(){
        System.out.println("Animal is landing");
    }

    default void eat(){
        System.out.println("Animal is eating");
    }

    static double calculateSpeed(double distance, double time){
        return distance/time;
    }

}
