package com.tepstep;


import com.tepstep.menu.Start;

import javax.swing.*;
import java.awt.*;

public class Window {
    public void start(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Lean Management");

        frame.setBackground(Color.white);
        frame.setSize(1200,800);

        Start menu = new Start();
        menu.startowa();
        panel.add(menu.getview1());


        frame.setVisible(true);

    }
}
