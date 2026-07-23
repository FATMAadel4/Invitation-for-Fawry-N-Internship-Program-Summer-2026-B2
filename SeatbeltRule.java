public class SeatbeltRule implements Rule {

    public Violation check(Observation obs) {
        if (obs.seatbeltFastened == false) {
            return new Violation("Seatbelt not fastned", 100);
        }
        return null;
    }
}
