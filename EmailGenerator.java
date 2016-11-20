import java.util.Scanner;
public class EmailGenerator {
    // CONSTRUCTOR
    // METHODS
    String makeUserName(String name, String last) {
        /**
         *  The method combine the first letter of the first String and
         *  combine it with the full second String, returning the final
         *  String in all lowercase characters.
         *  @param name: first string
         *  @param last: second string
         *  @return a string
         */
         int userLength = 7;
         int nLast = last.length();
         int nName = name.length();
         if (nLast >= 7) {
             last = last.substring(0, 7);
         } else if (nName > 1) {
             if ((userLength - nLast) < (nName - 1)) {
                 last = name.substring(1, 1 + userLength - nLast) + last;
             } else {
                 last = name.substring(1) + last;
             }

         }
         return (name.substring(0, 1) + last).toLowerCase();
    }

    String makeEmail(String email, String domain) {
        /**
         *  The method take two String arguments and will return a String.
         *  This method should combine the first string, a @ symbol,
         *  and the second String
         *  @param email: first string
         *  @param domain: second string
         *  @return a string
         */
         return email + "@" + domain;
    }
    // MAIN
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("First name:");
        String fName = s.next();
        System.out.println("Last name:");
        String lName = s.next();

        EmailGenerator email = new EmailGenerator();

        System.out.println("This user's e-mail is: " +
            email.makeEmail(email.makeUserName(fName, lName), "purdue.edu"));
    }
}
