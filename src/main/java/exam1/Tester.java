package exam1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box1 box1 = new Box1();
        Box2 box2 = new Box2();
        Box3 box3 = new Box3();
        Box4 box4 = new Box4();
        Box5 box5 = new Box5();
        Box6 box6 = new Box6();
        System.out.println("Please enter object\'s LENGTH :");
        int length = scanner.nextInt();
        System.out.println("Please enter object\'s WIDTH :");
        int width = scanner.nextInt();
        System.out.println("Please enter object\'s HEIGHT :");
        int height = scanner.nextInt();
        if (box1.v(length, width, height)) {
            System.out.println(box1.getName() + ", " + box1.getPrice());
        } else if (box2.v(length, width, height)) {
            System.out.println(box2.getName() + ", " + box2.getPrice());
        } else if (box3.v(length, width, height)) {
            System.out.println(box3.getName() + ", " + box3.getPrice());
        } else if (box4.v(length, width, height)) {
            System.out.println(box4.getName() + ", " + box4.getPrice());
        } else if (box5.v(length, width, height)) {
            System.out.println(box5.getName() + ", " + box5.getPrice());
        } else if (box6.v(length, width, height)) {
            System.out.println(box6.getName() + ", " + box6.getPrice());
        } else {
            System.out.println("None !");
        }
    }
}
