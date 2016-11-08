package www.action;
//导师信息
public class TinforAction {
	Statement stmt;
	private String tname;//姓名
	private int tage;//年龄
	private String temail;//email
	private int tsex;//性别
	private String tsh;//身份证号
	private String tjzgh;//教职工号
	
	//照片
	
    public String gettname(){
		return tname;
	}
    public int gettage(){
		return tage;
	}
    public String gettemail() {
        return temail;
    }
    public int gettsex(){
		return tsex;
	}
    public String gettsh(){
		return tsh;
	}
    public String gettjzgh(){
		return tjzgh;
	}
    public void setTname(String tname) {
        this.tname = tname;
    }
    public void setTage(int tage) {
        this.tage = tage;
    }
    public void setTemail(String temail) {
        this.temail = temail;
    }
    public void setTsex(int tsex) {
        this.tsex = tsex;
    }
    public void setTsh(String tsh) {
        this.tsh = tsh;
    }
    public void setTjzgh(String tjzgh) {
        this.tjzgh = tjzgh;
    }
    
    public String execute() throws Exception {
    	Connection ct = DB_connect.connect();
    	try
    	{ 
    		String sql = "select * from teacher";
			stmt = (Statement)connect.createStatement();
			ResultSet res = stmt.executeQuery(sql);
			String sql1 = "select * from teacher where te = '" + temail + "'";
			res = stmt.executeQuery(sql1);
			if(!res.next())
			{
				return "error";
			}
			else
			{
				tname = new String(res.getString("tn"));
				tage = res.getInt("ta");
				temail = new String(res.getString("te"));
				tsex = res.getInt("ts");
				tsh = new String(res.getString("tsh"));
				tjzgh = new String(res.getString("jzgh"));
				connect.close();
				return "success";
			}
			
		}
    	catch(Exception e)
    	{
			return "error";
		}
    }
}
