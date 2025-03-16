package com.mk.generics;

public class Main {
    public static void main(String[] args) {

        var nationalSGParks = new Park[]{
                new Park("Tampines eco", "1.364704, 103.94860"),
                new Park("Bedok res", "1.3429061, 103.927232"),
                new Park("Kallang riverside", "1.3076235, 103.86902"),
        };

        var majorSGRivers = new River[]{
                new River("Singapore River", "1.29241, 103.83851", "1.291806, 103.835819"),
                new River("Marina Channel", "1.287721, 103.8629", "1.28766, 103.85689")
        };

        Layer<Park> parkLayer = new Layer<>(nationalSGParks);
        parkLayer.renderLayer();

        Layer<River> riverLayer = new Layer<>(majorSGRivers);
        riverLayer.addElements(new River("Some river", "1.12, 3.435"));
        riverLayer.renderLayer();



    }
}
