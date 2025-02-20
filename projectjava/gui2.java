import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class gui2 extends JFrame {
    
    public gui2() {
        setTitle("Background Image GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Load the background image
        final BufferedImage[] backgroundImage = {null}; // Using an array to hold the BufferedImage
        try {
            backgroundImage[0] = ImageIO.read(new File("blogo.jpg")); // Replace "background.jpg" with your image file path
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Create a custom JPanel to draw the background image
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage[0] != null) {
                    g.drawImage(backgroundImage[0], 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
        
        // Set layout to null to use absolute positioning
        panel.setLayout(null);
        
        // Set preferred size for the panel
        panel.setPreferredSize(new Dimension(800, 600));
        
        // Create an inner panel for buttons
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(null); // Set layout to null for absolute positioning
        innerPanel.setOpaque(true); // Make inner panel opaque
        innerPanel.setBackground(Color.WHITE);
        // Add buttons to the inner panel
        JButton button1 = new JButton("Button 1");
        button1.setBounds(20, 20, 150, 30); // Set bounds for button1
        
        JButton button2 = new JButton("Button 2");
        button2.setBounds(20, 60, 150, 30); // Set bounds for button2
        
        JButton button3 = new JButton("Button 3");
        button3.setBounds(20, 100, 150, 30); // Set bounds for button3
        
        JButton button4 = new JButton("Button 4");
        button4.setBounds(20, 140, 150, 30); // Set bounds for button4
        
        // Add buttons to the inner panel
        innerPanel.add(button1);
        innerPanel.add(button2);
        innerPanel.add(button3);
        innerPanel.add(button4);
        
        // Set bounds for inner panel
        innerPanel.setBounds(50, 150, 200, 200);
        
        // Add the inner panel to the main panel
        panel.add(innerPanel);
        
        // Add the panel to the frame
        getContentPane().add(panel);
        
        pack();
        setLocationRelativeTo(null); // Center the frame
        
        setVisible(true); // Make the frame visible
    }

    public static void main(String[] args) {
        new gui2(); // Create an instance of gui2
    }
}
