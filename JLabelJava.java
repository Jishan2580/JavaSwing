
import javax.swing.*;
import java.awt.*;
public class JLabelJava {
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){

                JFrame jfrm= new JFrame("second swing");
                jfrm.setVisible(true);
                jfrm.setBounds(100,100,1000,500);
                jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Container c = jfrm.getContentPane();
                JLabel jlbl= new JLabel("username");
                // c.add(jlbl);//by default result is at centre and at left side
                c.setLayout(null);//it is mandatory to use if we want to define location on our own
                jlbl.setBounds(100,50, 100, 30);

                jlbl.setText("passwrod");//use to change text dynamically at runtime
                c.add(jlbl);//add the label to window content pane
                JLabel jlbl1 = new JLabel("hello world ");
                jlbl1.setBounds(200,100,500,50);
                Font font= new Font("italic",Font.BOLD,23);//new Font("FontName", FontStyle, fontSize);
                jlbl1.setFont(font);
                c.add(jlbl1);




            }
        });
    }
}


