public class BusRoute extends Route {

    private String routeNumber;

    public BusRoute(String routeNumber, String... locations) {
        super(locations);
        this.routeNumber = routeNumber;
    }

    @Override
    public String toString() {
        return  routeNumber + " Bus Route";
    }
}
