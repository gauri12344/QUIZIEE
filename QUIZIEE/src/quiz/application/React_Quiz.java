/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application;

/**
 *
 * @author Gaurav
 */



import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class React_Quiz extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;
    
    public static int timer = 30;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    
    React_Quiz(String name) {
        this.name = name;
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);
        
        qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);
        
       //Question 1

questions[0][0] = "What is React?";

//Options
questions[0][1] = "A) A programming language";
questions[0][2] = "B) A JavaScript library for building user interfaces";
questions[0][3] = "C) A database management system";
questions[0][4] = "D) A design framework";

//Question 2

questions[1][0] = "Which function is used to render React elements into the DOM?";

//Options
questions[1][1] = "A) React.render()";
questions[1][2] = "B) ReactDOM.render()";
questions[1][3] = "C) renderDOM()";
questions[1][4] = "D) reactDOM.render()";

//Question 3

questions[2][0] = "What is JSX in React?";

//Options
questions[2][1] = "A) JavaScript XML";
questions[2][2] = "B) JavaScript Extension";
questions[2][3] = "C) JavaScript Framework";
questions[2][4] = "D) JavaScript Syntax";

//Question 4

questions[3][0] = "What is the purpose of state in React?";

//Options
questions[3][1] = "A) To store component logic";
questions[3][2] = "B) To hold data that may change over time";
questions[3][3] = "C) To define component structure";
questions[3][4] = "D) To handle events";

//Question 5

questions[4][0] = "Which method is used to update the state in React components?";

//Options
questions[4][1] = "A) this.setState()";
questions[4][2] = "B) this.updateState()";
questions[4][3] = "C) this.state()";
questions[4][4] = "D) this.updateState()";

//Question 6

questions[5][0] = "What is a component in React?";

//Options
questions[5][1] = "A) A CSS class";
questions[5][2] = "B) An HTML element";
questions[5][3] = "C) A JavaScript function or class that returns a React element";
questions[5][4] = "D) A JavaScript object";

//Question 7

questions[6][0] = "Which lifecycle method is called after a component is rendered for the first time?";

//Options
questions[6][1] = "A) componentDidMount()";
questions[6][2] = "B) componentWillMount()";
questions[6][3] = "C) componentDidUpdate()";
questions[6][4] = "D) render()";

//Question 8

questions[7][0] = "What is the purpose of props in React?";

//Options
questions[7][1] = "A) To define component state";
questions[7][2] = "B) To handle events";
questions[7][3] = "C) To pass data from parent to child components";
questions[7][4] = "D) To update the DOM directly";

//Question 9

questions[8][0] = "What is the role of keys in React lists?";

//Options
questions[8][1] = "A) To define styles for list items";
questions[8][2] = "B) To add animation to list items";
questions[8][3] = "C) To remove items from lists";
questions[8][4] = "D) To identify list items uniquely";

//Question 10

questions[9][0] = "What is the purpose of React Router?";

//Options
questions[9][1] = "A) To manage application state";
questions[9][2] = "B) To handle HTTP requests";
questions[9][3] = "C) To handle authentication";
questions[9][4] = "D) To manage navigation in React applications";

// Correct Answers

answers[0][1] = "B) A JavaScript library for building user interfaces";
answers[1][1] = "B) ReactDOM.render()";
answers[2][1] = "A) JavaScript XML";
answers[3][1] = "B) To hold data that may change over time";
answers[4][1] = "A) this.setState()";
answers[5][1] = "C) A JavaScript function or class that returns a React element";
answers[6][1] = "A) componentDidMount()";
answers[7][1] = "C) To pass data from parent to child components";
answers[8][1] = "D) To identify list items uniquely";
answers[9][1] = "D) To manage navigation in React applications";
        
        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 30;
        } else if (timer < 0) {
            timer = 30;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args) {
        new React_Quiz("User");
    }
}
