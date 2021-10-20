package session2Tommy.Excercises.Excercise10;

public interface FileInterface {
    //either file or directory
    String getName();
    void setName(String name);
    void setCreationDate(String date);
    String getCreationDate();
    void setSize(int size);
    int getSize();
    File getNewestFile();
    File getOldestFile();
}
