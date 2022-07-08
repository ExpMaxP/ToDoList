package classes;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {

    private JLabel index = new JLabel("");
    private JTextField taskName = new JFormattedTextField("Task");
    private JButton done = new JButton("Done");
    private boolean checked = false;

    Task(){
        this.setPreferredSize(new Dimension(40,20));
        this.setLayout(new BorderLayout());
        this.setBackground(Color.ORANGE);

        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index, BorderLayout.WEST);

        taskName.setBorder(BorderFactory.createEmptyBorder());
        this.add(taskName, BorderLayout.CENTER);

        done.setPreferredSize(new Dimension(40,20));
        done.setBorder(BorderFactory.createEmptyBorder());
        this.add(done,BorderLayout.EAST);
    }

    public JButton getDone(){
        return done;
    }

    public void changeIndex(int number){
        this.index.setText(number+"");
        this.revalidate();
    }

    public void changeState(){
        this.setBackground(Color.green);
        taskName.setBackground(Color.green);
        checked = true;
    }
}
