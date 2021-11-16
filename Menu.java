//import util.Inventory;

import java.util.*;
import java.util.Scanner;

public class Menu {
    //try catch methods and does not terminate when writing the menu
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        logInMenu();

    }

    static void logInMenu() {
        // Get inside a loop and user hits 0
        String a = "Log In Menu. Enter a number to enter next screen(Q to Quit): \n";
        Scanner in = new Scanner(System.in);
        System.out.println(a);
        System.out.println("1.Select to Filter Vehicles");
        System.out.println("2.Select to Sell Vehicle");
        System.out.println("3.Select to Enter VIN Number");
        System.out.println("4.Select to Enter User Credentials");
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

    //    static void mainMenu(){
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

    }

}
