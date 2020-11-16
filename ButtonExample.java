import javax.swing.*;      
public class ButtonExample{    
ButtonExample(){    
JFrame f=new JFrame("Button Example");            
JButton b1=new JButton("YES");    
JButton b2=new JButton("NO");
b1.setBounds(100,100,100, 40);    
b2.setBounds(100, 200, 100, 40);
f.add(b1);
f.add(b2);    
f.setSize(300,400);    
f.setLayout(null);    
f.setVisible(true);    
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
public static void main(String[] args) {    
    new ButtonExample();    
}    
}    