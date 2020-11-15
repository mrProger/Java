package myswing.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonAction implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        var text = JOptionPane.showInputDialog(this);
        JOptionPane.showMessageDialog(new Main(), text);
    }
}

public class Main extends JFrame{
    public Main(){
        super("My First Window");
        setBounds(100, 100, 200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Main app = new Main();
        GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = graphics.getDefaultScreenDevice();
        JPanel panel = new JPanel();
        JButton button = new JButton("hello");
        button.addActionListener(new ButtonAction());
        button.setBounds(0, 0, 100, 100);
        panel.add(button);
        panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(app.getHeight()/2, app.getWidth()/2, 0, 0));
        panel.add(Box.createHorizontalGlue());
        app.add(panel);
        app.pack();
        device.setFullScreenWindow(app);
        app.setVisible(true);
    }
}