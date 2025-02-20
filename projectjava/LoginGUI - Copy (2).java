import mod2.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class LoginGUI extends JFrame {
    private JTextField authorityIdField;
    private JPasswordField passwordField;

    public LoginGUI() {
        setTitle("Authority Login");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Panel for holding components
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(213, 236, 242)); // Light blue-green color
        mainPanel.setLayout(null);
        add(mainPanel);

        // Add image
        try {
            BufferedImage image = ImageIO.read(new File("logo1.png"));
            int scaledWidth = 400; // Adjust as needed
            int scaledHeight = 100; // Adjust as needed
            Image scaledImage = image.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);
            JLabel imageLabel = new JLabel(scaledIcon);
            imageLabel.setBounds(200, 20, scaledWidth, scaledHeight);
            mainPanel.add(imageLabel);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Text "Enter Authority Login Details"
        JLabel enterDetailsLabel = new JLabel("Enter Authority Login Details");
        enterDetailsLabel.setFont(new Font("Arial", Font.BOLD, 25));
        enterDetailsLabel.setBounds(20, 20, 350, 30); // Adjusted position and size
        //mainPanel.add(enterDetailsLabel);

        // Panel for login components
        JPanel loginPanel = new JPanel();
        loginPanel.setBounds(200, 150, 400, 250);
        loginPanel.setBackground(new Color(255, 255, 255)); // White color
        loginPanel.setLayout(null); // Absolute positioning
        loginPanel.setBorder(BorderFactory.createLineBorder(new Color(165, 207, 194), 10)); // Light blue-green border
        mainPanel.add(loginPanel);

        loginPanel.add(enterDetailsLabel);

        // Authority ID label and field
        JLabel authorityIdLabel = new JLabel("Authority ID:");
        authorityIdLabel.setBounds(20, 70, 100, 30);
        loginPanel.add(authorityIdLabel);

        authorityIdField = new JTextField();
        authorityIdField.setBounds(130, 70, 250, 30);
        loginPanel.add(authorityIdField);

        // Password label and field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 120, 100, 30);
        loginPanel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(130, 120, 250, 30);
        loginPanel.add(passwordField);

        // Login button with slightly curved corners
        JButton loginButton = new JButton("Login");
        loginButton.setFocusPainted(false);
        loginButton.setContentAreaFilled(false);
        loginButton.setOpaque(true);
        loginButton.setBackground(new Color(0, 153, 153)); // Dark green-blue color
        loginButton.setForeground(Color.WHITE); // White text color
        loginButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // Add padding
        loginButton.setBorder(BorderFactory.createLineBorder(new Color(0, 153, 153), 5)); // Border with same color for curved effect
        int buttonWidth = loginPanel.getWidth() - 40; // Width of the panel minus padding
        loginButton.setBounds(20, 170, buttonWidth, 30); // Align to the left edge
        loginPanel.add(loginButton);
      //  gui2 g = new gui2();


        // Add ActionListener to login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String authorityId = authorityIdField.getText();
                String password = new String(passwordField.getPassword());
                // Simulate login process (replace with actual authentication logic)
                if (authorityId.equals("admin") && password.equals("password")) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                    // Show the second panel
                    new gui2();
                    
                    // Hide the login panel
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Authority ID or password");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginGUI();
        
    
    }
}
