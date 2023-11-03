package Model;

import Interface.IUSB;

public class GabineteUSB implements IUSB {
    @Override
    public void conectarUSB() {
        System.out.println("Gabinete USB conectado.");
    }
}