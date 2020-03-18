import java.net.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Server{
//	JTextArea message;
//	JTextField write;
//	JScrollPane jp;
//	static String cmsg="";
//	public Server()
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
		new Server();
		String ServerMessage;
		Scanner input  = new Scanner(System.in);
		ServerSocket ss=new ServerSocket(777);
		System.out.println("Waiting for client");
		Socket s=ss.accept();
		while(true) {
		BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw=new PrintWriter(s.getOutputStream());
		String msg=br.readLine();
		if(msg!=null) {
		System.out.println("Client:"+msg);
		}
		System.out.print("Server:");
		ServerMessage = input.nextLine();
		pw.println(ServerMessage);
		pw.flush();
//		pw.close();
		}
		
		//s.close();
	}

//	@Override
//	public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void keyPressed(KeyEvent e) {
//		// TODO Auto-generated method stub
//		/*if(e.getKeyCode()==KeyEvent.VK_LEFT) {
//			
//		}*/
//	}
//
//	@Override
//	public void keyReleased(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}

}
