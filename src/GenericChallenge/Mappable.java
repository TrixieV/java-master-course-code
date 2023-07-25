package GenericChallenge;

public interface Mappable {
    abstract void render();
    static double[] stringToLatLon(String location) {
        String[] split = location.split(",");
        double lat = Double.valueOf(split[0]);
        double lng = Double.valueOf(split[1]);
        return new double[]{lat, lng};
    }

}
