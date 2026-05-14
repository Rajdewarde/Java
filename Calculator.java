import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");

        JTextField t1 = new JTextField();
        t1.setBounds(50, 50, 150, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(50, 90, 150, 30);

        JButton b = new JButton("Add");
        b.setBounds(50, 130, 80, 30);

        JLabel result = new JLabel("Result");
        result.setBounds(50, 170, 200, 30);

        b.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b1 = Integer.parseInt(t2.getText());
            result.setText("Result: " + (a + b1));
        });

        f.add(t1);
        f.add(t2);
        f.add(b);
        f.add(result);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
