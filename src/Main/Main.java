package Main;

import Interface.IUSB;
import Model.AdaptadorPS2ParaUSB;
import Model.GabineteUSB;
import Model.TecladoPS2;

public class Main {
    public static void main(String[] args) {
        TecladoPS2 tecladoPS2 = new TecladoPS2();

        GabineteUSB gabinete = new GabineteUSB();

        IUSB adaptador = new AdaptadorPS2ParaUSB(tecladoPS2);
        adaptador.conectarUSB();
    }
}