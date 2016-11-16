package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TchooseAction {
	private String temail=null;
	private String tname=null;
	private String se=null;
    public String getTemail() {
        return temail;
    }
    public void setTemail(String temail) {
        this.temail=temail;
    }
    public String getTname() {
        return tname;
    }
    public void setTname(String tname) {
        this.tname=tname;
    }
    public String getSe() {
        return se;
    }
    public void setSe(String se) {
        this.se=se;
    }
    private ArrayList<String> BL = new ArrayList<String>();
    public ArrayList<String> getBL(){
		return BL;
	}
    public void setBT(ArrayList<String> BL) {
        this.BL = BL;
    }
    Connection connect_temp = DB_connect.connect();
    Connection connect_temp2 = DB_connect.connect();
	public String execute() throws Exception {
		Statement stmt;
		Statement stmt2;
		int f=0;
		String sql = "select * from student";
		stmt = (Statement)connect_temp.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next())
		{
			f=0;
			se=rs.getString("e");
			String sql2 = "select * from ts where tee='" + temail + "'";
			stmt2 = (Statement)connect_temp2.createStatement();
			ResultSet rs2 = stmt2.executeQuery(sql2);
			while(rs2.next())
			{
				if(se.equals(new String(rs2.getString("ste"))))
				{
					f=1;
				}
			}
			if(f==0)
			{
				BL.add(new String(rs.getString("n")));
			}
		}
		return "success";
    }
}
