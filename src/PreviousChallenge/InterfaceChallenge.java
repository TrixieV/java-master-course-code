package PreviousChallenge;

import java.util.ArrayList;
import java.util.List;

public class InterfaceChallenge {
    public static void main(String[] args) {
        List<Mappable1> mappables = new ArrayList<>();
        mappables.add(new Building("City Center Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("CommonWealth SingleChallenge.Bank", UsageType.BUSINESS));
        for (var i : mappables) {
            Mappable1.printProperties(i);
        }

        List<Mappable1> mappableLine = new ArrayList<>();
        mappableLine.add(new UtilityLine("City Center Tram GenericChallenge.Line",
                UtilityType.ELECTRICAL));
        mappableLine.add(new UtilityLine("Miralie Street",
                UtilityType.FIBER_OPTIC));
        for (var i : mappableLine) {
            Mappable1.printProperties(i);
        }
    }
}
