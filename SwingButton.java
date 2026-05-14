import javax.swing.*;

public class SwingButton {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example");

        JButton b = new JButton("Click");
        b.setBounds(100, 100, 100, 40);

        f.add(b);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
