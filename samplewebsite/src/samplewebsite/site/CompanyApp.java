package samplewebsite.site;

import java.util.*;

public class CompanyApp {
    public static void main(String[] args) {

        List<Company> list = new ArrayList<>();

        // Sample Data
        list.add(new Company(101, "TCS", "Java", "Backend", "9876543210", "Hyderabad"));
        list.add(new Company(102, "Infosys", "Python", "AI", "9123456780", "Bangalore"));
        list.add(new Company(103, "Wipro", "Java", "FullStack", "9988776655", "Hyderabad"));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Search by Code");
            System.out.println("2. Search by Location");
            System.out.println("3. Search by Requirements");
            System.out.println("4. Display All");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter code: ");
                    int code = sc.nextInt();

                    for (Company c : list) {
                        if (c.getCode() == code) {
                            c.display();
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter location: ");
                    String loc = sc.next();

                    for (Company c : list) {
                        if (c.getLocation().equalsIgnoreCase(loc)) {
                            c.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter requirement: ");
                    String req = sc.next();

                    for (Company c : list) {
                        if (c.getRequirements().equalsIgnoreCase(req)) {
                            c.display();
                        }
                    }
                    break;

                case 4:
                    for (Company c : list) {
                        c.display();
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}