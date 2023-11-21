import javax.swing.*;
import java.awt.*;
public class JLabelImage {
    public static void main(String[] args) {
        SwingUtilities.invokeLater( new Runnable(){
            public void run(){
                JFrame jfrm= new JFrame("Image in Jlabel");
                jfrm.setVisible(true);
                jfrm.setBounds(200,300,1100,1000);
                jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Container c = jfrm.getContentPane();

                ImageIcon img= new ImageIcon("C:\\Users\\SAINATH\\Pictures\\R.jpg");
                //always use IageIcon to to store image path in img

                JLabel jlbl = new JLabel("bakgroung", img,JLabel.HORIZONTAL);//
                jlbl.setBounds(300,100,600,700);
                c.add(jlbl);





            }
        });
    }
}
