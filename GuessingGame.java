import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class GuessingGame extends JFrame implements ActionListener {
    JButton b1,b2,b3;
    JTextField t1,t2,t3;
    JTextArea a1,a2,a3,a4,a5;
    JPanel p,p2,p3,p1,p4,p5;
    JFrame f;
    static int computerNumber;
    static int count = 0;
    int userAnswer = 0;
    int win = 0;
    GuessingGame(){
        f = new JFrame("Guessing Game");
        b1 = new JButton("Play Again");
        b1.addActionListener(this);
        b2 = new JButton("Guess");
        b2.addActionListener(this);
        b3 = new JButton("GiveUp!");
        b3.addActionListener(this);
        t1 = new JTextField(5);  //Best score printing
        t1.setText(""+win);
        t1.setEditable(false);            //cannot be edited externally
        t2 = new JTextField(5);   //number of guesses
        t2.setText(""+count);
        t2.setEditable(false);
        t3 = new JTextField(20);  //take input from user
        t3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar()>='0'&&e.getKeyChar()<='9'||e.getKeyCode()==8){  //only integer numbers are allowed to enter
                    t3.setEditable(true);
                }
                else
                    t3.setEditable(false);
            }
        });
        a1 = new JTextArea("Best Score");
        a1.setBackground(Color.decode("#eeeeee"));
        a1.setEditable(false);
        a2 = new JTextArea("Guesses");
        a2.setBackground(Color.decode("#eeeeee"));
        a2.setEditable(false);
        a3 = new JTextArea("Guess my number Game");
        a3.setForeground(Color.decode("#FF8C00"));
        a3.setBackground(Color.decode("#eeeeee"));
        a3.setFont(new Font("Guess my number Game",Font.BOLD,20));
        a3.setEditable(false);
        a4 = new JTextArea("Enter a number between 1-100");
        a4.setBackground(Color.decode("#eeeeee"));
        a4.setEditable(false);
        a5 = new JTextArea("Guess the number");
        a5.setForeground(Color.decode("#FF8C00"));
        a5.setFont(new Font("Guess the number",Font.BOLD,14));
        a5.setBackground(Color.decode("#eeeeee"));

        p = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p5.add(a5);
        p1.add(a4);
        p4.add(t3);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p2.add(t1);
        p2.add(a1);
        p2.add(t2);
        p2.add(a2);
        p3.add(a3);
        f.add(p3);
        f.add(p2);
        f.add(p1);
        f.add(p4);
        f.add(p5);
        f.add(p);
        f.setSize(360,300);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        GuessingGame g = new GuessingGame();
        computerNumber = (int) (Math.random()*100 + 1);  //random number generator
        System.out.println("The correct guess would be " + computerNumber); //display on terminal shell
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2){
            userAnswer = Integer.parseInt(t3.getText());
            if (userAnswer <=0 || userAnswer >100) {
                a5.setText("Your guess is invalid");
                t3.setText("");
            }
            else if (userAnswer == computerNumber ){
                a5.setText("Correct Guess, HURRAY!!!");
                t3.setText("");
                count++;
                t2.setText(""+count);
                if(win>count||win==0){
                    win = count;
                    t1.setText(""+win);
                }
                count = 0;
                t3.setEditable(false);
            }
            else if (userAnswer > computerNumber) {
                a5.setText("\"Your guess is too high, try again.");
                t3.setText("");
                count++;
                t2.setText(""+count);
            }
            else if (userAnswer < computerNumber) {
                a5.setText("Your guess is too low, try again.");
                t3.setText("");
                count++;
                t2.setText(""+count);
            }
        }
        if(e.getSource()==b3){
            a5.setText("Correct guessed number was "+computerNumber);
            t3.setText("");
            count=0;
            t2.setText(""+count);
            t3.setEditable(false);
        }
        if(e.getSource()==b1){
            t3.setEditable(true);
            a5.setText("Guess my number Game");
            t3.setText("");
            count=0;
            t2.setText(""+count);
            computerNumber = (int) (Math.random()*100 + 1);
            System.out.println("The correct guess would be " + computerNumber);
        }
    }
}