package exam1;

public class Box6 extends Box{
    public Box6() {
        length = 20;
        width = 20;
        height = 20;
    }

    @Override
    public String getName() {
        return "六號便利箱";
    }

    @Override
    public String getPrice() {
        return "90";
    }
}
