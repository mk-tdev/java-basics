package com.mk.interfaces_abstracts;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Tampines Hub", UsageType.ENTERTAINMENT));
        mappables.add(new Building("MOM", UsageType.GOVERNMENT));
        mappables.add(new Building("Bedok Sports Hub", UsageType.SPORTS));

        mappables.add(new UtilityLine("College St",UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Olympic Blvd",UtilityType.WATER));

        for(var m: mappables) {
            Mappable.mapIt(m);
        }
    }
}
