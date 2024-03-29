package View;

import Controller.TreeListener;

import javax.swing.*;
import java.awt.*;

public class Window {
    JFrame mainwidnow;

    public Window() {
        mainwidnow = new JFrame("Лабораторная работа №4");
        mainwidnow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Tree treePanel=new Tree();
        Calculator calculator=new Calculator(this,treePanel);

        Box boxPanel=Box.createHorizontalBox();
        JScrollPane treeScrollPane=new JScrollPane(treePanel.getTree());
        treeScrollPane.setPreferredSize(new Dimension(200, 250));

        boxPanel.add(treeScrollPane);
        boxPanel.add(Box.createHorizontalStrut(12));
        boxPanel.add(calculator.getPanel());

        treePanel.getTree().addTreeExpansionListener(new TreeListener(treePanel,calculator.getScreen()));

        mainwidnow.setContentPane(boxPanel);
        mainwidnow.pack();
        mainwidnow.setVisible(true);
    }

    public JFrame getFrame(){
        return mainwidnow;
    }

}
