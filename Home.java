package employee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Home extends JFrame implements ActionListener {

    Home() {

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1370, 695, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1370, 695);
        add(image);

        JLabel heading = new JLabel("Employee Managment System");
        heading.setBounds(620, 20, 400, 40);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        image.add(heading);

        JButton add = new JButton("Add Employee");
        add.setBounds(650, 80, 150, 40);
        add.addActionListener(this);
        image.add(add);

        JButton view = new JButton("View Employee");
        view.setBounds(820, 80, 150, 40);
        view.addActionListener(this);
        image.add(view);

        JButton Update = new JButton("Update Employee");
        Update.setBounds(650, 140, 150, 40);
        Update.addActionListener(this);
        image.add(Update);

        JButton remove = new JButton("Remove Employee");
        remove.setBounds(820, 140, 150, 40);
        remove.addActionListener(this);
        image.add(remove);

        setSize(1370, 695);
        setLocation(250, 100);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new Home();

    }

}
