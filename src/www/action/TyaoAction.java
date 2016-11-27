package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
//导师回应学生申请
public class TyaoAction {
	public String temail=null;
	public String tname=null;
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
    private ArrayList<String> DL = new ArrayList<String>();
    public ArrayList<String> getDL(){
		return DL;
	}
    public void setDL(ArrayList<String> DL) {
        this.DL = DL;
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
    	
    		DLL.clear();
        	DL.clear();
    		int f=0,cc;
    		Statement stmt;
    		String sql = "select * from st where te='" + temail + "'";//申请该导师的所有学生
    		stmt = (Statement)connect_tem.createStatement();
    		ResultSet rs = stmt.executeQuery(sql);
    		String sean;
			while(rs.next())
			{
				sean=new String(rs.getString("sn"));
				cc=rs.getInt("state");
				f=1;
				if(cc==0){
					DLL.add(sean);
				}
				else if(rs.getInt("state")==1){
					DL.add(new String(rs.getString("sn")));
					DL.add("状态：同意");
				}
				else if(rs.getInt("state")==2){
					DL.add(new String(rs.getString("sn")));
					DL.add("状态：不同意");
				}
				else if(cc==3){
					DLL.add(sean);
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
    }
}