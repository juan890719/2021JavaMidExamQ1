package exam1;

public class Box2 extends Box{
    public Box2() {
        length =10;
        width = 10;
        height = 10;
    }

    @Override
    public String getName() {
        return "二號便利箱";
    }

    @Override
    public String getPrice() {
        return "50";
    }
}
