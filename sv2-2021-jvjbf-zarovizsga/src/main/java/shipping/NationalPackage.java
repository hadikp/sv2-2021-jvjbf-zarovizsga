package shipping;

public class NationalPackage implements Transportable {

    private int weight;
    private boolean breakable;
    public static final int PRICE = 1000;

    public NationalPackage(int weight, boolean breakable) {
        this.weight = weight;
        this.breakable = breakable;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public boolean isBreakable() {
        return breakable;
    }

    @Override
    public int calculateShippingPrice() {
        if(breakable){
            return 2*PRICE;
        }else{
            return PRICE;
        }
    }

    @Override
    public int getDistance() {
        return 0;
    }
}
