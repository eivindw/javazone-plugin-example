package jz;

public class TestPlugin implements Plugin {
    public TestPlugin() {
        System.out.println("TestPlugin instantiated!");
    }

    @Override
    public void start() {
        System.out.println("TestPlugin starting..");
    }

    @Override
    public void stopp() {
        System.out.println("TestPlugin stopping..");
    }
}
