import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentInfo extends JFrame {
    // create a frame
    private JFrame frame;

    // create textfields
    private JTextField nameField;
    private JTextField rollNoField;

    // create labels
    private JLabel nameLabel;
    private JLabel rollNoLabel;

    // create button
    private JButton submitButton;

    // default constructor
    StudentInfo() {
        // create a frame
        frame = new JFrame("Student Information");

        // create textfields
        nameField = new JTextField(16);
        rollNoField = new JTextField(16);

        // create labels
        nameLabel = new JLabel("Name: ");
        rollNoLabel = new JLabel("Roll No: ");

        // create button
        submitButton = new JButton("Submit");

        // create a panel
        JPanel panel = new JPanel(new GridLayout(3, 2));

        // add elements to panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(rollNoLabel);
        panel.add(rollNoField);
        panel.add(submitButton);

        // add action listener to button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameLabel.setText("Name: " + nameField.getText());
                rollNoLabel.setText("Roll No: " + rollNoField.getText());
            }
        });

        // add panel to frame
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }

    // main function
    public static void main(String args[]) {
        new StudentInfo();
    }
}