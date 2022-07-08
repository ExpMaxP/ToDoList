package classes;

import javax.swing.*;
import java.awt.*;

public class List extends JPanel {

    List(){
        GridLayout layout = new GridLayout(10,1);
        layout.setVgap(5);

        this.setLayout(layout);
    }
    public void updateNumber(){
        Component[] listItem = this.getComponents();

        for (int i = 0; i < listItem.length; i++) {
            ((Task)listItem[i]).changeIndex(i+1);
        }
    }
}
