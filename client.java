
//ABHISHEK BAGATE


//A client program for 2 way communication

import java.io.*;
import java.net.*;
import java.util.*;
class client
{
public static void main (String args[])throws Exception
{
 String s1,s2;
 Socket s = new Socket("localhost",1035);
 Scanner sc = new Scanner(System.in);
 s1=sc.next();
 DataOutputStream dos = new DataOutputStream(s.getOutputStream());
 dos.writeBytes(s1+'\n');
 DataInputStream dis = new DataInputStream(s.getInputStream());
 s2=dis.readLine();
 System.out.println("Server data = "+s2);
 s.close();
 }
}


/*==========output============
D:\>javac client.java
Note: client.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

D:\>java client
hello
Server data = HELLO


D:\>javac server.java
Note: server.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

D:\>java server
Client datahello
*/