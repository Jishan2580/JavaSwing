package registrationform;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


class  MyFrame implements ActionListener, ItemListener {
    JLabel label1,label2,label3 , label4,label5,msg;
    TextField name,mobile,gmail;
    JComboBox month,year;
    JTextArea addr,screen;
    JRadioButton male,female;
    JCheckBox terms ;
    JButton submit;


    MyFrame(){

        JFrame jfrm = new JFrame();
        jfrm.setVisible(true);
        jfrm.setBounds(200,300,1100,600);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = jfrm.getContentPane();

        c.setLayout(null);

        //name
        label1= new JLabel("Name");
        label1.setBounds(10,50,50,30);
        c.add(label1);
        name= new TextField();
        name.setBounds(50,57,100,20);
        c.add(name);

        label2= new JLabel("Mobile");
        label2.setBounds(10,100,50,30);
        c.add(label2);
        mobile = new TextField();
        mobile.setBounds(50,114,100,20);
        c.add(mobile);

    ButtonGroup bt = new ButtonGroup();

        male= new JRadioButton("male");
        female= new JRadioButton("female");
        male.setBounds(10,150,100,30);
        female.setBounds(150,150,100,30);
        bt.add(male);
        bt.add(female);
        c.add(male);
        c.add(female);
         label3= new JLabel("DOB");
         label3.setBounds(10,190,50,30);
         c.add(label3);
         String[] days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                 "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                 "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"
         };
        String[] months = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12"};
        JComboBox day = new JComboBox(days);
        day.setBounds(50,190,50,30);
         c.add(day);
         month =new JComboBox(months);
         month.setBounds(110,190,50,30);
        c.add(month);

        String[] years = {"2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015",
                "2014",
                "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004",
                "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994",
                "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984",
                "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974",
                "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964",
                "1963", "1966"
        };

        year = new JComboBox(years);
        year.setBounds(170,190,50,30);
        c.add(year);
        //address
        label4 = new JLabel("Adress");
        label4.setBounds(10,220,50,30);
        c.add(label4);
        addr= new JTextArea();
        addr.setBounds(70,230,150,40);
        c.add(addr);

        //gmial
        label5= new JLabel("Gmail");
        label5.setBounds(10,300,60,30);
        c.add(label5);

        gmail= new TextField();
        gmail.setBounds(110,300,120,30);
        c.add(gmail);

        //checkbox terms and condition

        terms = new JCheckBox("accept terms and condition ");
        terms.setBounds(40,350,190,40);
        c.add(terms);

        //submit button
        submit = new JButton("submit");
        submit.setEnabled(false);
        submit.setBounds(40,400,100,40);
        c.add(submit);

        //mesage
        screen = new JTextArea();
        screen.setBounds(400,40,400,400);
        c.add(screen);

        //messege
        msg= new JLabel("");
        msg.setBounds(20,460,100,40);
        c.add(msg);
        terms.addItemListener(this);
        submit.addActionListener(this);




    }
    public  void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        if(e.getSource()==submit){

            msg.setText("regestration succesfull");
            String name1 = name.getText();
            String gender="";
            if(male.isSelected()){
                gender+="male";
            }else gender+="female";
            String mobile1 = mobile.getText();
            String gmail1 = gmail.getText();
            String address1= addr.getText();

            screen.setText("name "+ name1 + "gender" + gender + "gmial" + gmail1 + "address " + address1 );

            //jdbc
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost : 3306/Registration";
                String username = "root";
                String pass = "root";
                Connection con = DriverManager.getConnection(url, username, pass);
                String q2 = "insert into regdata values(?,?,?,?,?)";
                PreparedStatement ps1 = con.prepareStatement(q2);
                ps1.setString(1, name1);
                ps1.setString(2, mobile1);
                ps1.setString(3, gender);
                ps1.setString(4, address1);
                ps1.setString(5, gmail1);
                int i = ps1.executeUpdate();

            //this is defined by compiler not me
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }


        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange()==ItemEvent.SELECTED){
            submit.setEnabled(true);

        }

    }





}
public class RegistrationFormSwing {
    public static void main(String[] args) {



        MyFrame mf = new MyFrame();

    }
}
