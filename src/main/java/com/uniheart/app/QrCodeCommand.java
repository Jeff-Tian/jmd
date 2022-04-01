package com.uniheart.app;

import picocli.CommandLine;

@CommandLine.Command(
        name = "qr"
)
public class QrCodeCommand implements Runnable {
    @Override
    public void run() {
        System.out.println("Generating QR Code... ");
    }
}
