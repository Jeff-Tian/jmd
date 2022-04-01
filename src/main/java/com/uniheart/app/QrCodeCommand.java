package com.uniheart.app;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
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

        try {
            var bitMatrix = this.generateQRCodeBitMatrix(textOrUrl);

            for(var i = 0; i < bitMatrix.getHeight(); i++){
                for(var j = 0; j < bitMatrix.getWidth(); j++){
                    System.out.print(bitMatrix.get(i, j) ? "\033[40m  \033[0m": "\033[47m  \033[0m");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    private BitMatrix generateQRCodeBitMatrix(String url) throws Exception {
        QRCodeWriter barcodeWriter = new QRCodeWriter();
        return barcodeWriter.encode(url, BarcodeFormat.QR_CODE, 30, 30);
    }
}
