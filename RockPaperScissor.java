import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RockPaperScissor extends JFrame implements ActionListener {
    JButton b1,b2,b3;
    JPanel p1,p2,p3,p4;
    JTextArea t1,t2,t3,t4;
    JTextField tf1,tf2;
    JFrame f;
    int Com = 0;
    int Player = 0;
    static int computerChoice;
    RockPaperScissor(){
        f = new JFrame("RockPaperScissor");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        t1 = new JTextArea("ROCK PAPER SCISSOR");
        t1.setBackground(Color.decode("#eeeeee"));
        t1.setForeground(Color.decode("#FF8C00"));
        t1.setFont(new Font("ROCK PAPER SCISSOR",Font.BOLD,25));
        t1.setEditable(false);
        t2 = new JTextArea("");
        t2.setFont(new Font("",Font.BOLD,15));
        t2.setBackground(Color.decode("#eeeeee"));
        t2.setEditable(false);
        t3 = new JTextArea("Computer Score:");
        t3.setBackground(Color.decode("#eeeeee"));
        t3.setEditable(false);
        t4 = new JTextArea("Player Score:");
        t4.setBackground(Color.decode("#eeeeee"));
        t4.setEditable(false);
        tf1 = new JTextField(2);
        tf1.setEditable(false);
        tf2 = new JTextField(2);
        tf2.setEditable(false);
        b1 = new JButton("Rock");
        b1.addActionListener(this);
        b2 = new JButton("Paper");
        b2.addActionListener(this);
        b3 = new JButton("Scissor");
        b3.addActionListener(this);
        p1.add(t1);
        p2.add(t2);
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        p4.add(t3);
        p4.add(tf1);
        p4.add(t4);
        p4.add(tf2);
        f.add(p1);
        f.add(p4);
        f.add(p2);
        f.add(p3);
        f.setSize(350,300);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        computerChoice = (int) (((Math.random() * 10) / 4) +1);
        System.out.println("Random chosen number is " + computerChoice);
        RockPaperScissor rps = new RockPaperScissor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            if(computerChoice == 1){
                t2.setText("Match Draw ,Try Again!!!");
            }
            else if (computerChoice == 2){
                t2.setText("Better Luck next time!!!");
                Com++;
                tf1.setText(""+Com);
            }
            else if (computerChoice == 3){
                t2.setText("Congratulations, You Won!!!");
                Player++;
                tf2.setText(""+Player);
            }
            computerChoice = (int) (((Math.random() * 10) / 4) +1);
            System.out.println("Random chosen number is " + computerChoice);
        }
        if(e.getSource()==b2){
            if(computerChoice == 2){
                t2.setText("Match Draw ,Try Again!!!");
            }
            else if (computerChoice == 3){
                t2.setText("Better Luck next time!!!");
                Com++;
                tf1.setText(""+Com);
            }
            else if (computerChoice == 1){
                t2.setText("Congratulations, You Won!!!");
                Player++;
                tf2.setText(""+Player);
            }
            computerChoice = (int) (((Math.random() * 10) / 4) +1);
            System.out.println("Random chosen number is " + computerChoice);
        }
        if(e.getSource()==b3){
            if(computerChoice == 3){
                t2.setText("Match Draw ,Try Again!!!");
            }
            else if (computerChoice == 1){
                t2.setText("Better Luck next time!!!");
                Com++;
                tf1.setText(""+Com);
            }
            else if (computerChoice == 2){
                t2.setText("Congratulations, You Won!!!");
                Player++;
                tf2.setText(""+Player);
            }
            computerChoice = (int) (((Math.random() * 10) / 4) +1);
            System.out.println("Random chosen number is " + computerChoice);
        }
    }
}