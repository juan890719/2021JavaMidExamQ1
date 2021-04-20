package exam1;

public class Box4 extends Box{
    public Box4() {
        length = 15;
        width = 15;
        height = 10;
    }

    @Override
    public String getName() {
        return "四號便利箱";
    }

    @Override
    public String getPrice() {
        return "70";
    }
}
