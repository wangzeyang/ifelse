import javax.swing.JOptionPane;//use JOptionPane package
/*
 * @author: Zeyang Wang
 * Email: zw2991@email.vccs.edu
 * date 3,2,2016
 */
public class Else {
	public static void main (String [] args){
		String s1="12345";//string the username password.
		String	s2="23456";
		String s3="";
		String s4="";
		s3=JOptionPane.showInputDialog("please enter your username");//make a JOptionPane input dialog to let them enter information
		
                while(!s3.equals(s1)){ //make a loop for wrong username.
                	JOptionPane.showMessageDialog(null,"Wrong username.");
                	s3=JOptionPane.showInputDialog("please enter your username");}
                s4=JOptionPane.showInputDialog("please enter your password");
		while(!s2.equals(s4)){//make a loop for wrong password.
			JOptionPane.showMessageDialog(null,"Wrong password.");
			s4=JOptionPane.showInputDialog("please enter your password");
			}JOptionPane.showMessageDialog(null,"welcome to username");
                
			}								}