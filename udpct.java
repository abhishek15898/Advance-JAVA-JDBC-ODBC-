// A simple client program in java

import java.io.*;
import java.net.*;
public class udpct
{
public static void main (String args[]) throws Exception
 {
 DatagramSocket ds = new DatagramSocket();
 String str = "This is UDP client";
 InetAddress ip = InetAddress.getLocalHost();
 byte b[] = str.getBytes();
 int port = 2345;
 DatagramPacket dp = new DatagramPacket(b,b.length,ip,port);
 ds.send(dp);
 ds.close();
 }
}


/*========output=========
D:\>javac udpct.java

D:\>java udpct
*/