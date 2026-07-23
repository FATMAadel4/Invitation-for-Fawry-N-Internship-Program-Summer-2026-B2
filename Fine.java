import java.util.ArrayList;

public class Fine {
    public String plateNumber;
    public ArrayList<Violation> violations;
    public int total;

    public Fine(String plateNumber, ArrayList<Violation> violations) {
        this.plateNumber = plateNumber;
        this.violations = violations;

        total = 0;
        for (int i = 0; i < violations.size(); i++) {
            total = total + violations.get(i).fee;
        }
    }

    public void print() {
        System.out.println("Traffic fine for car " + plateNumber);
        System.out.println("Total amount: " + total + " EGP");
        System.out.println("Violations:");
        for (int i = 0; i < violations.size(); i++) {
            Violation v = violations.get(i);
            System.out.println("- " + v.text + " : " + v.fee + " EGP");
        }
    }
}
