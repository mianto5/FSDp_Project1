package FSDp_Project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileDatabase {

    private List<Files> files = new ArrayList<Files>();

    public FileDatabase() {
    }

    public void displayFiles(){
        if(files.isEmpty())
            System.out.println("No files added yet, the database is empty");
        else{
            Collections.sort(files);
            for (Files f: files) {
                System.out.println(f.getfName());
            }
        }
    }
    public String addFile(Files file){
        for (Files f: files) {
            if (f.getfName().equals(file.getfName()))
                return "File \""+file.getfName()+"\" already exists, file not added";
        }
        files.add(file);
        return "File \""+file.getfName()+"\" added.";
    }
    public String deleteFile(String fName){
        for (Files f: files) {
            if (f.getfName().equals(fName)){
                files.remove(f);
                return "File \""+fName+"\" deleted";
            }
        }
        return "File \""+fName+"\" not found, cannot be deleted";
    }
    public String searchFile(String fName){
        for (Files f: files) {
            if (f.getfName().equals(fName))
                return "File \""+fName+"\" found in the database";
        }
        return "File \""+fName+"\" not found";
    }
    public boolean onlyWhiteSpaces(String fName){
        if(fName.trim().isEmpty()) {
            System.out.println("The file name cannot contain only whitespaces!");
            return true;
        }
        else
            return false;
    }

}
