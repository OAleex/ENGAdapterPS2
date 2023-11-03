package Model;

import Interface.IUSB;

public class AdaptadorPS2ParaUSB implements IUSB {
    private TecladoPS2 tecladoPS2;

    public AdaptadorPS2ParaUSB(TecladoPS2 tecladoPS2) {
        this.tecladoPS2 = tecladoPS2;
    }

    @Override
    public void conectarUSB() {
        System.out.println("Adaptando teclado PS2 para USB");
        tecladoPS2.conectarPS2();
    }
}