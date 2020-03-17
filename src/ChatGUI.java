import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatGUI extends JFrame {

	JTextArea message;
	JTextField write;
	JScrollPane jp;
	public ChatGUI()
	{
		setBounds(400,100,800,500);
		getContentPane().setBackground(Color.blue);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		message=new JTextArea();
		jp=new JScrollPane(message);
		jp.setBounds(50,50,400,200);
		write=new JTextField();
		write.setBounds(50, 270, 300, 30);
		add(jp);
		add(write);
		setVisible(true);
		
	}
   public static void main(String a[]) {
	   new ChatGUI();
   }
}
