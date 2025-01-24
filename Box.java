import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Define the Box class
class Box {
    private double width;
    private double height;
    private double depth;

    // Parameterized Constructor to initialize dimensions
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate the volume of the box
    public double calculateVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Box[width=" + width + ", height=" + height + ", depth=" + depth + "]";
    }
}

// Main class with GUI to test the Box functionalities
public class Main {

    public static void main(String[] args) {
        // Create the frame for the application
        JFrame frame = new JFrame("Box Volume Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        // Define labels and text fields for Box dimensions
        JLabel lblWidth = new JLabel("Width:");
        JTextField txtWidth = new JTextField();

        JLabel lblHeight = new JLabel("Height:");
        JTextField txtHeight = new JTextField();

        JLabel lblDepth = new JLabel("Depth:");
        JTextField txtDepth = new JTextField();

        JButton btnCalculate = new JButton("Calculate Volume");

        // Label to display results
        JLabel lblResult = new JLabel("Volume: ");

        // Add components to the panel
        panel.add(lblWidth);
        panel.add(txtWidth);
        panel.add(lblHeight);
        panel.add(txtHeight);
        panel.add(lblDepth);
        panel.add(txtDepth);
        panel.add(new JLabel());  // Empty cell to align the button
        panel.add(btnCalculate);
        panel.add(lblResult);

        // Add the panel to the frame
        frame.add(panel);

        // Action listener for the calculate button
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Collect data from the text fields
                    double width = Double.parseDouble(txtWidth.getText());
                    double height = Double.parseDouble(txtHeight.getText());
                    double depth = Double.parseDouble(txtDepth.getText());

                    // Create a Box object and calculate volume
                    Box myBox = new Box(width, height, depth);
                    double volume = myBox.calculateVolume();

                    // Display the result
                    lblResult.setText("Volume: " + volume);
                } catch (NumberFormatException ex) {
                    // Handle invalid input
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers for width, height, and depth.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Set the frame visibility
        frame.setVisible(true);
    }
}