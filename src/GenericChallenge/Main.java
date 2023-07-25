package GenericChallenge;

public class Main {
    public static void main(String[] args) {
        var nationalUSParks = new Park[]{
                new Park("Yellowstone", "44.567, -110.6745"),
                new Park("Grand Canyon", "36.6233, -112.0485"),
                new Park("Yosemite", "37.2332, -119.5673")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();
    }
}
