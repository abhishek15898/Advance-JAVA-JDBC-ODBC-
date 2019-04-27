//Mysql program to insert values in database

import java.sql.*;
import java.util.*;
class mysqlins
{
public static void main (String args[]) throws Exception
 {
 Class.forName("com.mysql.jdbc.Driver");
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
 Scanner s=new Scanner(System.in);
 System.out.println("enter employee id");
 int eno = s.nextInt();
 System.out.println("enter employee name");
 String ename = s.next();
 PreparedStatement stmt = con.prepareStatement("insert into soju29 values(?,?)");  
 stmt.setInt(1,eno);
 stmt.setString(2,ename);
 int i = stmt.executeUpdate();
 System.out.println(i+"rows inserted");
 con.close();
 }
}

/*============output==========
D:\>javac mysqlins.java

D:\>java mysqlins
enter employee id
2
enter employee name
shravani
1rows inserted

=================================
mysql> select * from soju29;
+------+----------+
| eno  | ename    |
+------+----------+
|    1 | abhishek |
|    2 | bagate   |
+------+----------+
2 rows in set (0.00 sec)
*/