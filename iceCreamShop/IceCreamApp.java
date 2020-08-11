package iceCreamShop;

import be.vdab.eatables;
import be.vdab.sellers;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(0.75, 1.5, 2.5);
        IceCreamCar iceCreamSalon;
        IceRocket boughtIceRocket = iceCreamSalon.orderIceRocket();
        Cone boughtCone = iceCreamSalon.orderCone(new flavour[]{Flavour.mocha, Flavour.Stracciatella, Flavour.Lemon});
        Magnum boughtMagnum = iceCreamSalon.orderMagnum(MagnumType.Whitechocolate);

        Eatable[] orderedIceCreams = {boughtCone, boughtIceRocket, boughtMagnum};
        for (int i = 0; i < orderedIceCreams.length; i++) {
            orderedIceCreams[i].eat();
        }
        System.out.println("your Profit: " + iceCreamSalon.profit());
    }
}

