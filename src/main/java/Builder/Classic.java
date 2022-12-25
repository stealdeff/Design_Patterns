package Builder;

public class Classic extends HouseBuilder {

    private String roof;
    private String walls;
    private String body;
    private String interior;

    public  Classic() {
        super();
    }

    @Override
    public HouseBuilder fixroof() {
        System.out.println("Assembling roof of the classical model");
        this.roof = "Classic roof";
        return this;
    }

    @Override
    public HouseBuilder fixBody() {
        System.out.println("Assembling body of the classical model");
        this.body = "Classic Body";
        return this;
    }

    @Override
    public HouseBuilder buildwalls() {
        System.out.println("Walls of the classical model");
        this.walls= "Classic Wall";
        return this;
    }

    @Override
    public HouseBuilder fixInterior() {
        System.out.println("Setting up interior of the classical model");
        this.interior = "Classic interior";
        return this;
    }

    @Override
    public House build() {
        House h = new House(walls, body, roof, interior);
        if (h.doQualityCheck()) {
            return h;
        } else {
            System.out.println("House assembly is incomplete. Can't deliver!");
        }
        return null;
    }

}