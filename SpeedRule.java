public class SpeedRule implements Rule {
    String carType;
    int maxSpeed;

    public SpeedRule(String carType, int maxSpeed) {
        this.carType = carType;
        this.maxSpeed = maxSpeed;
    }

    public Violation check(Observation obs) {
        if (obs.carType.equals(carType) && obs.speed > maxSpeed) {
            String text = "speed of " + obs.speed + " exceeded max allowed " + maxSpeed;
            return new Violation(text, 300);
        }
        return null;
    }
}
