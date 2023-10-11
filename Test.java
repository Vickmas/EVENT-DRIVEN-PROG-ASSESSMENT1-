package Days;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Point;

public class Test implements ActionListener {
    private static JTextField usernameField;
    private static JPasswordField passwordField;

    public Test() {
        // Creating a JFrame
        JFrame frame = new JFrame();
        frame.setTitle("Login User Interface");
        frame.setLocation(new Point (400,200));
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating a JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Creating a JLabel for User name
        JLabel label = new JLabel("Username");
        label.setBounds(10, 10, 80, 25);
        panel.add(label);

        // Creating a JTextField for User name
        usernameField = new JTextField();
        usernameField.setBounds(100, 10, 160, 25);
        panel.add(usernameField);

        // Creating a JLabel for Password
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 40, 80, 25);
        panel.add(passwordLabel);

        // Creating a JPasswordField for Password
        passwordField = new JPasswordField();
        passwordField.setBounds(100, 40, 160, 25);
        panel.add(passwordField);

        // Creating a JButton for login
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 80, 80, 25);
        loginButton.setBackground(Color.GREEN);
        panel.add(loginButton);

        // Creating a JButton for reset
        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(190, 80, 80, 25);
        resetButton.setBackground(Color.RED); 
        panel.add(resetButton);

        loginButton.addActionListener(this);
        resetButton.addActionListener(this);

        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Login")) {
            // Handle login logic here
            String enteredUsername = usernameField.getText();
            char[] passwordChars = passwordField.getPassword();
            String enteredPassword = new String(passwordChars);

            if (authenticate(enteredUsername, enteredPassword)) {
                JOptionPane.showMessageDialog(null, "Login is Successful");
            } else {
                JOptionPane.showMessageDialog(null, "Oops Username/password is Incorrect");
            }
        } else if (e.getActionCommand().equals("Reset")) {
            // Handle reset logic here
            usernameField.setText("");
            passwordField.setText("");
        }
    }

    private boolean authenticate(String enteredUsername, String enteredPassword) {
        return enteredUsername.equals("Victor") && enteredPassword.equals("java");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Test());
    }
}
