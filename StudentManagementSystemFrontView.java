import javax.swing.*;
import java.awt.*;

public class StudentManagementSystemFrontView {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Create the main content panel with a vertical BoxLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Section 1: Title
        JPanel titleSection = new JPanel();
        JLabel titleLabel = new JLabel("Student Management System");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleSection.add(titleLabel);

        // Section 2: Student Information
        JPanel studentInfoSection = new JPanel(new GridLayout(2, 2));
        studentInfoSection.add(new JLabel("Name:"));
        studentInfoSection.add(new JTextField(20));
        studentInfoSection.add(new JLabel("ID:"));
        studentInfoSection.add(new JTextField(10));

        // Section 3: Buttons
        JPanel buttonSection = new JPanel();
        JButton addButton = new JButton("Add Student");
        JButton viewButton = new JButton("View Students");
        buttonSection.add(addButton);
        buttonSection.add(viewButton);

        // Add sections to the main panel
        mainPanel.add(titleSection);
        mainPanel.add(studentInfoSection);
        mainPanel.add(buttonSection);

        // Add the main panel to the frame
        frame.add(mainPanel);

        frame.setVisible(true);
    }
}

