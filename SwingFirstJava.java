
import javax.swing.*;
import java.awt.*;
public class SwingFirstJava {
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame jfrm = new JFrame();
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jfrm.setSize(1000,500 );
        //jfrm.setLocation(100,200);
        jfrm.setBounds(100,200,1000,500);//first location and the size
        jfrm.setTitle("First GUI Terminal");
        ImageIcon img = new ImageIcon("C:\\Users\\SAINATH\\Pictures\\microcontrollerarc.jpg");
        jfrm.setIconImage(img.getImage());//above step initialize image and this step render image
        Container c = jfrm.getContentPane();//content pane is container which hold all main component of JFrame
        c.setBackground(Color.red);
        jfrm.setResizable(true);//if false window will not resizable

    }

}

