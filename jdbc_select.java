//Program to select or retrieve values from oracle database

import java.sql.*;
class jdbc_select
{
public static void main (String args[]) throws Exception
 {
 Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.1.0.5:1521:oracle","scott","tiger");
 Statement stmt = con.createStatement();
 ResultSet rs = stmt.executeQuery("select * from soju29");
 while(rs.next())
 System.out.println(rs.getInt(1)+""+rs.getString(2));
 con.close();
 }
}




/*==============OUTPUT===========
D:\>javac jdbc_select.java

D:\>java jdbc_select
1abc
*/