
package quiz.application;



import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Quizes extends JFrame {
    static String name;
    // creating container
    Container container = new Container();
JLabel background = new JLabel(""); 

    
Quizes(String name) {
        this.name = name;
        setTitle("Quizes");
        setVisible(true);
        setSize(800, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Make sure the application exits when the window is closed
getContentPane().setBackground(Color.WHITE);
        
        add(container);
         // for NAME
        JLabel n = new JLabel("Welcome " + name + " to Quiziee...");
        n.setHorizontalAlignment(SwingConstants.CENTER); // Align text to the center

       container.setLayout(null);
       
        
       
       

        // Creating buttons
        JButton java = new JButton("JAVA");
      
        // add action
        java.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.setText("Hello");
 setVisible(false);
                new Java_Quiz(name);
            }
        });
        JButton dsa = new JButton("DSA");
     
        // add action
        dsa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dsa.setText("Hello");
                setVisible(false);
                new Dsa_Quiz(name);

            }
        });
        JButton c_plus = new JButton("C++"); // Corrected spelling
        // add action
        c_plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
                new C_plus_Quiz(name);


            }
        });
        JButton html = new JButton("HTML");
        // add action
        html.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          setVisible(false);
                new Html_Quiz(name);

            }
        });
        JButton css = new JButton("CSS");
        // add action
        css.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
                new Css_Quiz(name);


            }
        });
        JButton js = new JButton("JavaScript");
        // add action
        js.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
                new Js_Quiz(name);


            }
        });
        JButton react = new JButton("React");
        // add action
        react.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
                new React_Quiz(name);


            }
        });
        
        n.setBounds(200, 10, 400, 50);
        
java.setFont(new Font("Comic Sans",Font.BOLD,18));
java.setForeground(Color.cyan);
java.setBackground(Color.LIGHT_GRAY);
java.setBounds(300,50,200,50);
  java.setBorder(BorderFactory.createEtchedBorder());

dsa.setFont(new Font("Comic Sans",Font.BOLD,18));
dsa.setForeground(Color.cyan);
dsa.setBackground(Color.LIGHT_GRAY);
dsa.setBounds(300,130,200,50);

c_plus.setFont(new Font("Comic Sans",Font.BOLD,18));
c_plus.setForeground(Color.cyan);
c_plus.setBackground(Color.LIGHT_GRAY);
c_plus.setBounds(300,210,200,50);


html.setFont(new Font("Comic Sans",Font.BOLD,18));
html.setForeground(Color.cyan);
html.setBackground(Color.LIGHT_GRAY);
html.setBounds(300,290,200,50);


css.setFont(new Font("Comic Sans",Font.BOLD,18));
css.setForeground(Color.cyan);
css.setBackground(Color.LIGHT_GRAY);
css.setBounds(300,370,200,50);



js.setFont(new Font("Comic Sans",Font.BOLD,18));
js.setForeground(Color.cyan);
js.setBackground(Color.LIGHT_GRAY);
js.setBounds(300,450,200,50);



react.setFont(new Font("Comic Sans",Font.BOLD,18));
react.setForeground(Color.cyan);
react.setBackground(Color.LIGHT_GRAY);
react.setBounds(300,530,200,50);

        // Adding buttons to the container
        container.add(n);
        container.add(java);
        container.add(dsa);
        container.add(c_plus);
        container.add(html);
        container.add(css);
        container.add(js);
        container.add(react);
        

    }

    public static void main(String[] args) {
         new Quizes("User");

       
    }
}
