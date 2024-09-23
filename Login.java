package employee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.MessageFormat;

@SuppressWarnings("ALL")
public class Login extends JFrame implements ActionListener {

    JTextField tusername;
    JPasswordField tpassword;
    JButton login, back;

    Login() {

        JLabel username = new JLabel("Username");
        username.setBounds(40, 20, 100, 30);
        add(username);

        tusername = new JTextField();
        tusername.setBounds(150, 20, 150, 30);
        add(tusername);

        JLabel password = new JLabel("Password");
        password.setBounds(40, 70, 100, 30);
        add(password);

        tpassword = new JPasswordField();
        tpassword.setBounds(150, 70, 150, 30);
        add(tpassword);

        login = new JButton("LOGIN");
        login.setBounds(150, 140, 150, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        back = new JButton("BACK");
        back.setBounds(150, 180, 150, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon y1 = new ImageIcon(ClassLoader.getSystemResource("icons/Mid.jpg"));
        Image y2 = y1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon y3 = new ImageIcon(y2);
        JLabel img = new JLabel(y3);
        img.setBounds(0, 0, 600, 300);
        add(img);

        setSize(600, 300);
        setLocation(450, 200);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            try {
                String username = tusername.getText();
                char[] password = tpassword.getPassword();

                Conn conn = new Conn();

                String query = MessageFormat.format(
                        "select * from login2 where username = ''{0}'' and password = ''{1}'' ", username, password);
                ResultSet resultSet = conn.Statement.executeQuery(query);
                if (resultSet.next()) {
                    setVisible(false);
                    new Main_class();

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }

            } catch (Exception E) {
                E.printStackTrace();
            }

        } else if (e.getSource() == back) {
            System.exit(98);
        }
    }

    public static void main(String[] args) {
        new Login();

    }
}
