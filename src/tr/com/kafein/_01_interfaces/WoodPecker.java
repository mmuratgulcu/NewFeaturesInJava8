package tr.com.kafein._01_interfaces;

public class WoodPecker implements Fly{

    @Override
    public int getWingSpan() {
        return 1;
    }

    @Override
    public int getAge() {
        return 3;
    }

    @Override
    public String getBreed() {
        return "Atlas Ağaçkakanı";
    }

}
