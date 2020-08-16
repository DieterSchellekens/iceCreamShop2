package iceCreamShop;

//import org.w3c.dom.ls.LSOutput;
//this is definitely not the right import
public class IceCreamAppV2 {
    public static void main(String[] args) {
        throws NoMoreIceCreamException {
            PriceList priceList = new PriceList(0.75, 1.5, 2.5);
            Stock iceCreamStock = new Stock(4, 8, 6, 7);

            IceCreamCar iceCreamCar = new iceCreamCar(pricelist, iceCreamStock);

            IceRocket boughtIceRocket = iceCreamCar.orderIceRocket();
            Cone boughtCone = iceCreamCar.orderCone(new Flavour[]{Flavour.Mocha, Flavour.Stracciatella, Flavour.Lemon});
            Magnum boughtMagnum = iceCreamCar.orderMagnum(MagnumType.Romanticstrawberries);

            Eatable[] orderedIceCreams = {boughtCone, boughtIceRoccket, boughtMagnum};
            for (int i = 0; i < orderedIceCreams.length; i++)
        }
    }
    System.out.println("your profit is: "+iceCreamCar.getProfit());
}
