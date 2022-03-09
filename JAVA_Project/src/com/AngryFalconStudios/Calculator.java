package com.AngryFalconStudios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class Calculator extends JFrame implements ActionListener{
    int c;
    float n;
    String s1,s2,s3,s4,s5;
    JFrame f;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bequal,bclr;
    JPanel p;
    JTextField t1;
    GridLayout g;

    Calculator(){
        f =  new JFrame("Bilal's Calculator");
        URL iconURL = getClass().getResource("CalculatorIcon.png");
        ImageIcon icon = new ImageIcon(iconURL);
        f.setIconImage(icon.getImage());
        f.setLayout(new FlowLayout());
        p = new JPanel();
        b0 = new JButton("0");
        b0.setBackground(Color.LIGHT_GRAY);
        b0.addActionListener(this);
        b1 = new JButton("1");
        b1.setBackground(Color.LIGHT_GRAY);
        b1.addActionListener(this);
        b2 = new JButton("2");
        b2.setBackground(Color.LIGHT_GRAY);
        b2.addActionListener(this);
        b3 = new JButton("3");
        b3.setBackground(Color.LIGHT_GRAY);
        b3.addActionListener(this);
        b4 = new JButton("4");
        b4.setBackground(Color.LIGHT_GRAY);
        b4.addActionListener(this);
        b5 = new JButton("5");
        b5.setBackground(Color.LIGHT_GRAY);
        b5.addActionListener(this);
        b6 = new JButton("6");
        b6.setBackground(Color.LIGHT_GRAY);
        b6.addActionListener(this);
        b7 = new JButton("7");
        b7.setBackground(Color.LIGHT_GRAY);
        b7.addActionListener(this);
        b8 = new JButton("8");
        b8.setBackground(Color.LIGHT_GRAY);
        b8.addActionListener(this);
        b9 = new JButton("9");
        b9.setBackground(Color.LIGHT_GRAY);
        b9.addActionListener(this);
        b9.setBackground(Color.LIGHT_GRAY);
        badd = new JButton("+");
        badd.setBackground(Color.orange);
        badd.addActionListener(this);
        bsub = new JButton("-");
        bsub.setBackground(Color.orange);
        bsub.addActionListener(this);
        bmul = new JButton("x");
        bmul.setBackground(Color.orange);
        bmul.addActionListener(this);
        bdiv = new JButton("/");
        bdiv.setBackground(Color.orange);
        bdiv.addActionListener(this);
        bclr = new JButton("CLR");
        bclr.setBackground(Color.red);
        bclr.addActionListener(this);
        bequal = new JButton("=");
        bequal.setBackground(Color.ORANGE);
        bequal.addActionListener(this);

        t1 = new JTextField(23);
        t1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar()>='0'&&e.getKeyChar()<='9'){
                    t1.setEditable(true);
                }
                else {
                    t1.setEditable(false);
                }
            }
        });
        f.add(t1);
        g = new GridLayout(5,4,10,10);
        p.setLayout(g);

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bdiv);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bmul);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(badd);
        p.add(bequal);
        p.add(b0);
        p.add(bclr);
        p.add(bsub);
        f.add(p);
        f.setSize(360,360);
        f.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b0){
            s3 = t1.getText();
            s4 = "0";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b1){
            s3 = t1.getText();
            s4 = "1";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b2){
            s3 = t1.getText();
            s4 = "2";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b3){
            s3 = t1.getText();
            s4 = "3";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b4){
            s3 = t1.getText();
            s4 = "4";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b5){
            s3 = t1.getText();
            s4 = "5";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b6){
            s3 = t1.getText();
            s4 = "6";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b7){
            s3 = t1.getText();
            s4 = "7";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b8){
            s3 = t1.getText();
            s4 = "8";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b9){
            s3 = t1.getText();
            s4 = "9";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==badd){
            s1 = t1.getText();
            t1.setText("");
            c = 1;
        }
        if(e.getSource()==bsub){
            s1 = t1.getText();
            t1.setText("");
            c = 2;
        }
        if(e.getSource()==bmul){
            s1 = t1.getText();
            t1.setText("");
            c = 3;
        }
        if(e.getSource()==bdiv){
            s1 = t1.getText();
            t1.setText("");
            c = 4;
        }
        if(e.getSource()==bequal){
            s2 = t1.getText();
            if(c == 1){
                n = Float.parseFloat(s1)+Float.parseFloat(s2);
                t1.setText(String.valueOf(n));
            }
            if(c == 2){
                n = Float.parseFloat(s1)-Float.parseFloat(s2);
                t1.setText(String.valueOf(n));
            }
            if(c == 3){
                n = Float.parseFloat(s1)*Float.parseFloat(s2);
                t1.setText(String.valueOf(n));
            }
            if(c == 4){
                if(Float.parseFloat(s2)==0){
                    t1.setText("Math Error");
                }
                else {
                    n = Float.parseFloat(s1) / Float.parseFloat(s2);
                    t1.setText(String.valueOf(n));
                }
            }
        }
        if(e.getSource()==bclr){
            t1.setText("");
        }
    }
}
