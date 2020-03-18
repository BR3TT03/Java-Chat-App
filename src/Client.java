import java.net.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Client {
//	JTextArea message;
//	JTextField write;
//	JScrollPane jp;
//	static String cmsg="";
//	public Client()
//	{
//		setBounds(400,100,500,500);
//		getContentPane().setBackground(Color.blue);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setLayout(null);
//		message=new JTextArea();
//		jp=new JScrollPane(message);
//		jp.setBounds(50,50,400,200);
//		write=new JTextField();
//		write.setBounds(50, 270, 300, 30);
//		add(jp);
//		add(write);
//		setVisible(true);
//	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new Client();
		String ClientMessage;
		Scanner input  = new Scanner(System.in);
		Socket s= new Socket("Localhost",777);
		while(true) {
		PrintWriter pw= new PrintWriter(s.getOutputStream());
		InputStreamReader in= new InputStreamReader(s.getInputStream());
		BufferedReader br= new BufferedReader(in);
		System.out.print("Client:");
		ClientMessage = input.nextLine();
		pw.println(ClientMessage);
		pw.flush();
		String msg=br.readLine();
		if(msg!=null) {
		System.out.println("Server:"+msg);
		}
//		pw.close();
//		br.close();
		}
		//s.close();
	}

}
