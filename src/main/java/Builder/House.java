package Builder;

public class House {
    private String roof;
    private String walls;
    private String body;
    private String interior;

    public House() {

        super();
    }

    public House(String roof, String body, String walls, String interior) {
        this();
        this.roof = roof;
        this.body = body;
        this.walls= walls;
        this.interior = interior;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;

    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }
    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public boolean doQualityCheck() {
        return (roof!= null && !roof.trim().isEmpty()) && (body != null && !body.trim().isEmpty())
                && (walls!= null && !walls.trim().isEmpty()) && (interior != null && !interior.trim().isEmpty());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("House [walls=").append(walls).append(", body=").append(body).append(", roof=").append(roof);
        return builder.toString();
    }
}
