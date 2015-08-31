package jz;

import java.util.ServiceLoader;

public class Server {

    public static void main(String[] args) {
        System.out.println("Starter server!");

        final ServiceLoader<Plugin> pluginLoader = ServiceLoader.load(Plugin.class);

        // Ved oppstart av server
        pluginLoader.forEach(Plugin::start);

        // Ved shutdown av server
        pluginLoader.forEach(Plugin::stopp);
    }
}
