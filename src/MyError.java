

import javax.swing.*;
import java.awt.*;

public class MyError extends JFrame {
    private JLabel lab = new JLabel();

    public MyError(String s) {
        add(lab);
        lab.setText(s);
        setLayout(new FlowLayout());
        setSize(200, 80);
        setVisible(true);
    }
}