package iceCreamShop;

public class Stock {
    private int iceRockets;
    private int cones;
    private int balls;
    private int magnum;

    public Stock(int iceRockets, int cones, int balls, int magnum) {
        this.iceRockets = iceRockets;
        this.cones = cones;
        this.balls = balls;
        this.magnum = magnum;
    }

    public int getIceRockets() {
        return iceRockets;
    }

    public void setIceRockets(int iceRockets) {
        this.iceRockets = iceRockets;
    }

    public int getCones() {
        return cones;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getMagnum() {
        return magnum;
    }

    public void setMagnum(int magnum) {
        this.magnum = magnum;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "iceRockets=" + iceRockets +
                ", cones=" + cones +
                ", balls=" + balls +
                ", magnum=" + magnum +
                '}';
    }
}
}
