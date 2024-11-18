package SwingAWT;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

class SwingApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);

        JButton button = new JButton("Submit");
        button.setBounds(150, 200, 220, 50);
        frame.add(button);

        String[] columnNames = { "id", "Name" };

        String[][] data = { { "1", "Debadatta" }, { "2", "Tushar" } };

        JTable table = new JTable(data, columnNames);

        // Put the table inside a scroll pane
        JScrollPane s = new JScrollPane(table);
        s.setBounds(50, 60, 300, 100); // Set bounds for the scroll pane
        frame.add(s);

        // Event Handling
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                System.out.println("Button Clicked!");
            }
        }); 

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
