import javax.swing.*;
import java.awt.*;
import java.util.*;

public class JButtonJava5 {
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
                JButton bt= new JButton("click me");
                bt.setBounds(100,200,100,50);
                c.add(bt);
                bt.setForeground(Color.GREEN);//set text  color
                bt.setBackground(Color.BLUE);
                Cursor cur = new Cursor(Cursor.MOVE_CURSOR);
                bt.setCursor(cur);
                bt.setEnabled(false);//if true button will be enabled
                bt.setVisible(false);//if true then only button will be visible
            }
        });
    }
}
