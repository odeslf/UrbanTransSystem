import java.util.Arrays;

abstract class Route implements Displayable{

    protected double[][] routeCoordinates;

    public Route(String... locations) {
        this.routeCoordinates = new double[locations.length][];

        for (int i = 0; i < locations.length; i++) {
            this.routeCoordinates[i] = Displayable.stringToCoordinates(locations[i]);
        }
    }

    private String routeCoordinates() {
        return Arrays.deepToString(routeCoordinates);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as ROUTE (" + routeCoordinates() + ")");
    }
}
