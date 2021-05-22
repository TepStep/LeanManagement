package com.tepstep.menu;

import javax.swing.*;
import java.awt.*;

public class Start {
    JPanel menu = new JPanel();
    public void startowa() {

        menu.setVisible(true);
        menu.setBackground(Color.white);
        menu.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        menu.setLayout(new GridLayout(0,1));
        menu.setSize(1200,800);

        JButton button = new JButton();
        button.setBackground(Color.red);
        button.setText("Genarate Issue Raport");
        button.setSize(100,100);
        menu.add(button, BorderLayout.CENTER);



    }
    public JPanel getview1 (){
        return menu;
    }


}
