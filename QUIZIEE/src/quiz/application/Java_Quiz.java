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

public class Java_Quiz extends JFrame implements ActionListener {
    
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
    
    Java_Quiz(String name) {
        this.name = name;
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon("C:\\Users\\Gaurav\\Desktop\\MCA\\Quiz-Application-Using-Java\\src\\icons\\java.png");
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
        
        // Question 1
questions[0][0] = "Which keyword is used to define a subclass in Java?";

// Options for Question 1
questions[0][1] = "subclass";
questions[0][2] = "extends";
questions[0][3] = "implements";
questions[0][4] = "super";

// Question 2
questions[1][0] = "What is the difference between == and .equals() in Java?";

// Options for Question 2
questions[1][1] = "== compares memory addresses, while .equals() compares values";
questions[1][2] = "== compares values, while .equals() compares memory addresses";
questions[1][3] = "There is no difference, they both compare values";
questions[1][4] = "There is no .equals() method in Java";

// Question 3
questions[2][0] = "What does the static keyword mean in Java?";

// Options for Question 3
questions[2][1] = "It indicates that a method cannot be overridden";
questions[2][2] = "It indicates that a variable or method belongs to the class rather than instances of the class";
questions[2][3] = "It indicates that a variable cannot be changed";
questions[2][4] = "It indicates that a method is abstract";

// Question 4
questions[3][0] = "Which of the following is a valid way to create a thread in Java?";

// Options for Question 4
questions[3][1] = "Extending the Thread class";
questions[3][2] = "Implementing the Runnable interface";
questions[3][3] = "Using the exec() method";
questions[3][4] = "Using the wait() method";

// Question 5
questions[4][0] = "Which keyword is used to prevent method overriding in Java?";

// Options for Question 5
questions[4][1] = "override";
questions[4][2] = "final";
questions[4][3] = "static";
questions[4][4] = "private";

// Question 6
questions[5][0] = "What does the super() keyword do in Java?";

// Options for Question 6
questions[5][1] = "Calls the superclass constructor";
questions[5][2] = "Calls the subclass constructor";
questions[5][3] = "Accesses a superclass method or variable";
questions[5][4] = "Terminates the program";

// Question 7
questions[6][0] = "Which collection class allows null values in Java?";

// Options for Question 7
questions[6][1] = "ArrayList";
questions[6][2] = "HashSet";
questions[6][3] = "TreeMap";
questions[6][4] = "LinkedList";

// Question 8
questions[7][0] = "What does the finally block do in Java exception handling?";

// Options for Question 8
questions[7][1] = "Always executes regardless of whether an exception occurs or not";
questions[7][2] = "Catches exceptions";
questions[7][3] = "Specifies the exception type to catch";
questions[7][4] = "Terminates the program";

// Question 9
questions[8][0] = "Which access modifier restricts access to members within the same package in Java?";

// Options for Question 9
questions[8][1] = "private";
questions[8][2] = "public";
questions[8][3] = "protected";
questions[8][4] = "package-private";

// Question 10
questions[9][0] = "What is the output of the following code snippet?";

// Options for Question 10
questions[9][1] = "13"; // Correct option
questions[9][2] = "10";
questions[9][3] = "11";
questions[9][4] = "Compilation Error";


answers[0][1] = "extends";
answers[1][1] = "== compares memory addresses, while .equals() compares values";
answers[2][1] = "It indicates that a variable or method belongs to the class rather than instances of the class";
answers[3][1] = "Implementing the Runnable interface";
answers[4][1] = "final";
answers[5][1] = "Calls the superclass constructor";
answers[6][1] = "HashSet";
answers[7][1] = "Always executes regardless of whether an exception occurs or not";
answers[8][1] = "package-private";
answers[9][1]="13";
        
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
        } 
        
        else if (ae.getSource() == submit) {
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
                //For answers...
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
        new Java_Quiz("User");
    }
}
