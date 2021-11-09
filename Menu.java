//import util.Inventory;
import java.util.*;
import java.util.Scanner;
public class Menu{
    //try catch methods and does not terminate when writing the menu
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        logInMenu();

    }
    static void logInMenu(){
        // Get inside a loop and user hits 0
        while(true){
            String a = "Log In Menu. Enter a number to enter next screen(Q to Quit): ";
            Scanner in = new Scanner(System.in);
            System.out.println(a);
            String selection = in.nextLine();
            if (!selection.equals("Q")) {
                System.out.println("1.Select to Filter Vehicles");
                System.out.println("2.Select to Sell Vehicle");
                System.out.println("3.Select to Enter VIN Number");
                System.out.println("4.Select to Enter User Credentials");
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

                    }

                    }
                catch(InputMismatchException ex){
                    System.out.print("***Invalid input***\n");
                    in.nextLine();
                }
            }
            else {
                System.exit(0);
            }
        }
        }
//    static void mainMenu(){
//
//
//    }
    static void filterMenu(){
        System.out.println("Welcome to the Filter Menu! How would you like to filter vehicles? ");

    }
    static void sellMenu(){
        System.out.println("Welcome to the Sell Menu!");
    }
    static void vinMenu(){
        System.out.println("Welcome to the Vin Input Screen! Please input VIN Number of Vehicle: ");

    }
    static void userMenu(){
        System.out.println("User Menu");

    }

}
