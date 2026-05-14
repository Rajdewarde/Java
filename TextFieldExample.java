import java.awt.*;

public class TextFieldExample {
    public static void main(String[] args) {
        Frame f = new Frame("TextField Example");

        Label l = new Label("Name:");
        l.setBounds(50, 100, 50, 30);

        TextField t = new TextField();
        t.setBounds(110, 100, 150, 30);

        f.add(l);
        f.add(t);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
