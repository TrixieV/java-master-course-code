package PreviousChallenge;

enum UsageType {BUSINESS, ENTERTAINMENT, GOVERNMENT};

public class Building implements Mappable1 {

    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public Geometry getGeometry() {
        return Geometry.POINT;
    }

    @Override
    public String getIcon() {
        return switch (usage) {
            case BUSINESS -> Color.RED + " " + PointMarker.CIRCLE;
            case GOVERNMENT -> Color.GREEN + " " + PointMarker.HEART;
            case ENTERTAINMENT -> Color.YELLOW + " " + PointMarker.STAR;
            default -> Color.RED + " " + PointMarker.HEART;
        };
    }

    @Override
    public String toJSON() {
        return Mappable1.super.toJSON() + """
               , "name": "%s", "usage": "%s" """.formatted(name, usage);
    }
}
