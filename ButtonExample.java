import java.awt.*;

public class ButtonExample {
    public static void main(String[] args) {
        Frame f = new Frame("Button Example");

        Button b = new Button("Click Me");
        b.setBounds(100, 100, 80, 30);

        f.add(b);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
