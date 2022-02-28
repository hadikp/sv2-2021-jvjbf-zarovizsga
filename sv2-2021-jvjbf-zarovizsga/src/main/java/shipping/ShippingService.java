package shipping;

import java.util.*;

public class ShippingService {

    private List<Transportable> packages = new ArrayList<>();

    public List<Transportable> getPackages() {
        return packages;
    }

    public void addPackage(Transportable packag) {
        packages.add(packag);
    }

    public List<Transportable> collectItemsByBreakableAndWeight(boolean breakable, int weight) {
        return packages.stream().filter(p -> p.isBreakable() == breakable && p.getWeight() >= weight).toList();
    }

    public Map<String, Integer> collectTransportableByCountry() {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < packages.size(); i++) {
            String actualKey = packages.get(i).getDestinationCountry();
            if (!result.containsKey(actualKey)) {
                result.put(actualKey, 1);
            } else {
                result.put(actualKey, result.get(actualKey) + 1);
            }

        }
        return result;
    }

    public List<Transportable> sortInternationalPackagesByDistance() {
        List<Transportable> result = new ArrayList<>();
        for (int i = 0; i < packages.size(); i++) {
            if (packages.get(i) instanceof InternationalPackage) {
                result.add(packages.get(i));
            }
        }
        return result.stream().sorted(Comparator.comparing(p -> p.getDistance())).toList();
    }
}
