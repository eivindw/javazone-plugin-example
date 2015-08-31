package jz;

import java.util.ServiceLoader;

public class Server {

    public static void main(String[] args) throws Exception {
        System.out.println("Starting server!\n");

        final ServiceLoader<Plugin> pluginLoader = ServiceLoader.load(Plugin.class);

        // Ved oppstart av server
        pluginLoader.forEach(Plugin::start);

        System.out.println("\nPress <ENTER> to quit");
        System.in.read();

        // Ved shutdown av server
        System.out.println("Stopping server!\n");
        pluginLoader.forEach(Plugin::stopp);
    }
}
