import javax.swing.*;
import java.awt.*;

public class gui2 extends JPanel {
    public gui2() {
        // Set panel size
        setPreferredSize(new Dimension(800, 600));
        // Set panel background color
        setBackground(new Color(213, 236, 242));

        // Create a new panel
        JPanel innerPanel = new JPanel();
        innerPanel.setPreferredSize(new Dimension(400, 300)); // Set inner panel size

        // Set gradient background for innerPanel
        innerPanel.setBackground(new Color(173, 216, 230)); // Shade of violet
        innerPanel.setLayout(null); // Use absolute positioning

        // Add border to innerPanel
        innerPanel.setBorder(BorderFactory.createLineBorder(new Color(165, 207, 194), 10));

        // Add buttons to innerPanel
        JButton button1 = new JButton("Search Person Details");
        JButton button2 = new JButton("Update Person Details");
        JButton button3 = new JButton("Add Person");
        JButton button4 = new JButton("Delete Person");

        // Set text color and background color for buttons
        button1.setForeground(Color.WHITE);
        button1.setBackground(new Color(0, 153, 153));
        button2.setForeground(Color.WHITE);
        button2.setBackground(new Color(0, 153, 153));
        button3.setForeground(Color.WHITE);
        button3.setBackground(new Color(0, 153, 153));
        button4.setForeground(Color.WHITE);
        button4.setBackground(new Color(0, 153, 153));

        // Set preferred size for buttons
        Dimension buttonSize = new Dimension(300, 50);
        button1.setSize(buttonSize);
        button2.setSize(buttonSize);
        button3.setSize(buttonSize);
        button4.setSize(buttonSize);

        // Set positions for buttons
        button1.setLocation(50, 20);
        button2.setLocation(50, 90);
        button3.setLocation(50, 160);
        button4.setLocation(50, 230);

        innerPanel.add(button1);
        innerPanel.add(button2);
        innerPanel.add(button3);
        innerPanel.add(button4);

        // Calculate position to center innerPanel
        int x = (getWidth() - innerPanel.getWidth()) / 2;
        int y = (getHeight() - innerPanel.getHeight()) / 2;
        innerPanel.setBounds(x, y, innerPanel.getWidth(), innerPanel.getHeight());

        add(innerPanel); // Add inner panel to gui2
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Reposition innerPanel if the size of gui2 changes
        Component[] components = getComponents();
        for (Component component : components) {
            if (component instanceof JPanel) {
                JPanel innerPanel = (JPanel) component;
                int x = (getWidth() - innerPanel.getWidth()) / 2;
                int y = (getHeight() - innerPanel.getHeight()) / 2;
                innerPanel.setLocation(x, y);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Main Panel Test");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new gui2());
                frame.pack();
                frame.setLocationRelativeTo(null); // Center the window
                frame.setVisible(true);
            }
        });
    }
}
