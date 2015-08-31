package jz;

public class AnnenPlugin implements Plugin {
    public AnnenPlugin() {
        System.out.println("AnnenPlugin instansiert!");
    }

    @Override
    public void start() {
        System.out.println("AnnenPlugin starter..");
    }

    @Override
    public void stopp() {
        System.out.println("AnnenPlugin stopper..");
    }
}
