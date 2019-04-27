//PreparedStatement program for selecting a value from oracle 

import java.sql.*;
import java.util.*;
class jdbc_pp2
{
public static void main (String args[]) throws Exception
 {
 Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.1.0.5:1521:oracle","scott","tiger");
 PreparedStatement stmt = con.prepareStatement("select * from soju29");  
 ResultSet rs = stmt.executeQuery();
 while(rs.next())
 System.out.println(rs.getInt(1)+" "+rs.getString(2));
 con.close();
 }
}


/*===========output============
D:\>javac jdbc_pp2.java

D:\>java jdbc_pp2
3 pinky
1 abc
*/