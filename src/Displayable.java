interface Displayable {

    void render();

    static double[] stringToCoordinates(String location) {

        var parts = location.split(",");
        double lat = Double.valueOf(parts[0]);
        double lng = Double.valueOf(parts[1]);
        return new double[]{lat, lng};

    }
}
