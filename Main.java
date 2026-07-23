public class Main {
    public static void main(String[] args) {

        RadarSystem radar = new RadarSystem();


        radar.addRule(new SeatbeltRule());
        radar.addRule(new SpeedRule("Truck", 60));
        radar.addRule(new SpeedRule("Private", 80));
        radar.addRule(new SpeedRule("Bus", 70));

        
        radar.processObservation(new Observation("ABC1234", "2024-01-01", "Private", 94, false));
        radar.processObservation(new Observation("XYZ9876", "2024-01-01", "Truck", 55, true));
        radar.processObservation(new Observation("LMN4567", "2024-01-01", "Bus", 75, false));
        radar.processObservation(new Observation("DEF7890", "2024-01-01", "Private", 60, true));

        for (int i = 0; i < radar.fines.size(); i++) {
            radar.fines.get(i).print();
            System.out.println();
        }

        radar.printAllFines();
        System.out.println();
        radar.printViolatedRulesCount();
    }
}
