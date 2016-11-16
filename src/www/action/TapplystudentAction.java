package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TapplystudentAction {
	private String sx;//姓名
	private String temail;
	private String tname;
	public void setTemail(String temail) {
        this.temail = temail;
    }
    public void setTname(String tname) {
        this.tname = tname;
    }
    public String getTemail() {
        return temail;
    }
    public String getTname() {
        return tname;
    }
     public String getSx(){
  		return sx;
  	}
     public void setSx(String sx) {
         this.sx=sx;
     }
     Connection connect_k = DB_connect.connect();
     Connection connect_k5 = DB_connect.connect();
     Connection connect_k2 = DB_connect.connect();
	 public String execute() throws Exception {
		Statement stmt2;
		int z=0;
		String set=null;
		String sql2 = "select * from student where n='" + sx + "'";
		stmt2 = (Statement)connect_k2.createStatement();
		ResultSet rs2 = stmt2.executeQuery(sql2);
		while(rs2.next())
		{
			if(rs2.getInt("d")==1)
			{
				connect_k2.close();
				return "error";
			}
		}//学生有导师
		connect_k2.close();
		Statement stmt;
		String sql = "update st set state=1 where sn='"+ sx +"'and te='"+ temail+"'";
		stmt = (Statement)connect_k.createStatement();
		z=stmt.executeUpdate(sql);
		if(z==1)
		{
			sql= "update student set d=1 where n='"+ sx +"'";
    		stmt = (Statement)connect_k.createStatement();
    		stmt.executeUpdate(sql);
    		sql= "update teacher set tx=tx+1 where tn='"+ tname +"'";
    		stmt = (Statement)connect_k.createStatement();
    		stmt.executeUpdate(sql);
    		sql= "update st set state=2 where sn='"+ sx +"'";
    		stmt = (Statement)connect_k.createStatement();
    		stmt.executeUpdate(sql);
    		sql = "update ts set statet=2 where stn='"+ sx +"'";
    		stmt = (Statement)connect_k.createStatement();
    		stmt.executeUpdate(sql);
			sql = "update st set state=1 where sn='"+ sx +"'and te='"+ temail+"'";
			stmt = (Statement)connect_k.createStatement();
			stmt.executeUpdate(sql);
			connect_k.close();
			return "success";
		}
		else
		{
			sql = "select * from student where n='"+sx+"'";
			stmt = (Statement)connect_k.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				set=new String(rs.getString("e"));
			}
			Statement stmt5;
			String sql5 = "select * from ts where stn='"+sx+"' and tee='"+temail+"'";
			stmt5 = (Statement)connect_k5.createStatement();
			ResultSet rs5 = stmt5.executeQuery(sql5);
			while(rs5.next())
			{
				connect_k.close();
				return "twoerror";
			}
			connect_k5.close();
			sql = "insert into ts values('"+tname+"','"+temail+"','"+sx+"','"+set+"',0)";
			stmt = (Statement)connect_k.createStatement();
			z=stmt.executeUpdate(sql);
			connect_k.close();
			return "success";
		}
	 }
}
