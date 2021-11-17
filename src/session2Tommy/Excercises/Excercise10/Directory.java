package session2Tommy.Excercises.Excercise10;

public class Directory implements FileInterface{
    String name;
    String creationDate;
    int size;
    Directory[] directories;
    File[] files;

    public Directory(String name, String creationDate, int size, Directory[] directories, File[] files) {
        this.name = name;
        this.creationDate = creationDate;
        this.size = size;
        this.directories = directories;
        this.files = files;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setCreationDate(String date) {
        this.creationDate = date;
    }

    @Override
    public String getCreationDate() {
        return this.creationDate;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    public File getNewestFile() {
        return files[files.length -1];
    }

    @Override
    public File getOldestFile() {
        return files[0];
    }
}
