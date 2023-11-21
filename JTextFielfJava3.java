
/*A JTextField is a box that allows users to type text. It is a single-line text box,
        which means that the user can only type one line of text at a time.
        it like dialogbox  */

import javax.swing.*;
import java.awt.*;


public class JTextFielfJava3 {
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
                JTextField jtf = new JTextField();
                jtf.setBounds(100,50,300,50);
                c.add(jtf);

                jtf.setText("jishan");//set default text
                Font font= new Font("Arial",Font.BOLD,28);
                jtf.setFont(font);//it will set font of above speciality
                jtf.setForeground(Color.GREEN);//will set color of text
                jtf.setBackground(Color.BLACK);//set background color of dialog box
                jtf.setEditable(true);//if set false text is not editable
            }
        });
    }
}
