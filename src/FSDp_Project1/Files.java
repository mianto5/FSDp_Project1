package FSDp_Project1;

public class Files implements Comparable<Files>{

    private String fName;

    public Files(String fName) {
        this.fName = fName;
    }

    public String getfName() {
        return fName;
    }

    @Override
    public String toString() {
        return fName;
    }

    @Override
    public int compareTo(Files file) {
        return getfName().toLowerCase().compareTo(file.getfName().toLowerCase());
    }

}
