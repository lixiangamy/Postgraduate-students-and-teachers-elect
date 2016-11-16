package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TSelectAction {
	private String temail=null;
	private String tname=null;
	private String se=null;
	private String sschool=null;
	private String sm=null;
	private String sname=null;
	private int sp=0;
	private int sb=0;
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
	    public String getSschool() {
	        return sschool;
	    }
	    public void setSschool(String sschool) {
	        this.sschool=sschool;
	    }
	    public String getSm() {
	        return sm;
	    }
	    public void setSm(String sm) {
	        this.sm=sm;
	    }
	    public String getSname() {
	        return sname;
	    }
	    public void setSname(String sname) {
	        this.sname=sname;
	    }
	    public int getSp() {
	        return sp;
	    }
	    public void setSp(int sp) {
	        this.sp=sp;
	    }
	    public int getSb() {
	        return sb;
	    }
	    public void setSb(int sb) {
	        this.sb=sb;
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
			String sql = "select * from teacher where te='" + temail + "'";
			stmt = (Statement)connect_temp.createStatement();
			ResultSet rs1 = stmt.executeQuery(sql);
			while(rs1.next())
			{
				tname=new String(rs1.getString("tn"));
			}
			sql = "select * from student";
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
				if(rs.getInt("p")>sp&&sp!=0)
				{
					f=1;
	 			}
				if(sb==1&&rs.getInt("b")!=sb)
				{
					f=1;
	 			}
				if(!sschool.equals(rs.getString("school"))&&!sschool.equals(""))
				{
					f=1;
				}
				if(!sm.equals(rs.getString("m"))&&!sm.equals(""))
				{
					f=1;
				}
				if(!sname.equals(rs.getString("n"))&&!sname.equals(""))
				{
					f=1;
				}
				if(f==0)
				{
					BL.add(new String(rs.getString("n")));
				}
			}
		return "success";
    }
}

