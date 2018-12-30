//Java Calculator
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
class AwtCalculator implements ActionListener
{
  Button b1, b2, b3, b4, clr, exit;
  TextField tf1, tf2, tf3;
  Font font = new Font("Didot", Font.PLAIN, 25);
  //constructor
  //---------------------Colors--------------------
  Color c1 = new Color(255, 255, 255);            
  Color c2 = new Color(124, 77, 255);            
  Color c3 = new Color(255,82, 82);       
  AwtCalculator()
  {
    JFrame frm = new JFrame("Calculator");
    frm.setSize(500, 550);
    frm.setLocation(100,100);
    frm.setLayout(null);
    frm.setVisible(true);                   //For making Frame Visible
    frm.setDefaultCloseOperation(3);        //Method to Close program 
    //-------------Elements-------------------
    //TextField
    tf1 = new TextField(25);
    tf1.setBounds(80,70,350,50);
    tf2 = new TextField(25);
    tf2.setBounds(80,140,350,50);
    tf3 = new TextField(25);
    tf3.setBounds(80,210,350,50);
    tf3.setEditable(false);
    //Button
    b1 = new Button("+");
    b1.setBounds(80,280,70,70);
    b2 = new Button("-");
    b2.setBounds(170,280,70,70);
    b3 = new Button("/");
    b3.setBounds(260,280,70,70);
    b4 = new Button("*");
    b4.setBounds(360,280,70,70);
    clr = new Button("Clear");
    clr.setBounds(80, 370, 160, 70);
    exit = new Button("Exit");
    exit.setBounds(260, 370, 170, 70);
    //-------------Event Handeling-------------------
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    clr.addActionListener(this);
    exit.addActionListener(this);
    //-------------Formatting-----------------------
    tf1.setFont(font);
    tf2.setFont(font);
    tf3.setFont(font);
    b1.setFont(font);
    b2.setFont(font);
    b3.setFont(font);
    b4.setFont(font);
    clr.setFont(font);
    exit.setFont(font);
    //Colors
    frm.getContentPane().setBackground(c1);
    b1.setForeground(c2);
    b2.setForeground(c2);
    b3.setForeground(c2);
    b4.setForeground(c2);
    exit.setBackground(c3);
    clr.setBackground(c3);
    //-------------Adding Elements-------------------
    frm.add(tf1);
    frm.add(tf2);
    frm.add(tf3);
    frm.add(b1);
    frm.add(b2);
    frm.add(b3);
    frm.add(b4);
    frm.add(clr);
    frm.add(exit);
  }
  //--------------Action Listener method--------------

  public void actionPerformed(ActionEvent ae)
  {
    String s1 = tf1.getText();
    String s2 = tf2.getText();
    try{
      double a = Double.parseDouble(s1);
      double b = Double.parseDouble(s2);
      double total = 0;

      if(ae.getSource() == b1)
      {
        total = a + b;
      }
      else if(ae.getSource() == b2)
      {
        total = a - b;
      }
      else if(ae.getSource() == b3)
      {
        total = a / b;
      }
      else if(ae.getSource() == b4)
      {
        total = a * b;
      }

      if(ae.getSource() == clr)
      {
        //  clear();
        tf1.setText("");
        tf2.setText("");
      }


/*
      private void clear()
      {
        tf1 = tf1.setText(0);
        tf2 = tf2.setText(0);
      }
*/

      String result = String.valueOf(total);
      tf3.setText(result);
    }
    catch(Exception e)
    {
      tf3.setText("Invalid Operation");
    }
    /*
    catch(NumberFormatException ne)
    {
      tf3.setText("Please use non decimal value");
    }
    */
}
  public static void main(String[] args)
  {
      new AwtCalculator();
  }
}
