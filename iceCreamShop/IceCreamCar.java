package iceCreamShop;

import be.vdab.NoMoreIceCreamException;
import be.vdab.eatables;

public class IceCreamCar implements IceCreamSeller {
    private PriceLis pricelist;
    private Stock stock;
    private double profit;

    public IceCreamCar(Pricelist pricelist, Stock stock) {
        this.pricelist = pricelist;
        this.stock = stock;
    }

    public cone orderCone(Flavour[] balls) throws NoMoreCreamException {
        if (stock.getCones() > 0 && stock.getBalls() > 0) {
            Cone orderedCone = new Cone(Balls);
            profit += pricelist.getBallPrice() * balls.length;
            stock.setCones(stock.getCones() - 1);
            stock.setBalls(stock.getBalls() - balls.length);
            return orderedCone;
        } else throw new NoMoreCreamException("NOT ENOUGH OF CREAM!!!");
    }

    @Override
    public Magnum orderMagnum(MagnumType type) throws NoMoreCreamException {
        if (stock.getMagnum() > 0) {
            Magnum orderedMagnum = new Magnum(type);
            profit += pricelist.getMagnumPrice(type);
            stock.setMagnum(stock.getMagnum() - 1);
            return orderedMagnum;
        } else throw new NoMoreCreamException("WE DO NOT HEVE ANY MAGNUM IN STOCK");
    }

    public double getProfit() {
        return profit()
    }
}
