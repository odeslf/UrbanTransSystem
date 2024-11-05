import java.util.ArrayList;
import java.util.List;

public class MapLayer<T extends Displayable> {

    private List<T> layerElements;

    public MapLayer(T[] layerElements) {
        this.layerElements = new ArrayList<>(List.of(layerElements));
    }

    public void addElements(T... elements) {
        layerElements.addAll(List.of(elements));
    }

    public void renderLayer() {
        for (T element : layerElements) {
            element.render();
        }
    }
}
