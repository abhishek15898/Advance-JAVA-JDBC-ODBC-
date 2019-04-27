//A server program for 2 way communication in Java

import java.io.*;
import java.net.*;
class server
{
public static void main (String args[])throws Exception
{
 String str1,str2;
 ServerSocket srvsoc = new ServerSocket (1035);
 Socket s1 = srvsoc.accept();
 DataInputStream diss = new DataInputStream(s1.getInputStream());
 str1 = diss.readLine();
 System.out.println("Client data"+str1);
 str2 = str1.toUpperCase();
 DataOutputStream ds = new DataOutputStream(s1.getOutputStream());
 ds.writeBytes(str2);
 s1.close();
 }
}


/*===========output===========
D:\>javac server.java
Note: server.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

D:\>java server
Client datahello
*/
