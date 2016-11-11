package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TyiAction {
	public String temail=null;
    public String getTemail() {
        return temail;
    }
    private ArrayList<String> TL = new ArrayList<String>();
    public ArrayList<String> getTL(){
		return TL;
	}
    Connection connect_t = DB_connect.connect();
    public String execute() throws Exception {
    	Statement stmt;
    	String sql = "select * from ts where te='" + temail + "'";
		stmt = (Statement)connect_t.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()){
			while(rs.next())
			{
				TL.add(new String(rs.getString("sn")));
				if(rs.getInt("statet")==0){
					TL.add("学生未选择");
				}
				else if(rs.getInt("statet")==1){
					TL.add("同意");
				}
				else if(rs.getInt("statet")==2){
					TL.add("不同意");
				}
				else if(rs.getInt("statet")==3){
					TL.add("待定");
				}
			}
			connect_t.close();
			return "success";
		}	
		else{ 
			connect_t.close();
			return "error";
		}
    }
}
