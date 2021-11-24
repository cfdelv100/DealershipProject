package util;
//import util.Inventory;
import util.User;
import java.util.*;
import java.util.Scanner;

public class Menu extends User{
    public Menu(String username, boolean admin) {
        super(username, admin);
    }

    //try catch methods and does not terminate when writing the menu
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("Input 1 for Admin or 0 for User.");
        int match = first.nextInt();
        try {
           switch (match){
               case 0: logInMenu();
               break;
               case 1: AdminMenu();
               break;
               default:
                   System.out.println("***Invalid Input***\n");
                   break;
           }
        }
        catch(InputMismatchException ex){
            System.out.println("****Invalid Input****");
        }
//        Scanner a = new Scanner(System.in);
//        logInMenu();


    }

    static void logInMenu() {
        // Get inside a loop and user hits 0
        String a = "Log In Menu. Enter a number to enter next screen(Q to Quit): \n";
        String b = "If an Admin, please hit 9 for admin log in";
        Scanner in = new Scanner(System.in);
        System.out.println(a);
        System.out.println("1.Select to Filter Vehicles");
        System.out.println("2.Select to Sell Vehicle");
        System.out.println("3.Select to Enter VIN Number");
        System.out.println("4.Select to Enter User Credentials");
        System.out.println(b);
        while (true) {

            String selection = in.nextLine();
            if (!selection.equals("Q")) {

                try {
                    switch (selection) {
                        case "1":
                            filterMenu();
                            break;
                        case "2":
                            sellMenu();
                            break;
                        case "3":
                            vinMenu();
                            break;
                        case "4":
                            userMenu();
                            break;
                        default:
                            System.out.println("***Invalid Input***\n");
                            break;

                    }

                } catch (InputMismatchException ex) {
                    System.out.print("***Invalid input***\n");
                    in.nextLine();
                }
            } else {
                System.exit(0);
            }
        }
    }
        //Administration Menu
        static void AdminMenu(){
            // Get inside a loop and user hits 0
            String a = "Admin Menu. Enter a number to enter next screen(Q to Quit): \n";
            Scanner in = new Scanner(System.in);
            System.out.println(a);
            System.out.println("1.Select to Filter Vehicles");
            System.out.println("2.Select to Sell Vehicle");
            System.out.println("3.Select to Enter VIN Number");
            System.out.println("4.Activate/Deactivate Users");
            System.out.println("5.Display Users");
            while (true) {

                String selection = in.nextLine();
                if (!selection.equals("Q")) {

                    try {
                        switch (selection) {
                            case "1":
                                filterMenu();
                                break;
                            case "2":
                                sellMenu();
                                break;
                            case "3":
                                vinMenu();
                                break;
                            case "4":
                                userMenu();
                                break;
                            case "5":
                                displayMenu();
                                break;
                            default:
                                System.out.println("***Invalid Input***\n");
                                break;

                        }

                    } catch (InputMismatchException ex) {
                        System.out.print("***Invalid input***\n");
                        in.nextLine();
                    }
                } else {
                    System.exit(0);
                }
            }
        }
//
//
//    }
    static void filterMenu() {
        System.out.println("Welcome to the Filter Menu! How would you like to filter vehicles? ");
        System.out.println("1.Display All");
        System.out.println("2.Filter Attributes");
        System.out.println("Press 0 to return to the Main Menu.");
        Scanner in = new Scanner(System.in);
        int filterSelection = in.nextInt();
        try{
            switch(filterSelection) {
                case 0: logInMenu();
                case 1: // display all vehicles
                case 2: attributes(); // go into new method with attributes
                default:
                    System.out.println("***Invalid Input***\n");
                    in.nextLine();
            }
        }
        catch(InputMismatchException ex){
            System.out.println("***Invalid Input***\n");
            in.nextLine();
        }

    }
    static void attributes(){
        //method to further filter vehicles
    }

    static void sellMenu() {
        System.out.println("Welcome to the Sell Menu!");
        System.out.println("Enter \"1\" for Listings");
    }

    static void vinMenu() {
        System.out.println("Welcome to the Vin Input Screen! Please input VIN Number of Vehicle: ");
        Scanner in = new Scanner(System.in);
        int vin = in.nextInt();
        //conditional statement to compare if VIN is valid within the db,
        //else return error message, maybe a try catch block
    }

    static void userMenu() {
        System.out.println("User Menu");
        //Methods to activate and deactivate

    }
    static void displayMenu() {
        System.out.println("Display Users");
        //Methods to display users

    }


}
