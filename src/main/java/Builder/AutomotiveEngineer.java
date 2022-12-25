package Builder;

public class AutomotiveEngineer {

    private HouseBuilder builder;

    public AutomotiveEngineer(HouseBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Automotive Engineer can't work without House Builder!");
        }
    }

    public House manufactureCar() {
        return builder.fixroof().fixBody().buildwalls().fixInterior().build();
    }

}
