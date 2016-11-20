import java.util.Scanner;

public class Regions {
    // CONSTRUCTOR
    // METHODS
    public static String getRegion(String state) {
        state = state.toUpperCase();
        String region;
        switch (state) {
            case "ME": case "VT": case "NH": case "MA": case "CT": case "RI":
            region = "New England";
            break;
            case "NY": case "NJ": case "DE": case "MD": case "VA": case "NC": case "SC":
            region = "Atlantic";
            break;
            case "GA": case "FL": case "MS": case "AL": case "LA": case "TN":
            region = "Southeast";
            break;
            case "PA": case "OH": case "MI": case "IN": case "IL": case "WI": case "MN": case "KY": case "WV": case "IA":
            region = "Midwest";
            break;
            case "ND": case "SD": case "KS": case "NE": case "MO":
            region = "Great Plains";
            break;
            default:
            region = "invalid";
            break;
        }
        if (region.equals("invalid")) {
            return "This is an invalid state abbreviation";
        } else {
            return "The state " + state + " is in the " + region + " region";
        }
    }
    // MAIN
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Give an state: ");
        String state = s.next();

        Regions reg = new Regions();

        System.out.println(getRegion(state));

        // Litle tests
        assert getRegion("IN") == "The state IN is in the Midwest region";
        assert getRegion("SD") == "The state SD is in the Great Plains region";
        assert getRegion("QA") == "This is an invalid state abbreviation";
    }
}
