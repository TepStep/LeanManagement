package com.tepstep.ishikawa;

import javax.swing.*;
import java.awt.*;

public class Ishikawa {
    JPanel ishikawa = new JPanel();
    public void startowa() {

        ishikawa.setVisible(true);
        ishikawa.setBackground(Color.white);
        ishikawa.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        ishikawa.setLayout(new GridLayout(0,1));
        ishikawa.setSize(1200,800);

        JButton generate = new JButton();
        ishikawa.add(generate);
        generate.setSize(100,100);

    }
    public JPanel getview2 (){
        return ishikawa;
    }


}
