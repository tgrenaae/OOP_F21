package session2Tommy.Excercises.Excercise10;

public class File implements FileInterface{
    String name;
    String creationDate;
    int size;

    public File(String name, String creationDate, int size) {
        this.name = name;
        this.creationDate = creationDate;
        this.size = size;
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

    @Override
    public File getNewestFile() {
        return null;
    }

    @Override
    public File getOldestFile() {
        return null;
    }
}
