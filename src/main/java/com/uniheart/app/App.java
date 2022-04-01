package com.uniheart.app;

import picocli.CommandLine;

@CommandLine.Command(
        name = "hello",
        description = "Says hello"
)
public class App implements Runnable {
    public static void main(String[] args) {
        var cmd = new CommandLine(new App());
        cmd.addSubcommand("qr", new QrCodeCommand());

        cmd.parseWithHandler(new CommandLine.RunLast(), args);
    }

    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}
