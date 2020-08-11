package iceCreamShop;

Import java.util.Arrays;

public class Cone implements Eatable {
    private Flavour[] balls;

    public Cone();

    {

    }


    public Cone(Flavour[] balls) {
        this.balls = balls;
    }

    @override
    public void eat() {
        System.out.println("Cone with " + Arrays.toString(this.balls));
    }
}