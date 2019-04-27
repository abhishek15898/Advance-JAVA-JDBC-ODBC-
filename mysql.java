//ABHISHEK BAGATE

import java.sql.*;
class mysql
{
public static void main(String args[]) throws Exception
 {
 Class.forName("com.mysql.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","abhi","abhi15898");
 Statement stmt=con.createStatement();
 ResultSet rs=stmt.executeQuery("select * from abhi15");
 while(rs.next())
 System.out.println(rs.getInt(1)+"  "+rs.getString(2));
 con.close();
 }
}


/*============output=========
D:\>javac mysql.java

D:\>java mysql
1  abhishek


===============================
mysql> select * from soju29;
+------+----------+
| eno  | ename    |
+------+----------+
|    1 | abhishek |
+------+----------+
1 row in set (0.00 sec)
*/