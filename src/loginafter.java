//loginafter.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class loginafter extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JTextField emailField;
    public loginafter() {
    super("Signup Window");
    setLayout(new BorderLayout());
    JLabel usernameLabel = new JLabel("Username:");
    JLabel passwordLabel = new JLabel("Password:");
    JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
    JLabel emailLabel = new JLabel("Email:");
    usernameField = new JTextField(20);
    passwordField = new JPasswordField(20);
    confirmPasswordField = new JPasswordField(20);
    emailField = new JTextField(20);
    JButton signinButton = new JButton("Signin");
    signinButton.addActionListener(this);
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(5, 2));
    panel.add(usernameLabel);
    panel.add(usernameField);
    panel.add(passwordLabel);
    panel.add(passwordField);
    panel.add(confirmPasswordLabel);
    panel.add(confirmPasswordField);
    panel.add(emailLabel);
    panel.add(emailField);
    panel.add(new JLabel());
    panel.add(signinButton);
    add(panel, BorderLayout.CENTER);
    setSize(300, 200);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
    String username = usernameField.getText();
    String password = new String(passwordField.getPassword());
    String confirmPassword = new
    String(confirmPasswordField.getPassword());
    String email = emailField.getText();
    if (username.isEmpty()||password.isEmpty() || confirmPassword.isEmpty()
    || email.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please fill in all the fields");
    return;
    }
    if (!password.equals(confirmPassword)) {
    JOptionPane.showMessageDialog(this, "Passwords do not match");
    return;
    }
    
    new NewCconverter();;
    
    }
    }