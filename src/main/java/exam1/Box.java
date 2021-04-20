package exam1;

public abstract class Box {
    int length;
    int width;
    int height;
    public boolean v (int a, int b, int c) {
        return (length >= a && width >= b && height >= c);
    }
    public abstract String getName();
    public abstract String getPrice();
}
