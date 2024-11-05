public class Main {
    public static void main(String[] args) {

        var station = new Station[] {
                new Station("Nova Iguaçu", "44.44882, -110.5916"),
                new Station("Madureira", "36.1085, -112.0965")
        };

        MapLayer<Station> stationLayer = new MapLayer<>(station);
        stationLayer.renderLayer();

        var route = new Route[] {
                new BusRoute("10", "34.56, -123.45"),
                new BusRoute("20", "34.58, -158.54")
        };

        MapLayer<Route> routeLayer = new MapLayer<>(route);
        routeLayer.renderLayer();
    }
}