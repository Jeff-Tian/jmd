package com.uniheart.app;

import picocli.CommandLine;

@CommandLine.Command(
        name = "hello",
        description = "Says hello"
)
public class App implements Runnable {
    public static void main(String[] args) {
        CommandLine.run(new App(), args);
    }

    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}
