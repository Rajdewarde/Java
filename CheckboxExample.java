import java.awt.*;

public class CheckboxExample {
    public static void main(String[] args) {
        Frame f = new Frame("Checkbox Example");

        Checkbox c1 = new Checkbox("Java");
        c1.setBounds(100, 100, 100, 30);

        Checkbox c2 = new Checkbox("Python");
        c2.setBounds(100, 140, 100, 30);

        f.add(c1);
        f.add(c2);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
