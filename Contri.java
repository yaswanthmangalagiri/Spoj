import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class Contri extends JFrame 
{
    public static void main(String args[]) 
    {
        new Contri();          
    }
    ArrayList<String> nameof=new ArrayList<String>();
    ArrayList<Integer> contributed=new ArrayList<Integer>();   
    JTextField total=new JTextField(15);     
        JTextField persons=new JTextField(15);
        JTextField amounts=new JTextField(15);    
    JButton addanother=new JButton("New Entry"); 
    JButton cal=new JButton("Calculate");
    JPanel pan=new JPanel();
    String creditto="";String debitto="";
    JTextArea creditArea=new JTextArea();
    JTextArea debitArea=new JTextArea();
    public Contri()
    {
        this.setTitle("Contribution");
        this.setSize(550,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(pan);
        pan.add(addanother);
        pan.add(cal);
        this.setVisible(true);    
        cal.addActionListener(e->calc());
        addanother.addActionListener(e->newentry());
        pan.add(total); pan.add(persons);pan.add(amounts);
            pan.add(creditArea);
            pan.add(debitArea);
    } 
    public void newentry()
    {
        nameof.add(persons.getText());
        contributed.add(Integer.parseInt(amounts.getText()));
        persons.setText("");
        amounts.setText("");
    }        
    public void calc()
    {            
    	try
    	{  
    	     nameof.add(persons.getText());
        contributed.add(Integer.parseInt(amounts.getText()));
        int amount=Integer.parseInt(total.getText());
        int foreach=amount/nameof.size();
        for(int i=0;i<nameof.size();i++)
        {
            int given=contributed.get(i);         
        int credit=given-foreach;
        if(credit>0)
        {
            creditto+="Credit to "+nameof.get(i)+" "+Integer.toString(credit)+"\n"; 
        }
        else
        {
        	int debit=-1*credit;
            debitto+="Debit from "+nameof.get(i)+" "+Integer.toString(debit)+"\n";
        }    
    }    
}
    catch(NumberFormatException e)
    {
        
    }                 
        creditArea.setText(creditto);
           debitArea.setText(debitto);
        }   
    }   