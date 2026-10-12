
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== OOP CONCEPTS MENU =====");
            System.out.println("1. Class");
            System.out.println("2. Object");
            System.out.println("3. Inheritance");
            System.out.println("4. Abstraction");
            System.out.println("5. Generalization");
            System.out.println("6. Encapsulation");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next();
                System.out.print("Enter your choice: ");
            }

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- CLASS ---");
                    Tourist tourist = new Tourist();
                    tourist.name = "Diya";
                    tourist.destination = "Goa";
                    tourist.display();
                    break;

                case 2:
                    System.out.println("\n--- OBJECT ---");
                    Farm farm = new Farm();
                    farm.crop = "Rice";
                    farm.acres = 5;
                    farm.display();
                    break;

                case 3:
                    System.out.println("\n--- INHERITANCE ---");
                    TouristGuide guide = new TouristGuide();
                    guide.visit();
                    guide.guide();
                    break;

                case 4:
                    System.out.println("\n--- ABSTRACTION ---");
                    RiceFarming rice = new RiceFarming();
                    rice.growCrop();
                    break;

                case 5:
                    System.out.println("\n--- GENERALIZATION ---");
                    Beach beach = new Beach();
                    HillStation hill = new HillStation();

                    beach.visit();
                    beach.activity();

                    hill.visit();
                    hill.activity();
                    break;

                case 6:
                    System.out.println("\n--- ENCAPSULATION ---");
                    Farm2 farm2 = new Farm2();
                    farm2.setDetails("Wheat", 500);
                    farm2.display();
                    break;

                case 7:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1-7.");
            }

        } while (choice != 7);

        sc.close();
    }
}
