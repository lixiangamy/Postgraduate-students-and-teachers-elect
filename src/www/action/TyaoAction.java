package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
//导师回应学生申请
public class TyaoAction {
	public String temail=null;
	public String tna=null;
    public String getTemail() {
        return temail;
    }
    public void setTemail(String temail) {
        this.temail=temail;
    }
    public String getTna() {
        return tna;
    }
    public void setTna(String tna) {
        this.tna=tna;
    }
    private ArrayList<String> DL = new ArrayList<String>();
    public ArrayList<String> getDL(){
		return DL;
	}
    public void setDL(ArrayList<String> DL) {
        this.DL = DL;
    }
    private ArrayList<String> DIL = new ArrayList<String>();
    public ArrayList<String> getDIL(){
		return DIL;
	}
    public void setDIL(ArrayList<String> DIL) {
        this.DIL = DIL;
    }
    private ArrayList<String> DLL = new ArrayList<String>();
    public ArrayList<String> getDLL(){
		return DLL;
	}
    public void setDLL(ArrayList<String> DLL) {
        this.DLL = DLL;
    }
   
    Connection connect_tem = DB_connect.connect();
    public String execute() throws Exception {
    	try {
    		int f=0;
    		Statement stmt;
    		String sql = "select * from st where te='" + temail + "'";//申请该导师的所有学生
    		stmt = (Statement)connect_tem.createStatement();
    		ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				f=1;
				if(rs.getInt("statet")==0){
					tna=rs.getString("tn");
					DLL.add(new String(rs.getString("sn")));
				}
				else if(rs.getInt("statet")==1){
					DIL.add("状态：同意");
					tna=rs.getString("tn");
					DL.add(new String(rs.getString("sn")));
				}
				else if(rs.getInt("statet")==2){
					DIL.add("状态：不同意");
					tna=rs.getString("tn");
					DL.add(new String(rs.getString("sn")));
				}
				else if(rs.getInt("statet")==3){
					DIL.add("状态：待定");
					tna=rs.getString("tn");
					DL.add(new String(rs.getString("sn")));
				}
			}
			if(f==1)
			{
				connect_tem.close();
				return "success";
			}
			else
			{
				connect_tem.close();
				return "error";
			}
    	} catch (Exception e) {
    		connect_tem.close();
			return "error";
  	    }
    }
}