package shipping;

public interface Transportable {

    int getWeight();
    boolean isBreakable();
    int calculateShippingPrice();
    int getDistance();
    default String getDestinationCountry(){
        return "Hungary";
    }
}
