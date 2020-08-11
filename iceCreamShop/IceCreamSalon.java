package iceCreamShop;

import.be.vdab.eatables;

public class IceCreamSalon implements IceCreamSeller{
    private PriceList priceList;
    private double profit;

    public IceCreamSalon(PriceList priceList){
        this.priceList = priceList;
    }

    @Override
    public Cone orderCone(Flavour[] balls){
        Cone orderedDone = new Cone(balls);
        profit += priceList.getRocketPrice();
        return orderedIceRocket;
    }

    @override
    public Magnum orderMagnum(MagnumType type) {
        Magnum orderedMagnum = new Magnum(type);
        profit += priceList.getMagnumPrice(type);
        return orderedMagnum;
    }

    public double getProfit() {
        return profit;
    }
}
