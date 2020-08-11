package iceCreamShop;

import be.vdab.NoMoreIceCreamException;
import be.vdab.eatables;

public interface IceCreamSeller extends Profitable {
    Cone orderCaone(Flavour[] balls) throws NoMoreCreamException;

    Magnum orderMagnum(MagnumType type) throws NoMoreCreamException;

    IceRocket orderIceRocket() throws NoMoreCreamException;
}
