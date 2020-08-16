package iceCreamShop;

import java.util.Arrays;
// Import java.util.Arrays;
// Het reserved word is import, Import met hoofdletter zal niet werken.

public class Cone implements Eatable {
    private Flavour[] balls;


    // puntkomma sluit de lijn af. De curly braces hieronder zijn een losse codeblok die niks meer te maken hebben met deze constructor.
    // gebruik de code generator van intellij om constructor te genereren.
    public Cone();

    {

    }

    public Cone(Flavour[] balls) {
        this.balls = balls;
    }

    @override // Override met een hoofdletter!!!
    public void eat() {
        System.out.println("Cone with " + Arrays.toString(this.balls));
    }
}
