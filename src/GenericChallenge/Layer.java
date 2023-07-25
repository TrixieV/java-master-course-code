package GenericChallenge;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {
    private List<T> elements;

    public Layer(T[] elements) {
        this.elements = new ArrayList<T>(List.of(elements));
    }

    public void addElement(T... element) {
        elements.addAll(List.of(element));
    }

    public void renderLayer() {
        for (var e : elements) {
            e.render();
        }
    }
}
