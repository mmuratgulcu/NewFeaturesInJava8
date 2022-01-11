package tr.com.kafein._01_interfaces;

public interface Fly {

    int getWingSpan();
    int getAge();
    String getBreed();

    default void land(){
        System.out.println("Kanatlı hayvan inişe geçiyor.");
    }

    default void eat(){
        System.out.println("Kanatlı hayvan besleniyor.");
    }

    static double calculateSpeed(double distance, double time){
        return distance/time;
    }
}
