import javax.swing.*;
import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonJava {
    public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
    @Override
    public void run() {
        JFrame jfrm = new JFrame( "jbutton ");
        Container c = jfrm.getContentPane();
        jfrm.setBounds(30,30,600,400);
        jfrm.setVisible(true);
        c.setLayout(null);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn = new JButton("click mr ");
        btn.setBounds(50,50,100,60);
        btn.setForeground(Color.GREEN);
        c.add(btn);
        btn.setBackground(Color.BLACK);
        JButton btn2 = new JButton("green");
        btn2.setBounds(200,50,100,60);
        c.add(btn2);


       btn.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                //first method without getsource method
               //c.setBackground(Color.red);

               //by using get source method
               if(e.getSource()== btn )
                   c.setBackground(Color.red);
               //action performed by using getSource method
               if(e.getSource()==btn2){
                   c.setBackground(Color.GREEN);
               }
           }
       });


       //this is also method to add
     /*  btn2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               c.setBackground(Color.GREEN);
           }
       });*/
    }
});
    }
}
