package exam1;

public class Box1 extends Box{
    public Box1() {
        length = 5;
        width = 10;
        height = 10;
    }

    @Override
    public String getName() {
        return "一號便利箱";
    }

    @Override
    public String getPrice() {
        return "40";
    }
}
