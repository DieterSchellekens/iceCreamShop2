package iceCreamShop;

//import be.vdab.NoMoreIceCreamException;
//import be.vdab.eatables;
//same with the be.vdab packages??

public interface IceCreamSeller extends iceCreamShop.Profitable {
    Cone orderCaone(Flavour[] balls) throws NoMoreCreamException;

    Magnum orderMagnum(MagnumType type) throws NoMoreCreamException;

    IceRocket orderIceRocket() throws NoMoreCreamException;
}
