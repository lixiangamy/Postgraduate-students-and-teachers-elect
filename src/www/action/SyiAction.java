package www.action;
<<<<<<< HEAD
//已申请导师
public class SyiAction {
=======

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
>>>>>>> f351124893b3a8b586c3597a5b88dadca092db29

public class SyiAction {
	public String semail=null;
	public String sna=null;
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
    private ArrayList<String> BL = new ArrayList<String>();
    public ArrayList<String> getBL(){
		return BL;
	}
    public void setBT(ArrayList<String> BL) {
        this.BL = BL;
    }
    private ArrayList<String> IL = new ArrayList<String>();
    public ArrayList<String> getIL(){
		return IL;
	}
    public void setIT(ArrayList<String> IL) {
        this.IL = IL;
    }
    Connection connect_temp = DB_connect.connect();
    public String execute() throws Exception {
    	try {
    		int f=0;
    		Statement stmt;
    		String sql = "select * from st where se='" + semail + "'";
    		stmt = (Statement)connect_temp.createStatement();
    		ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				f=1;
				BL.add(new String(rs.getString("tn")));
				sna=rs.getString("sn");
				if(rs.getInt("state")==0){
					IL.add("导师未选择");
				}
				else if(rs.getInt("state")==1){
					IL.add("状态：同意");
				}
				else if(rs.getInt("state")==2){
					IL.add("状态：不同意");
				}
				else if(rs.getInt("state")==3){
					IL.add("状态：待定");
				}
			}
			if(f==0)
			{
				connect_temp.close();
				return "error";
			}
			else
			{
				connect_temp.close();
				return "success";
			}
    	} catch (Exception e) {
    		connect_temp.close();
			return "error";
  	    }
    }
}
