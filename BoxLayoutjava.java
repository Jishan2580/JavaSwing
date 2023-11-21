import javax.swing.*;

public class BoxLayoutjava extends JFrame {

    BoxLayoutjava() {
        this.setVisible(true);
        this.setBounds(30, 30, 1000, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create a vertical panel
        JPanel vertical = new JPanel();
        vertical.setLayout(new BoxLayout(vertical, BoxLayout.Y_AXIS));

        // Add buttons to the vertical panel
        vertical.add(new JButton("Button 1"));
        vertical.add(new JButton("Button 2"));
        vertical.add(new JButton("Button 3"));

        // Create another vertical panel
        JPanel vertical1 = new JPanel();
        vertical1.setLayout(new BoxLayout(vertical1, BoxLayout.Y_AXIS));

        // Add buttons to the second vertical panel
        vertical1.add(new JButton("Button 4"));
        vertical1.add(new JButton("Button 5"));
        vertical1.add(new JButton("Button 6"));

        // Add the vertical panels to the frame
        this.add(vertical);
        this.add(vertical1);

        // Pack the frame
        this.pack();
    }

    public static void main(String[] args) {
        new BoxLayoutjava();
    }
}
