package classes;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;

public class TitleBar extends JPanel {

    TitleBar(){
        this.setPreferredSize(new Dimension(400,50));

        JLabel titleText = new JLabel("TO DO LIST ");
        titleText.setPreferredSize(new Dimension(200,20));
        titleText.setFont(new Font("Sans-serif",Font.BOLD,20));
        titleText.setHorizontalAlignment(JLabel.CENTER );
        this.add(titleText);

    }
}
