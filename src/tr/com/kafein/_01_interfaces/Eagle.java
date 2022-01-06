package tr.com.kafein._01_interfaces;

public class Eagle implements Fly{

    @Override
    public int getWingSpan() {
        return 4;
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }


}
