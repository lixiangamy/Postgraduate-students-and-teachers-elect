package www.action;

import java.util.ArrayList;
import java.sql.*;
public class TtuiAction {
	public String temail;
	private String tname;//姓名
	private String tschool;//本科院校
	private String tm;//本科专业
	private int tp;//排名
	private int tb;//是否读博
	
	public String getTemail() {
        return temail;
    }
	public void setTemail(String temail) {
        this.temail=temail;
    }
    public String getTname(){
		return tname;
	}
     public void setTname(String tname) {
        this.tname = tname;
    }
     private ArrayList<String> BL = new ArrayList<String>();
	 public ArrayList<String> getBL(){
		 return BL;
	}
	 Connection connect_tmp = DB_connect.connect();
	 Connection connect_tmp2 = DB_connect.connect();
	    
	 public String execute() throws Exception {
	    Statement stmt,stmt2;
	    int f=0;
		String sql = "select * from teacher where te='"+ temail +"'";
		stmt = (Statement)connect_tmp.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			tschool=new String(rs.getString("tsshool"));
			tm=new String(rs.getString("tm"));
			tb=rs.getInt("tb");
			tp=rs.getInt("tp");
		}
		String sql2 = "select * from student";
		stmt2 = (Statement)connect_tmp2.createStatement();
		ResultSet rs2 = stmt2.executeQuery(sql2);
		while(rs2.next())
	  	{
			if(!tschool.equals("无")&&!tm.equals("无")&&tp!=0)
			{
				if(tschool.equals(new String(rs2.getString("school")))&&tm.equals(new String(rs2.getString("m")))&&tp>=rs2.getInt("p")&&tb<=rs2.getInt("b"))
				{
					BL.add(new String(rs2.getString("n")));
					f+=1;
				}
			}
			else if(!tschool.equals("无")&&tp!=0)
			{
				if(tschool.equals(new String(rs2.getString("m")))&&tp>=rs2.getInt("p")&&tb<=rs2.getInt("b"))
				{
					BL.add(new String(rs2.getString("n")));
					f+=1;
				}
			}
			else if(!tm.equals("无")&&tp!=0)
			{
				if(tm.equals(new String(rs2.getString("m")))&&tp>=rs2.getInt("p")&&tb<=rs2.getInt("b"))
				{
					BL.add(new String(rs2.getString("n")));
					f+=1;
				}
			}
			else if(!tschool.equals("无")&&!tm.equals("无"))
			{
				if(tschool.equals(new String(rs2.getString("school")))&&tm.equals(new String(rs2.getString("m")))&&tb<=rs2.getInt("b"))
				{
					BL.add(new String(rs2.getString("n")));
					f+=1;
				}
			}
			else if(tp!=0)
			{
				if(tp>=rs2.getInt("p")&&tb<=rs2.getInt("b"))
				{
					BL.add(new String(rs2.getString("n")));
					f+=1;
				}
			}
			else if(!tschool.equals("无"))
			{
				if(tschool.equals(new String(rs2.getString("school")))&&tb<=rs2.getInt("b"))
				{
					BL.add(new String(rs2.getString("n")));
					f+=1;
				}
			}
			else if(!tm.equals("无"))
			{
				if(tm.equals(new String(rs2.getString("m")))&&tb<=rs2.getInt("b"))
				{
					BL.add(new String(rs2.getString("n")));
					f+=1;
				}
			}
			else if(tb==1)
			{
				if(tb<=rs2.getInt("b"))
				{
					BL.add(new String(rs2.getString("n")));
					f+=1;
				}
			}
			else
			{
				BL.add(new String(rs2.getString("n")));
				f+=1;
				if(f==5)
				{
					break;
				}
			}
		}
		if(f==0)
		{
			return "error";
		}
		return "success";
	 }
}