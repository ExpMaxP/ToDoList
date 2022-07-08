package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame {

    private TitleBar titleBar = new TitleBar();
    private ButtonPanel buttonPanel = new ButtonPanel();
    private List list = new List();

    private JButton addTask;
    private JButton clear;

    AppFrame() {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(titleBar, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.SOUTH);

        this.add(list, BorderLayout.CENTER);

        addTask = buttonPanel.getAddTask();
        clear = buttonPanel.getClear();

        addListeners();
        this.setVisible(true);
    }

    public void addListeners() {
        addTask.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {

                Task task = new Task();
                list.add(task);
                list.updateNumber();

                task.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        task.changeState();
                        revalidate();
                    }
                });
                revalidate();

            }
        });
    }
}
