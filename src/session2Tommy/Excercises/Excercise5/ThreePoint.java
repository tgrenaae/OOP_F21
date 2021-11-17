package session2Tommy.Excercises.Excercise5;

public class ThreePoint extends TwoPoint{
    protected int z;

    public ThreePoint(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
