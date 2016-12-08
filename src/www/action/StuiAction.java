package www.action;

import java.util.ArrayList;
import java.sql.*;
public class StuiAction {
	public String semail;
	private String sna;//姓名
	private String sschool;//本科院校
	private String sm;//本科专业
	private int sp;//排名
	private int sb;//是否读博
	
	public String getSemail() {
        return semail;
    }
	public void setSemail(String semail) {
        this.semail=semail;
    }
    public String getSna(){
		return sna;
	}
     public void setSna(String sna) {
        this.sna = sna;
    }
     private ArrayList<String> BL = new ArrayList<String>();
	 public ArrayList<String> getBL(){
		 return BL;
	}
	 Connection connect_temp = DB_connect.connect();
	 Connection connect_temp2 = DB_connect.connect();
	    
	 public String execute() throws Exception {
	    Statement stmt,stmt2;
		int f=0;
		String sql = "select * from student where e='"+ semail +"'";
		stmt = (Statement)connect_temp.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			sschool=new String(rs.getString("school"));
			sm=new String(rs.getString("m"));
			sb=rs.getInt("b");
			sp=rs.getInt("p");
		}
		String sql2 = "select * from teacher";
		stmt2 = (Statement)connect_temp2.createStatement();
		ResultSet rs2 = stmt2.executeQuery(sql2);
		while(rs2.next())
	  	{
			if(sschool.equals(new String(rs2.getString("tsshool")))&&sm.equals(new String(rs2.getString("tm")))&&sp<=rs2.getInt("tp")&&sb>=rs2.getInt("tb"))
			{
				BL.add(new String(rs2.getString("tn")));
				f+=1;
			}
		}
		if(f<3)
		{
			sql2 = "select * from teacher";
			stmt2 = (Statement)connect_temp2.createStatement();
			rs2 = stmt2.executeQuery(sql2);
			while(rs2.next())
		  	{
				if(sschool.equals(new String(rs2.getString("tsshool")))&&sm.equals(new String(rs2.getString("tm")))&&rs2.getInt("tp")==0&&sb>=rs2.getInt("tb"))
				{
					BL.add(new String(rs2.getString("tn")));
					f+=1;
				}
			}
		}
		if(f<3)
		{
			sql2 = "select * from teacher";
			stmt2 = (Statement)connect_temp2.createStatement();
			rs2 = stmt2.executeQuery(sql2);
			while(rs2.next())
		  	{
				if(sschool.equals(new String(rs2.getString("tsshool")))&&"无".equals(new String(rs2.getString("tm")))&&sp<=rs2.getInt("tp")&&sb>=rs2.getInt("tb"))
				{
					BL.add(new String(rs2.getString("tn")));
					f+=1;
				}
			}
		}
		if(f<3)
		{
			sql2 = "select * from teacher";
			stmt2 = (Statement)connect_temp2.createStatement();
			rs2 = stmt2.executeQuery(sql2);
			while(rs2.next())
		  	{
				if("无".equals(new String(rs2.getString("tsshool")))&&sm.equals(new String(rs2.getString("tm")))&&sp<=rs2.getInt("tp")&&sb>=rs2.getInt("tb"))
				{
					BL.add(new String(rs2.getString("tn")));
					f+=1;
				}
			}
		}
		if(f<3)
		{
			sql2 = "select * from teacher";
			stmt2 = (Statement)connect_temp2.createStatement();
			rs2 = stmt2.executeQuery(sql2);
			while(rs2.next())
		  	{
				if(sschool.equals(new String(rs2.getString("tsshool")))&&"无".equals(new String(rs2.getString("tm")))&&rs2.getInt("tp")==0&&sb>=rs2.getInt("tb"))
				{
					BL.add(new String(rs2.getString("tn")));
					f+=1;
				}
			}
		}
		if(f<3)
		{
			sql2 = "select * from teacher";
			stmt2 = (Statement)connect_temp2.createStatement();
			rs2 = stmt2.executeQuery(sql2);
			while(rs2.next())
		  	{
				if("无".equals(new String(rs2.getString("tsshool")))&&sm.equals(new String(rs2.getString("tm")))&&rs2.getInt("tp")==0&&sb>=rs2.getInt("tb"))
				{
					BL.add(new String(rs2.getString("tn")));
					f+=1;
				}
			}
		}
		if(f<3)
		{
			sql2 = "select * from teacher";
			stmt2 = (Statement)connect_temp2.createStatement();
			rs2 = stmt2.executeQuery(sql2);
			while(rs2.next())
		  	{
				if("无".equals(new String(rs2.getString("tsshool")))&&"无".equals(new String(rs2.getString("tm")))&&sp<=rs2.getInt("tp")&&sb>=rs2.getInt("tb"))
				{
					BL.add(new String(rs2.getString("tn")));
					f+=1;
				}
			}
		}
		if(f<3)
		{
			sql2 = "select * from teacher";
			stmt2 = (Statement)connect_temp2.createStatement();
			rs2 = stmt2.executeQuery(sql2);
			while(rs2.next())
		  	{
				if("无".equals(new String(rs2.getString("tsshool")))&&"无".equals(new String(rs2.getString("tm")))&&rs2.getInt("tp")==0&&sb>=rs2.getInt("tb"))
				{
					BL.add(new String(rs2.getString("tn")));
					f+=1;
				}
			}
		}
		return "success";
	 }
}