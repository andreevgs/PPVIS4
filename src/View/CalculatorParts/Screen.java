package View.CalculatorParts;

import javax.swing.*;
import java.awt.*;

public class Screen {
    JScrollPane scrollPane;
    JTextField screen;

    public Screen(){
        screen=new JTextField();
        screen.setEnabled(false);
        screen.setPreferredSize(new Dimension(200,100));
        screen.setSize(210,100);
    }

    public JTextField getScreen(){
        return screen;
    }
}
