import javax.swing.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login Form");

        JLabel u = new JLabel("Username:");
        u.setBounds(50, 80, 100, 30);

        JTextField tf = new JTextField();
        tf.setBounds(150, 80, 150, 30);

        JLabel p = new JLabel("Password:");
        p.setBounds(50, 130, 100, 30);

        JPasswordField pf = new JPasswordField();
        pf.setBounds(150, 130, 150, 30);

        JButton b = new JButton("Login");
        b.setBounds(120, 180, 100, 30);

        f.add(u);
        f.add(tf);
        f.add(p);
        f.add(pf);
        f.add(b);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
