//LoginFrame.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
    Container container = getContentPane();
    JLabel userLabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JButton signupButton = new JButton("Sign Up");
    JCheckBox showPassword = new JCheckBox("Show Password");

    LoginFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login");
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void setLayoutManager() {
        container.setLayout(new GridBagLayout());
    }

    public void setLocationAndSize() {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
    
        constraints.gridx = 0;
        constraints.gridy = 0;
        container.add(userLabel, constraints);
    
        constraints.gridx = 1;
        userTextField.setPreferredSize(new Dimension(200, 30)); 
        container.add(userTextField, constraints);
    
        constraints.gridx = 0;
        constraints.gridy = 1;
        container.add(passwordLabel, constraints);
    
        constraints.gridx = 1;
        passwordField.setPreferredSize(new Dimension(200, 30)); 
        container.add(passwordField, constraints);
    
        constraints.gridx = 1;
        constraints.gridy = 2;
        container.add(showPassword, constraints);
    
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        container.add(loginButton, constraints);
    
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        container.add(resetButton, constraints);
    
        constraints.gridx = 1;
        constraints.gridy = 4;
        container.add(signupButton, constraints);
    }
    
    
    public void addComponentsToContainer() {
        Font font = new Font("Arial", Font.PLAIN, 14);
        userLabel.setFont(font);
        passwordLabel.setFont(font);
        userTextField.setFont(font);
        passwordField.setFont(font);
        showPassword.setFont(font);
        loginButton.setFont(font);
        resetButton.setFont(font);
        signupButton.setFont(font);
        
        userTextField.setPreferredSize(new Dimension(200, 30));
        passwordField.setPreferredSize(new Dimension(200, 30));
        loginButton.setPreferredSize(new Dimension(100, 30));
        resetButton.setPreferredSize(new Dimension(100, 30));
        signupButton.setPreferredSize(new Dimension(100, 30));
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
        signupButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userText = userTextField.getText();
        char[] pwdChars = passwordField.getPassword();
        String pwdText = new String(pwdChars);

            if (userText.equalsIgnoreCase("kowshik") && pwdText.equals("5199")) {
                     new NewCconverter();
                      dispose();
                }                
             else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
            passwordField.setText("");
        }
        

        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }

        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        }

        if (e.getSource() == signupButton) {
            
                new loginafter();
            
            }
        }
    }
    class Main {
        public static void main(String[] args) {
            
            SwingUtilities.invokeLater(() -> {
        
                LoginFrame loginFrame = new LoginFrame();
                loginFrame.setVisible(true);
            });
        }
    }
