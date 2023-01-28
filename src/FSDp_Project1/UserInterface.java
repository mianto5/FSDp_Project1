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

        Scanner sc = new Scanner(System.in);

        FileDatabase database = new FileDatabase();
        boolean mainExit, modifyExit;

        while (true){
            mainExit = false;
            displayMainMenu();
            int mainChoice = sc.nextInt();
            switch (mainChoice){
                case 1:
                    database.displayFiles();
                    break;
                case 2:
                    while (true){
                        modifyExit = false;
                        displayModifyMenu();
                        int modifyChoice = sc.nextInt();
                        switch (modifyChoice) {
                            case 1:
                                database.addFile();
                                break;
                            case 2:
                                database.deleteFile();
                                break;
                            case 3:
                                database.searchFile();
                                break;
                            case 4:
                                modifyExit = true;
                                break;
                        }
                        if(modifyExit)
                            break;
                    }
                    break;
                case 3:
                    mainExit = true;
                    break;
            }
            if(mainExit)
                break;
        }
        System.out.println("\nProgram has ended. Good Bye!");
    }
}
