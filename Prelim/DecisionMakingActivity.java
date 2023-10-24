import java.util.Scanner;

public class DecisionMakingActivity {

   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

    System.out.println("");
    System.out.print("Route to MoalBoal\n");
    System.out.println("");
    System.out.print("Is route A obstructured? (Y = 1 || N = 0): ");
       int isRoutedDestructed = scanner.nextInt();
  
     if (isRoutedDestructed == 0) {     
        System.out.println("Starting from Cebu City...");
        System.out.println("Choose your route:");
        System.out.println("Route 1: Mingla");
        System.out.println("Route 2: San Fernando");
        System.out.println("Route 3: Carcar");
        System.out.println("Route 4.1: Barili");
        System.out.println("Route 4.1.1: Dumanjug");
        System.out.println("Route 4.1.2: Alcantara");
        System.out.println("Moalboal");
      } else {
         System.out.println("Proceed to Route 2"); }
            int shortcutChoice = scanner.nextInt();

            if (shortcutChoice == 1) {
                System.out.println("Your route is: Cebu City -> Carcar -> Sibonga -> Dumanjug -> Alcantara -> Moalboal");
            } else if (shortcutChoice == 2) {
                System.out.println("Your route is: Cebu City -> Carcar -> Sibonga -> Argao -> Ronda -> Alcantara -> Moalboal");
            } else {
                System.out.println("Invalid option!");

              }
    }
}