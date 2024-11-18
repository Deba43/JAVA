package SwingAWT;

import java.awt.*;
import java.awt.event.*;

public class AWTExampleWithEventHandling {
    public static void main(String[] args) {
        
        Frame frame = new Frame("AWT Components Example");

        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);

        Label label = new Label("Enter Name:");
        label.setBounds(50, 50, 70, 30);
        frame.add(label);

        
        TextField textField = new TextField();
        textField.setBounds(150, 50, 150, 30);
        frame.add(textField);

        
        Button button = new Button("Submit");
        button.setBounds(50, 100, 80, 30);
        frame.add(button);

        
        Checkbox checkbox1 = new Checkbox("Java");
        checkbox1.setBounds(50, 150, 80, 30);
        frame.add(checkbox1);

        Checkbox checkbox2 = new Checkbox("Python");
        checkbox2.setBounds(150, 150, 80, 30);
        frame.add(checkbox2);

        
        Choice choice = new Choice();
        choice.setBounds(50, 250, 100, 30);
        choice.add("C++");
        choice.add("Java");
        choice.add("Python");
        frame.add(choice);

        
        // Event Handling

        // Button click event
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                System.out.println("Name Entered: " + name);
            }
        });

        // Choice selection event
        choice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Choice Selected: " + e.getItem());
            }
        });
    
        //Closing the window
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
