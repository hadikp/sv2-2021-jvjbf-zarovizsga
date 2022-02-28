package shipping;

public class InternationalPackage implements Transportable {

    private int weight;
    private boolean breakable;
    private String destinationCountry;
    private int distance;
    public static final int PRICE_INTERNATIONAL = 1200;

    public InternationalPackage(int weight, boolean breakable, String destinationCountry, int distance) {
        this.weight = weight;
        this.breakable = breakable;
        this.destinationCountry = destinationCountry;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
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
            return 2*PRICE_INTERNATIONAL+10*distance;
        }else{
            return PRICE_INTERNATIONAL+10*distance;
        }
    }

    @Override
    public String getDestinationCountry() {
        return destinationCountry;
    }

}
