package jz;

public class OtherPlugin implements Plugin {
    public OtherPlugin() {
        System.out.println("OtherPlugin instantiated!");
    }

    @Override
    public void start() {
        System.out.println("OtherPlugin starting..");
    }

    @Override
    public void stop() {
        System.out.println("OtherPlugin stopping..");
    }
}
