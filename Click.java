import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class Click extends JFrame 
{
    public static void main(String args[]) throws NumberFormatException
    {
        new Click();          
    }
    ArrayList<String> name=new ArrayList<String>();
    ArrayList<Integer> age=new ArrayList<Integer>();   
    JTextField names=new JTextField(15);  
    JTextField ages=new JTextField(15);     
    JButton addanother=new JButton("Add another");  
    JPanel pan=new JPanel();    
    String dis="";
    JTextArea display=new JTextArea();
    public Click()
    {
        this.setTitle("Contribution");
        this.setSize(550,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(pan);
        pan.add(names);
        pan.add(ages);
        this.setVisible(true);     
        addanother.addActionListener(e->newentry());
        pan.add(addanother); 
        pan.add(display);
    }   
    public void newentry()
    {
        name.add(names.getText());
       try{
        age.add(Integer.parseInt(ages.getText()));
        names.setText("");
        ages.setText(""); 
    }    
    catch(NumberFormatException e)
    {
        
    }             
    int listsiz=name.size();
            dis+=name.get(listsiz-1)+" "+age+"\n";            
            display.setText(dis);
        }   
    }    
