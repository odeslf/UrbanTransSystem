public class Station extends Place {

    private String stationName;

    public Station(String stationName, String coordinates) {
        super(coordinates);
        this.stationName = stationName;
    }

    @Override
    public String toString() {
        return  stationName + " Station";
    }
}
