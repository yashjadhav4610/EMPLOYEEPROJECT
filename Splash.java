package employee;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {

    Splash() {
        ImageIcon y1 = new ImageIcon(ClassLoader.getSystemResource("icons/Front.png"));
        Image y2 = y1.getImage().getScaledInstance(1170, 650, Image.SCALE_DEFAULT);
        ImageIcon y3 = new ImageIcon(y2);
        JLabel image = new JLabel(y3);
        image.setBounds(0, 0, 1170, 650);
        add(image);

        setSize(1170, 650);
        setLocation(200, 50);
        setLayout(null);
        setVisible(true);

        try {
            Thread.sleep(2500);
            setVisible(false);
            new Login();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Splash();

    }
}