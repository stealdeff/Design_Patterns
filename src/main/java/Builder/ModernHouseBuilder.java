package Builder;


    public class ModernHouseBuilder extends HouseBuilder
    {

        private String roof;
        private String walls;
        private String body;
        private String interior;

        public ModernHouseBuilder() {
            super();
        }

        @Override
        public HouseBuilder fixroof() {
            System.out.println("Assembling roof of the modern model");
            this.roof = "Modern roof";
            return this;
        }

        @Override
        public HouseBuilder fixBody() {
            System.out.println("Assembling body of the modern model");
            this.body = "Modern Body";
            return this;
        }

        @Override
        public HouseBuilder buildwalls() {
            System.out.println("Walls of the modern model");
            this.walls= "Modern Wall";
            return this;
        }

        @Override
        public HouseBuilder fixInterior() {
            System.out.println("Setting up interior of the modern model");
            this.interior = "Modern interior";
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
