import java.util.Scanner;
public class Associative {
    // Class variables
    int x;
    int y;
    int z;
    // Constructor
    Associative(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    // Methods
    double firstTwo() {
        return (this.x + this.y) * this.z;
    }
    double lastTwo() {
        return this.x + (this.y * this.z);
    }
    // MAIN
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y, z;
        
        System.out.println("First number:");
        x = s.nextInt();
        System.out.println("Second number:");
        y = s.nextInt();
        System.out.println("Third number:");
        z = s.nextInt();
        
        Associative a = new Associative(x, y, z);
        
        System.out.println("Grouping the first two terms, (" + 
                           x + " + " + y + ") * " + z + 
                           " = " + (int) a.firstTwo());
        System.out.println("Grouping the last two terms, " + 
                           x + " + (" + y + " * " + z + 
                           ") = " + (int) a.lastTwo());
        
    }
}
