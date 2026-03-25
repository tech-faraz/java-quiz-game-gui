import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton back,start;
    Rules(String name){
        this.name = name; 
        setLayout(null);
       
        JLabel heading = new JLabel("WellCome  " + name + "  "+" to  Simple  Mind");
        heading.setBounds(50,20,700,45);
        heading.setFont(new Font("viner Hand ITC", Font.BOLD,35));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20,45, 760, 400);
        rules.setFont(new Font("Tahoma", Font.PLAIN,16));
        rules.setForeground(Color.BLACK);
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point." + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer." + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory." + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions." + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted." + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
);
        add(rules);

         start = new JButton("Start Game");
        start.setBounds(150,500,100,30);
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(450,500,100,30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon i = new ImageIcon("src/images/Game.png");
        setIconImage(i.getImage());
        setTitle("Quiz Game");
        setSize(800, 650);
        setResizable(false);
        setLocation(335, 60);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== start){
          dispose();
          new Quiz(name);
       }
       else {
        dispose();
        new Login();
       }
    }

    public static void main(String[] args) {
        new Rules("User");
        
    }
}
