package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StuiAction {
	public String execute() throws Exception {
		return "success";
    }
}




public class SelectAction {
		public String semail=null;
		public String sna=null;
		public String te=null;
		public String tindu=null;
		public String tname=null;
		public int tage;
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
	    public String getTe() {
	        return te;
	    }
	    public void setTe(String te) {
	        this.te=te;
	    }
	    public String getTname() {
	        return tname;
	    }
	    public void setTname(String tname) {
	        this.tname=tname;
	    }
	    public String getTindu() {
	        return tindu;
	    }
	    public void setTindu(String tindu) {
	        this.tindu=tindu;
	    }
	    public int getTage() {
	        return tage;
	    }
	    public void setTage(int tage) {
	        this.tage=tage;
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
			System.out.print(tage);
			System.out.print("***");
			System.out.print(tindu);
			System.out.print("***");
			String sql = "select * from teacher";
			stmt = (Statement)connect_temp.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				f=0;
				te=rs.getString("te");
				String sql2 = "select * from st where se='" + semail + "'";
				stmt2 = (Statement)connect_temp2.createStatement();
				ResultSet rs2 = stmt2.executeQuery(sql2);
				while(rs2.next())
				{
					sna=rs2.getString("sn");
					if(te.equals(new String(rs2.getString("te"))))
					{
						f=1;
					}
					if(rs.getInt("ta")<tage)
					{
						f=1;
					}
					if(!tindu.equals(rs.getString("induction"))&&!tindu.equals(""))
					{
						f=1;
					}
					if(!tname.equals(rs.getString("tn"))&&!tname.equals(""))
					{
						f=1;
					}
				}
				if(f==0)
				{
					BL.add(new String(rs.getString("tn")));
				}
			}
		return "success";
    }
}
