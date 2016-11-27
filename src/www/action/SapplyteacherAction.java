package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SapplyteacherAction {
	private String dx;//ÐÕÃû
	private String semail;
	private String sna;
	public String getSemail() {
        return semail;
    }
    public void setSemail(String semail) {
        this.semail=semail;
    }
    public String getSna() {
        return sna;
    }
    public void setSna(String sna) {
        this.sna=sna;
    }
     public String getDx(){
  		return dx;
  	}
     public void setDx(String dx) {
         this.dx=dx;
     }
     Connection connect_n = DB_connect.connect();
     Connection connect_n5 = DB_connect.connect();
     Connection connect_n2 = DB_connect.connect();
	 public String execute() throws Exception {
		Statement stmt2;
		int z=0;
		String de=null;
		String sql2 = "select * from student where e='" + semail + "'";
		stmt2 = (Statement)connect_n2.createStatement();
		ResultSet rs2 = stmt2.executeQuery(sql2);
		while(rs2.next())
		{
			if(rs2.getInt("d")==1)
			{
				connect_n2.close();
				return "error";
			}
		}
		connect_n2.close();
		Statement stmt;
		String sql = "update ts set statet=1 where ten='"+ dx +"'and ste='"+ semail+"'";
		stmt = (Statement)connect_n.createStatement();
		z=stmt.executeUpdate(sql);
		if(z==1)
		{
			sql= "update student set d=1 where e='"+ semail +"'";
    		stmt = (Statement)connect_n.createStatement();
    		stmt.executeUpdate(sql);
    		sql= "update teacher set tx=tx+1 where tn='"+ dx +"'";
    		stmt = (Statement)connect_n.createStatement();
    		stmt.executeUpdate(sql);
    		sql= "update st set state=2 where se='"+ semail +"'";
    		stmt = (Statement)connect_n.createStatement();
    		stmt.executeUpdate(sql);
    		sql = "update ts set statet=2 where ste='"+ semail +"'";
    		stmt = (Statement)connect_n.createStatement();
    		stmt.executeUpdate(sql);
			sql = "update ts set statet=1 where ten='"+ dx +"'and ste='"+ semail+"'";
			stmt = (Statement)connect_n.createStatement();
			stmt.executeUpdate(sql);
			connect_n.close();
			return "success";
		}
		else
		{
			sql = "select * from teacher where tn='"+dx+"'";
			stmt = (Statement)connect_n.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				de=new String(rs.getString("te"));
			}
			Statement stmt5;
			String sql5 = "select * from st where tn='"+dx+"' and se='"+semail+"'";
			stmt5 = (Statement)connect_n5.createStatement();
			ResultSet rs5 = stmt5.executeQuery(sql5);
			while(rs5.next())
			{
				connect_n.close();
				return "twoerror";
			}
			connect_n5.close();
			sql = "insert into st values('"+sna+"','"+semail+"','"+dx+"','"+de+"',0)";
			stmt = (Statement)connect_n.createStatement();
			z=stmt.executeUpdate(sql);
			connect_n.close();
			return "success";
		}
	 }
}
