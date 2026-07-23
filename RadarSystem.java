import java.util.ArrayList;
import java.util.HashMap;

public class RadarSystem {
    ArrayList<Rule> rules = new ArrayList<>();
    ArrayList<Fine> fines = new ArrayList<>();
    HashMap<String, Integer> violationCount = new HashMap<>();

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    
    public void processObservation(Observation obs) {
        ArrayList<Violation> violations = new ArrayList<>();

        for (int i = 0; i < rules.size(); i++) {
            Violation v = rules.get(i).check(obs);
            if (v != null) {
                violations.add(v);

                if (violationCount.containsKey(v.text)) {
                    violationCount.put(v.text, violationCount.get(v.text) + 1);
                } else {
                    violationCount.put(v.text, 1);
                }
            }
        }

        if (violations.size() > 0) {
            Fine fine = new Fine(obs.plateNumber, violations);
            fines.add(fine);
        }
    }

    public void printAllFines() {
        System.out.println("All fines:");
        for (int i = 0; i < fines.size(); i++) {
            Fine f = fines.get(i);
            System.out.println(f.plateNumber + " -> " + f.total + " EGP");
        }
    }

    public void printViolatedRulesCount() {
        System.out.println("Violated rules count:");
        for (String key : violationCount.keySet()) {
            System.out.println(key + " -> " + violationCount.get(key) + " times");
        }
    }
}
