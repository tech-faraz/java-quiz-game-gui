import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Login extends JFrame implements ActionListener{
    JButton rules,exit;
    JTextField jf;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i2 = new ImageIcon("src/images/Game.png");
        ImageIcon i = new ImageIcon("src/images/login.jpeg");
        JLabel image = new JLabel();
        JLabel heading = new JLabel("Simple Mind");
        add(image);
       add(heading);
        heading.setBounds(750,60,300,45);
        image.setIcon(i);
        heading.setFont(new Font("viner Hand ITC", Font.BOLD,40));
        heading.setForeground(Color.BLUE);
           
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Moglian baiti", Font.BOLD,20));
        name.setForeground(Color.BLUE);
        add(name);

        rules = new JButton("Rules");
       rules.setBounds(735, 270, 120, 25);
       rules.setBackground(new Color(30,144,254));
       rules.setForeground(Color.BLACK);
       rules.addActionListener(this);
        add(rules);
        
         exit = new JButton("Exit");
       exit.setBounds(915, 270, 120, 25);
       exit.setBackground(new Color(30,144,254));
       exit.setForeground(Color.BLACK);
       exit.addActionListener(this);
        add(exit);

        jf = new JTextField();
      jf.setBounds(735,200,300,25);
      jf.setFont(new Font("Times new Roman",Font.BOLD,18));
      add(jf);

      image.setBounds(0, 0, 600, 500);
      setSize(1200,500);
      setLocation(100, 100);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setIconImage(i2.getImage());
       setTitle("Quiz Game");
       setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rules){
            String name = jf.getText();
            if (name.trim().isEmpty()) {
                name = "user";
            }
            dispose();
            new Rules( name);
        }
        else if(e.getSource() == exit){
         dispose();
        }
            }

            public static void main(String[] args) {
                new Login();
            }
}