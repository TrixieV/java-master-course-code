package PreviousChallenge;

enum Color { GREEN, RED, YELLOW}
enum PointMarker {CIRCLE, STAR, HEART}
enum LineMarker {DASHED, DOTTED, SOLID};
enum Geometry {LINE, POINT, POLYGON};
public interface Mappable1 {
    String JSON_PROPERTY = """
            "properties": {%s} 
            """;

    String getLabel();
    Geometry getGeometry();
    String getIcon();

    default String toJSON() {
        return """
                "type": "%s", "label": "%s", "marker": "%s" """.formatted(getGeometry(), getLabel(), getIcon());
    }

    static void printProperties(Mappable1 item) {
        System.out.printf(JSON_PROPERTY.formatted(item.toJSON()));
    }
}
