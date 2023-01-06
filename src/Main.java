import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a numbers:");
        int a = in.nextInt();
        int b = in.nextInt();

        JFrame frame = new JFrame("OvalPaint with Gradient");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Oval panel = new Oval();
        frame.add(panel);
        frame.setSize(a, b);
        frame.setVisible(true);
    }
}
