package iceCreamShop;

public class IceRocket implements Eatable {
/*
    public IceRocket() {

    }
*/
    // Indien geen andere constructor aanwezig is de no-args constructor impliciet al aanwezig
    // of je hem nu declareert of niet.

    @Override
    public void eat() {
        System.out.println("Ice Rocket");
    }
}
