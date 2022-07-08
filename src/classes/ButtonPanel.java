package classes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class ButtonPanel extends JButton {

    private JButton addTask = new JButton("Add Task");
    private JButton clear   = new JButton("Clear task");

    Border emptyBorder = BorderFactory.createEmptyBorder();

    ButtonPanel(){
        this.setPreferredSize(new Dimension(400,40));
        this.setLayout(new GridBagLayout());

        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif",Font.PLAIN,20));
        this.add(addTask);

        this.add(Box.createHorizontalStrut(20));

        clear.setBorder(emptyBorder);
        clear.setFont(new Font("Sans-serif",Font.PLAIN,20));
        this.add(clear);
    }

    public JButton getAddTask(){
        return addTask;
    }

    public JButton getClear(){
        return clear;
    }
}
