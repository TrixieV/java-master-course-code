package PreviousChallenge;

enum UtilityType {ELECTRICAL, FIBER_OPTIC};

public class UtilityLine implements Mappable1 {
    private String name;
    private UtilityType utility;

    public UtilityLine(String name, UtilityType utility) {
        this.name = name;
        this.utility = utility;
    }

    @Override
    public String getLabel() {
        return name + " (" + utility + ")";
    }

    @Override
    public Geometry getGeometry() {
        return Geometry.LINE;
    }

    @Override
    public String getIcon() {
        return switch (utility) {
            case ELECTRICAL -> Color.RED + " " + LineMarker.DASHED;
            case FIBER_OPTIC -> Color.YELLOW + " " + LineMarker.DOTTED;
            default -> Color.GREEN + " " + LineMarker.SOLID;
        };
    }

    @Override
    public String toJSON() {
        return Mappable1.super.toJSON() + """
               , "name": "%s", "utility": "%s" """.formatted(name, utility);
    }
}
