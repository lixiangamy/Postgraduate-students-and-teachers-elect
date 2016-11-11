package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StateAction {
	public int state;
	public String tn=null;
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
    public String getTn() {
        return tn;
    }
    public void setTn(String tn) {
        this.tn=tn;
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state=state;
    }
    private ArrayList<String> DL = new ArrayList<String>();
    public ArrayList<String> getDL(){
		return DL;
	}
    private ArrayList<String> DLL = new ArrayList<String>();
    public ArrayList<String> getDLL(){
		return DLL;
	}
    Connection connect_tem3 = DB_connect.connect();
    Connection connect_tem = DB_connect.connect();
    Connection connect_tem2 = DB_connect.connect();
    public String execute() throws Exception {
    	DLL.clear();
    	DL.clear();
    		int f=0;
    		Statement stmt2;
    		if(state==1)
    		{
    			String sql2 = "update student set d=1 where e='"+ semail +"'";
	    		stmt2 = (Statement)connect_tem2.createStatement();
	    		stmt2.executeUpdate(sql2);
	    		
    		}
    		Statement stmt3;
    		String sql3 = "update ts set statet='" + state + "'where ten='" + tn +"'";
    		stmt3 = (Statement)connect_tem3.createStatement();
    		stmt3.executeUpdate(sql3);
    		Statement stmt;
    		String sql = "select * from ts where ste='" + semail + "'";
    		stmt = (Statement)connect_tem.createStatement();
    		ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				f=1;
				if(rs.getInt("statet")==0){
					sna=rs.getString("stn");
					DLL.add(new String(rs.getString("ten")));
				}
				else if(rs.getInt("statet")==1){
					sna=rs.getString("stn");
					DL.add(new String(rs.getString("ten")));
					DL.add("状态：同意");
				}
				else if(rs.getInt("statet")==2){
					
					sna=rs.getString("stn");
					DL.add(new String(rs.getString("ten")));
					DL.add("状态：不同意");
				}
				else if(rs.getInt("statet")==3){
					sna=rs.getString("stn");
					DLL.add(new String(rs.getString("ten")));
				}
			}
			if(f==1)
			{
				connect_tem.close();
				connect_tem3.close();
				return "success";
			}
			else
			{
				connect_tem.close();
				connect_tem3.close();
				return "error";
			}
    
    }
}
