public class Observation {
    public String plateNumber;
    public String date;
    public String carType;
    public int speed;
    public boolean seatbeltFastened;

    public Observation(String plateNumber, String date, String carType, int speed, boolean seatbeltFastened) {
        this.plateNumber = plateNumber;
        this.date = date;
        this.carType = carType;
        this.speed = speed;
        this.seatbeltFastened = seatbeltFastened;
    }
}
