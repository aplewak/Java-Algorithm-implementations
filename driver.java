package interviewPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JFrame;

public class driver  {
	public driver(){
		
	}
	
	public static void main(String [] args) throws AWTException, Exception{
	
				   
//				      InetAddress addr = InetAddress.getLocalHost();
//				      
//				      System.out.println("Local HostAddres" +addr.getHostAddress());
//				      String hostname = addr.getHostName();
//				      System.out.println("Local host name: "+ hostname);
//				      String data = addr.getCanonicalHostName();
//				      System.out.println(data);
		questions q = new questions();	
	//q.perms("", "Abc");
		try{
		q.derivative("5x3");
		}catch (Exception e){
			System.out.println("scrub exception");
			
		}
			
		
		
//		Robot robot = new Robot();
//		robot.mouseMove( (int)Math.random(),(int) Math.random());
		
		
//		q.retMaxMult(x);
//		q.retSumbetween(sum, x);
//		q.howManyCapitals(caps);
//		q.fib(10);
//		q.palcheck("raceciar");
//		q.findNonRep("bab");
//		q.fact(1115);
//		Pencil p = new Pencil();
//		Pencil p2 = new Pencil();
//		//p.isBroken();
//		p2.isBroken();
//		//scrub("thispgm");
//		try{
//			scrub("thisdf");
//		} catch (StringIndexOutOfBoundsException exception){
//			System.out.println(exception);
//		}
//		
	
	
	}

	private static void scrub(String s) {
		// TODO Auto-generated method stub
		for(int i = s.length(); i > 0; i-- ){
			System.out.println(s.charAt(i));
	}
	
	}
}
