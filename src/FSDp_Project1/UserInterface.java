package FSDp_Project1;

import java.util.Scanner;

public class UserInterface {
    public static void displayMainMenu(){
        System.out.println("\nMAIN MENU: Please select one of these options");
        System.out.println("1\tDisplay all files");
        System.out.println("2\tModify files");
        System.out.println("3\tQuit the program");
    }
    public static void displayModifyMenu(){
        System.out.println("\nPlease choose your next step");
        System.out.println("\t1\tAdd a new file");
        System.out.println("\t2\tDelete an existing file");
        System.out.println("\t3\tSearch an existing file");
        System.out.println("\t4\tGo back to the main menu");
    }
    public static void main(String[] args) {
        System.out.println("WELCOME at LockedMe.com");
        System.out.println("(developed by Michaela Tomanova)\n");

        FileDatabase database = new FileDatabase();
        boolean mainExit, modifyExit;
        String fName, msg;
        int choice;

        while (true){
            mainExit = false;
            Scanner sc = new Scanner(System.in);
            displayMainMenu();
            try {
                choice = sc.nextInt();
            }catch (Exception e) {
                choice = 0;
            }
            switch (choice){
                case 1:
                    database.displayFiles();
                    break;
                case 2:
                    while (true){
                        modifyExit = false;
                        sc = new Scanner(System.in).useDelimiter("\n");
                        displayModifyMenu();
                        try {
                            choice = sc.nextInt();
                        }catch (Exception e) {
                            choice = 0;
                        }
                        switch (choice) {
                            case 1:
                                System.out.println("Enter file name to add:");
                                fName = sc.next();
                                if(database.onlyWhiteSpaces(fName))
                                    break;
                                Files f = new Files(fName);
                                msg = database.addFile(f);
                                System.out.println(msg);
                                break;
                            case 2:
                                System.out.println("Enter file name to delete:");
                                fName = sc.next();
                                if(database.onlyWhiteSpaces(fName))
                                    break;
                                msg = database.deleteFile(fName);
                                System.out.println(msg);
                                break;
                            case 3:
                                System.out.println("Enter file name to search:");
                                fName = sc.next();
                                if(database.onlyWhiteSpaces(fName))
                                    break;
                                msg = database.searchFile(fName);
                                System.out.println(msg);
                                break;
                            case 4:
                                modifyExit = true;
                                break;
                            default:
                                System.out.println("Invalid input -> select 1, 2, 3 or 4");
                        }
                        if(modifyExit)
                            break;
                    }
                    break;
                case 3:
                    mainExit = true;
                    break;
                default:
                    System.out.println("Invalid input -> select 1, 2 or 3");
            }
            if(mainExit)
                break;
        }
        System.out.println("\nProgram has ended. Good Bye!");
    }
}
