import java.util.Arrays;

abstract class Place implements Displayable{

    protected double[] coordinates = new double[2];

    public Place(String coordinates) {
        this.coordinates = Displayable.stringToCoordinates(coordinates);
    }

    private String coordinates() {
        return Arrays.toString(coordinates);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as a PLACE (" + coordinates() + ")");
    }
}
