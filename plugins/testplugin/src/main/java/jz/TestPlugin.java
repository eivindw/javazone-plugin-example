package jz;

public class TestPlugin implements Plugin {
    public TestPlugin() {
        System.out.println("TestPlugin instansiert!");
    }

    @Override
    public void start() {
        System.out.println("TestPlugin starter..");
    }

    @Override
    public void stopp() {
        System.out.println("TestPlugin stopper..");
    }
}
