package www.action;
import java.sql.*;
public class DB_connect {
	public static Connection connect() {
		Connection connect = null;//ָ��
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");//������������
			//connect = DriverManager.getConnection(//�ڱ�������
					//"jdbc:mysql://localhost:3306/studentandteacher", "root","LIXIANGamy773316");
			connect = DriverManager.getConnection(//�ڱ�������
					"jdbc:mysql://localhost:3306/studentandteacher", "root","13836955150abcd");
		}
		catch (ClassNotFoundException e) {
			System.out.println("Error!");//δ���ӵ����ݿ�
		}
		catch (Exception e) {
			System.out.println("Error!");//δ���ӵ����ݿ�
		}
		return connect;
	}
}
