import java.util.Scanner;

public class LeapYear {
    // CONSTRUCTOR
    // METHODS
    Boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 != 0){
            return true;
        } else {
            return false;
        }
    }
    // MAIN
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give me a year:");
        int year = s.nextInt();
        LeapYear testYear = new LeapYear();

        if (testYear.isLeapYear(year)) {
            System.out.println("The year " + year + " is a leap year");
        } else {
            System.out.println("The year " + year + " is not a leap year");
        }

    }
}
