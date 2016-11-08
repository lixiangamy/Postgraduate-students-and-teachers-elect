package www.action;
import java.sql.*;
public class DB_connect {
	public static Connection connect() {
		Connection connect = null;//指针
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");//加载驱动程序
			//connect = DriverManager.getConnection(//在本地运行
					//"jdbc:mysql://localhost:3306/studentandteacher", "root","LIXIANGamy773316");
			connect = DriverManager.getConnection(//在本地运行
					"jdbc:mysql://localhost:3306/studentandteacher", "root","13836955150abcd");
		}
		catch (ClassNotFoundException e) {
			System.out.println("Error!");//未连接到数据库
		}
		catch (Exception e) {
			System.out.println("Error!");//未连接到数据库
		}
		return connect;
	}
}
