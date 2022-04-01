package com.uniheart.app;

import picocli.CommandLine;

@CommandLine.Command(
        name = "qr"
)
public class QrCodeCommand implements Runnable {
    @CommandLine.Option(names={"-t", "--url"})
    private String textOrUrl;

    @Override
    public void run() {
        System.out.println("Generating QR Code... " + textOrUrl);
    }
}
