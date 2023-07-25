package GenericChallenge;

import java.util.Arrays;

public abstract class Line implements Mappable {
    @Override
    public void render() {
        System.out.println("Render " + this + " as LINE ("
                + location() + ")");
    }

    private double[][] location = new double[2][3];
    public Line(String... location) {
        this.location = new double[location.length][];
        int index = 0;
        for (var l : location) {
            this.location[index++] = Mappable.stringToLatLon(l);
        }
    }

    private String location() {
        return Arrays.deepToString(location);
    }
}


class River extends Line {
    private String name;

    public River(String name, String... location) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " River";
    }
}