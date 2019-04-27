import java.sql.*;
import java.util.*;
class jdbc_pp
{
public static void main (String args[]) throws Exception
 {
 Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.1.0.5:1521:oracle","scott","tiger");
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


/*==========output=============
D:\>javac jdbc_pp.java

D:\>java jdbc_pp
enter employee id
3
enter employee name
pinky
1rows inserted


SQL> select * from soju29;

       EID ENAME
---------- --------------------
         3 pinky
         1 abc
*/