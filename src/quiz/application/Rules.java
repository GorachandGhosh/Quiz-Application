package quiz.application;

import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start,back;
    
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to ThinkFast!");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,400);
        rules.setFont(new Font("Tahoma", Font.PLAIN,16));
        rules.setText(
               "<html>"+
                       "1. Answering all qustions is mandatory.<br><br>" +
                       "2. Each qustion has a time limit; once the time is up, the answer will be locked.<br><br>" +
                       "3. Once you submit an answer, it cannot be changed, so choose wisely.<br><br>" +
                       "4. Any kind of cheating or external help is strictly prohibited.<br><br>" +
                       "5. If you don't know the answer, don't hesitate to make an intelligent guess.<br><br>" +
                       "6. No talking or discussion is allowed during the quiz.<br><br>" +
                       "7. Marks will be awarded for correct answers; there is no negative marking (unless specified).<br><br>" +
                       "8. Each question carries 10 marks.<br><br>"+
                       "9. Only one 50-50 lifeline is allowed in the entire quiz.<br><br>"+
                       "10. Your score will be displayed on the screen at the end of the quiz - Best of luck!<br><br>" +
                       "<html>"
        );
        add(rules);
        
         back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }else{
            setVisible(false);
            new Login();
        }
    
    }
    
    public static void main(String args[]){
        new Rules("User");
    }
}
