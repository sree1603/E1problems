//Program to demonstrate Swing components
/*import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;*/
/*import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;*/
/*import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JComponentEx {
	public static void main(String[] args) {
		SwingComponentEx s=new SwingComponentEx();
		s.setVisible(true);
	}

}

class SwingComponentEx extends JFrame implements ActionListener//extending the JFrame class
{
	
	JTextField t1,t2;
	JLabel l1,l2;
	JButton b1,b2;
	//JRadioButton r1,r2;
	//JComboBox jc;
	public SwingComponentEx() 
	{
		
		ImageIcon i=new ImageIcon("/home/user/Pictures/Screenshots/hello.png");//add icons to the gui appl'n
		setIconImage(i.getImage());
		setVisible(true);
		setSize(600, 600);
		setTitle("Swing components");
		//setLayout(new FlowLayout());
		//setLayout(null);
		setLayout(new GridLayout(0,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel("Enter Number");
		add(l1);
		t1=new JTextField(50);
		add(t1);
		t2=new JTextField(25);
		add(t2);
		b1=new JButton("Add");
		b2=new JButton("Sub");
		b1.setBounds(100,100,10,55);
		b2.setBounds(100,300,15,55);
		t2.setBounds(100,500,15,55);

		t1.setBounds(100,700,15,55);

		l2.setBounds(100,900,15,55);
		l1.setBounds(100,1100,15,55);


		l2=new JLabel("Result Displayed Here");
/*		
		r1=new JRadioButton("male");
		r2=new JRadioButton("female");
		//Checkbox subjects - atleast 3
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);		
		jc=new JComboBox();
		jc.addItem("CSE");
		jc.addItem("ECE");
		jc.addItem("MEC");
		add(r1);
		add(r2);
		add(jc);     */
		add(b1);
		add(b2);
		
		add(l2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		             int num1=Integer.parseInt(t1.getText());
		             int num2=Integer.parseInt(t2.getText());
		             int num;
		             if(e.getSource()==b1)
		            	 num=num1+num2;
		             else
		            	 num=num1-num2;
		             l2.setText(num+"");
/*		             
//		             String.valueOf(num)
		             if(r1.isSelected())
		            	 l2.setText("Your name is:Mr."+name);
		             else
		            	 l2.setText("Your name is:Mrs."+name);
		             
		             System.out.println("your selected branch is:"+jc.getSelectedItem());  */
		            
		
	}
	
	
}
