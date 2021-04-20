package exam1;

public class Box3 extends Box{
    public Box3() {
        length = 15;
        width = 10;
        height = 10;
    }

    @Override
    public String getName() {
        return "三號便利箱";
    }

    @Override
    public String getPrice() {
        return "60";
    }
}
