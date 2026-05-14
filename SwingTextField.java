import javax.swing.*;

public class SwingTextField {
    public static void main(String[] args) {
        JFrame f = new JFrame("TextField");

        JLabel l = new JLabel("Name:");
        l.setBounds(50, 100, 100, 30);

        JTextField t = new JTextField();
        t.setBounds(120, 100, 150, 30);

        f.add(l);
        f.add(t);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
