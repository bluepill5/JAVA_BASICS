import java.util.Scanner;
public class AboutMe {
    // Fields
    String name, school;
    int age;
    // Constructor
    AboutMe (String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
    // Methods
    String myName() {
        return this.name;
    }
    String mySchool() {
        return this.school;
    }
    int myAge() {
        return this.age;
    }
    // MAIN
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hello, welcome!!!);
        // Data
        System.out.println("Hi, enter your data:");
        System.out.println("Name:");
        String name = s.nextLine();
        System.out.println("Age:");
        int age = s.nextInt();
        System.out.println("School:");
        s.nextLine(); // consumimos la entrada
        String school = s.nextLine();
        
        AboutMe me = new AboutMe(name, age, school);
        
        System.out.println("My name is " + me.myName() + ", and I attend " + 
                           me.mySchool() + ". I am " + me.myAge() +  
                           " years old.");
    }
}