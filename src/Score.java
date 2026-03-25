import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

class Score extends JFrame implements ActionListener{
    Score(String name, int score){
        setLayout(null);
      ImageIcon i = new ImageIcon("src/images/score.png");
      Image i2 = i.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel image = new JLabel(i3);
      image.setBounds(0, 200, 300, 250);
      add(image);

      JLabel heading = new JLabel("Thankyou " + name + " for playing Simple Minds ");
      heading.setBounds(45, 30, 700, 30);
      heading.setFont(new Font("MV Boli", Font.BOLD, 26));
      add(heading);

      JLabel userScore = new JLabel("Your Score is " + score);
      userScore.setBounds(350, 200, 300, 30);
      userScore.setFont(new Font("MV Boli", Font.BOLD, 26));
      add(userScore);

       JButton playAgain = new JButton("Play Again");
       playAgain.setBounds(400, 270, 120, 30);
       playAgain.setFont(new Font("Tahoma", Font.PLAIN, 18));
       playAgain.addActionListener(this);
       playAgain.setBackground(Color.BLUE);
       playAgain.setForeground(Color.WHITE);
       add(playAgain);

       setBounds(400, 150, 750, 550);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     getContentPane().setBackground(Color.WHITE);
     setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
         dispose();
         SwingUtilities.invokeLater(() -> new Login());
    }
    
    public static void main(String[] args) {
        new Score("User", 0);
    }
}
