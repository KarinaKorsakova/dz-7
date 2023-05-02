public enum SolarSystem {
    MERCURY(1, 0, 24d),
    VENUS(2, 3.8d, 60d),
    EARTH (3, 5d, 63.7d),
    MARS (4, 5.5d, 348.8d),
    JUPITER (5, 55d, 710d),
    SATURN (6, 74d, 601d),
    URANUS (7, 287d, 265d),
    NEPTUNE (8, 300d, 2475d);

    SolarSystem(int orderFromSun, double distanceFromPreviousPlanet, double radius, SolarSystem previousPlanet, String nextPlanet){
        this.orderFromSun = orderFromSun;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.distanceFromSun = previousPlanet != null ? previousPlanet.distanceFromSun + distanceFromPreviousPlanet : init;
        this.nextPlanet = nextPlanet;
    }

}
