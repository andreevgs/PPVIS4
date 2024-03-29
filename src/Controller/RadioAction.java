package Controller;

import View.CalculatorParts.*;
import View.Tree;
import View.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioAction implements ActionListener {

    private ButtonsPanel panel;
    private Window window;
    private Tree tree;


    public RadioAction(ButtonsPanel panel, Window window, Tree tree) {
        this.panel = panel;
        this.window = window;
        this.tree = tree;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (panel.trig.isSelected()) {
            panel.getPanel().remove(panel.getPanel().getComponentCount() - 1);

            Box customPanel = Box.createHorizontalBox();
            customPanel.add(panel.simplePanel());
            customPanel.add(panel.trigPanel());

            panel.getPanel().add(customPanel);

            Dimension panelDimension = new Dimension(panel.simplePanel().getWidth() + panel.trigPanel().getWidth(), panel.getPanel().getHeight());
            panel.getPanel().setMinimumSize(panelDimension);
            panel.getPanel().setSize(panelDimension);

            Dimension frameDimension=new Dimension(tree.getTree().getWidth() + panel.getPanel().getWidth()+14, window.getFrame().getHeight());
            window.getFrame().setMinimumSize(frameDimension);
            window.getFrame().setSize(frameDimension);

            panel.getPanel().validate();

        } else {
            panel.getPanel().remove(panel.getPanel().getComponentCount() - 1);
            panel.getPanel().add(panel.simplePanel());

            Dimension panelDimension = new Dimension(panel.simplePanel().getWidth(), panel.getPanel().getHeight());

            panel.getPanel().setMinimumSize(panelDimension);
            panel.getPanel().setSize(panelDimension);

            Dimension frameDimension=new Dimension(tree.getTree().getWidth() + panel.getPanel().getWidth()+14, window.getFrame().getHeight());
            window.getFrame().setMinimumSize(frameDimension);
            window.getFrame().setSize(frameDimension);

            panel.getPanel().validate();
        }


    }
}
