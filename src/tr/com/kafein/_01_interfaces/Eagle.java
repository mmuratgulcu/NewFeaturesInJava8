package tr.com.kafein._01_interfaces;

public class Eagle implements Fly{

    @Override
    public int getWingSpan() {
        return 3;
    }

    @Override
    public String getBreed() {
        return "Şah Kartalı";
    }

    @Override
    public void eat() {
        System.out.println("Kartal besleniyor.");
    }

    @Override
    public int getAge() {
        return 10;
    }

    @Override
    public void land() {
        System.out.println("Kartal inişe geçiyor.");
    }
}
