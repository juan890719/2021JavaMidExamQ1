package exam1;

public class Box5 extends Box{
    public Box5() {
        length = 15;
        width = 15;
        height = 15;
    }

    @Override
    public String getName() {
        return "五號便利箱";
    }

    @Override
    public String getPrice() {
        return "80";
    }
}
