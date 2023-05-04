public enum SolarSystem {
    MERCURY(1, 0.0, 50.0, 2439.5, null),
    VENUS(2, 38.0, 42.0, 6050.0, MERCURY),
    EARTH (3, 50.0, 63.0, 6378.0, VENUS),
    MARS (4, 55.0, 72.0, 3488.0, EARTH),
    JUPITER (5, 550.0, 80.0, 7130.0, MARS),
    SATURN (6, 746.0, 100.0, 6010.0, JUPITER),
    URANUS (7, 28770.0, 150.0, 2650.0, SATURN),
    NEPTUNE (8, 30000.0, 200.0, 24750.0, URANUS);

    private final Integer orderFromSun;
    public final Double distanceFromThePreviousPlanet;
    public final Double distanceToTheNextPlanet;
    private final Double distanceToTheSun;
    private final Double radius;
    private final SolarSystem previousPlanet;

    SolarSystem(int orderFromSun, double distanceFromPreviousPlanet, double radius, SolarSystem previousPlanet, String nextPlanet){
        this.orderFromSun = orderFromSun;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.distanceFromSun = previousPlanet != null ? previousPlanet.distanceFromSun + distanceFromPreviousPlanet : init;
        this.nextPlanet = nextPlanet;
    }

}
