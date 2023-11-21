import javax.swing.*;
import java.awt.*;

public class JPassFeilfJava4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame jfrm = new JFrame();
                jfrm.setVisible(true);
                jfrm.setBounds(100,100,1000,500);
                jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Container c = jfrm.getContentPane();
                c.setLayout(null);
                JPasswordField pass = new JPasswordField();
                pass.setBounds(100,50,120,30);
                c.add(pass);
                pass.setEchoChar('*');
            }
        });
    }
}
