//A simple server program n java

import java.io.*;
import java.net.*;
public class udpsr
{
public static void main (String args[]) throws Exception
 {
 DatagramSocket ds = new DatagramSocket(2345);
 byte b[] = new byte[1024];
 DatagramPacket dp = new DatagramPacket(b,b.length);
 ds.receive(dp);
 String msg = new String (dp.getData(),0,dp.getLength());
 System.out.println("Client data : "+msg);
 ds.close();
 }
}



/*=========output==========
D:\>javac udpsr.java

D:\>java udpsr
Client data : This is UDP client
*/