package FSDp_Project1;

import java.util.ArrayList;
import java.util.List;

public class FileDatabase {

    private List<Files> files = new ArrayList<Files>();

    public FileDatabase() {
    }

    public void displayFiles(){
        System.out.println("Display Files");
    }
    public void addFile(){
        System.out.println("Add File");
    }
    public void deleteFile(){
        System.out.println("Delete File");
    }
    public void searchFile(){
        System.out.println("Search File");
    }

}
