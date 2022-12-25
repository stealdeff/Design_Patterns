package Builder;

public class Main {

        public static void main(String[] args) {
           HouseBuilder builder = new ModernHouseBuilder();
            AutomotiveEngineer engineer = new AutomotiveEngineer(builder);
            House c = engineer.manufactureCar();
            if (c != null) {
                System.out.println("Below house delievered: ");
                System.out.println("======================================================================");
                System.out.println(c);
                System.out.println("======================================================================");
            }
        }

    }

