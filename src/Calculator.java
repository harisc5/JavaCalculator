import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;

public class Calculator extends JFrame {
	JTextField result;
	String display = "";
	private double TEMP;
    private double SolveTEMP;
    

    Boolean addBool = false;
    Boolean subBool = false;
    Boolean divBool = false;
    Boolean mulBool = false;

 public Calculator()  {
		
		 JButton button1 = new JButton("1");
		 JButton button2 = new JButton("2");
		 JButton button3 = new JButton("3");
		 JButton button4 = new JButton("4");
		 JButton button5 = new JButton("5");
		 JButton button6 = new JButton("6");
		 JButton button7 = new JButton("7");
		 JButton button8 = new JButton("8");
		 JButton button9 = new JButton("9");
		 JButton button0 = new JButton("0");
		 JButton addbut = new JButton("+");
		 JButton subbut = new JButton("-");
		 JButton mulbut = new JButton("*");
		 JButton divbut = new JButton("/");
		 JButton enter = new JButton("Enter");
		 JButton clear = new JButton("C");
		 JButton solve = new JButton("=");
		 
		
		 
		 JPanel panel1 = new JPanel();
		 panel1.setLayout(new GridLayout(4,3));
		 panel1.add(button1);
		 panel1.add(button2);
		 panel1.add(button3);
		 panel1.add(button4);
		 panel1.add(button5);
		 panel1.add(button6);
		 panel1.add(button7);
		 panel1.add(button8);
		 panel1.add(button9);
		 panel1.add(button0);
		 
		 panel1.add(clear);
		 
		 JPanel panel2 = new JPanel();
		 panel2.setLayout(new FlowLayout());
		 panel2.add(result = new JTextField(15));
		
		
		 
		 JPanel panel3 = new JPanel();
		 panel3.setLayout(new GridLayout(5,3));
		 panel3.add(addbut);
		 panel3.add(subbut);
		 panel3.add(mulbut);
		 panel3.add(divbut);
		 panel3.add(solve);
		 
		 
		 JPanel p = new JPanel();
		 p.add(panel1,BorderLayout.SOUTH);
		 p.add(panel2,BorderLayout.NORTH);
		 p.add(panel3,BorderLayout.EAST);
		 
		 JFrame frame = new JFrame();
		 frame.add(p);

	        frame.setSize(400,600);
	        frame.setVisible(true);

		 button1.addActionListener(new Listen1());
		 button2.addActionListener(new Listen2());
		 button3.addActionListener(new Listen3());
		 button4.addActionListener(new Listen4());
		 button5.addActionListener(new Listen5());
		 button6.addActionListener(new Listen6());
		 button7.addActionListener(new Listen7());
		 button8.addActionListener(new Listen8());
		 button9.addActionListener(new Listen9());
		 button0.addActionListener(new Listen0());
		 
		 addbut.addActionListener(new Listenadd());
		 subbut.addActionListener(new Listensub());
		 mulbut.addActionListener(new Listenmul());
		 divbut.addActionListener(new Listendiv());
		 clear.addActionListener(new Listenclear());
		 solve.addActionListener(new Listensolve());
		 
	}

class ListenToClear implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        
        result.setText("");
        addBool = false;
        subBool = false;
        mulBool = false;
        divBool = false;

        TEMP = 0;
        SolveTEMP = 0;
    }
}
 
		  class Listen1 implements ActionListener {
		        public void actionPerformed(ActionEvent e) {
		            display = result.getText();
		            result.setText(display + "1");
		        }
		    }
		  class Listen2 implements ActionListener {
		        public void actionPerformed(ActionEvent e) {
		            display = result.getText();
		            result.setText(display + "2");
		        }
		    }
		  class Listen3 implements ActionListener {
		        public void actionPerformed(ActionEvent e) {
		            display = result.getText();
		            result.setText(display + "3");
		        }
		    }
		  class Listen4 implements ActionListener {
		        public void actionPerformed(ActionEvent e) {
		            display = result.getText();
		            result.setText(display + "4");
		        }
		    }
		  class Listen5 implements ActionListener {
		        public void actionPerformed(ActionEvent e) {
		            display = result.getText();
		            result.setText(display + "5");
		        }
		    }
		  class Listen6 implements ActionListener {
		        public void actionPerformed(ActionEvent e) {
		            display = result.getText();
		            result.setText(display + "6");
		        }
		    }
		  class Listen7 implements ActionListener {
		        public void actionPerformed(ActionEvent e) {
		            display = result.getText();
		            result.setText(display + "7");
		        }
		    }
		  class Listen8 implements ActionListener {
		        public void actionPerformed(ActionEvent e) {
		            display = result.getText();
		            result.setText(display + "8");
		        }
		    }
		  class Listen9 implements ActionListener {
		        public void actionPerformed(ActionEvent e) {
		            display = result.getText();
		            result.setText(display + "9");
		        }
		    }  
		  class Listen0 implements ActionListener {
		        public void actionPerformed(ActionEvent e) {
		            display = result.getText();
		            result.setText(display + "0");
		        }
		    }
		 
		  class Listenadd implements ActionListener {
		        public void actionPerformed(ActionEvent e) {
		            TEMP = Double.parseDouble(result.getText());
		            result.setText("");
		            addBool = true;
		        }
		    }

		    class Listensub implements ActionListener {
		        public void actionPerformed(ActionEvent e) {
		            TEMP = Double.parseDouble(result.getText());
		            result.setText("");
		            subBool = true;
		        }
		    }

		    class Listenmul implements ActionListener {
		        public void actionPerformed(ActionEvent e) {
		            TEMP = Double.parseDouble(result.getText());
		           result.setText("");
		            mulBool = true;
		        }
		    }

		    class Listendiv implements ActionListener {
		        public void actionPerformed(ActionEvent e) {
		            TEMP = Double.parseDouble(result.getText());
		            result.setText("");
		            divBool = true;
		        }
		     }
		    class Listensolve implements ActionListener {
		        public void actionPerformed(ActionEvent e) {
		            SolveTEMP = Double.parseDouble(result.getText());
		            if (addBool == true)
		                SolveTEMP = SolveTEMP + TEMP;
		            else if ( subBool == true)
		                SolveTEMP = TEMP - SolveTEMP;
		            else if ( mulBool == true)
		                SolveTEMP = SolveTEMP * TEMP;
		            else if ( divBool == true)
		                            SolveTEMP = TEMP / SolveTEMP ;
		            result.setText( Double.toString(SolveTEMP));

		            addBool = false;
		            subBool = false;
		            mulBool = false;
		            divBool = false;
		        }
		    }
		    class Listenclear implements ActionListener {
		        public void actionPerformed(ActionEvent e) {
		           
		            result.setText("");
		            addBool = false;
		            subBool = false;
		            mulBool = false;
		            divBool = false;

		            TEMP = 0;
		            SolveTEMP = 0;
		        }
		    }
		    public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        Calculator calc = new Calculator();
		        calc.pack();
		        calc.setLocationRelativeTo(null);
		    	        
		    }
		}
	
