package www.action;
//导师信息

public class TinforAction {
	Statement stmt;
	private String tname;//姓名
	private int tage;//年龄
	private String temail;//email
	private int tsex;//性别
  	private String tjzgh;//教职工号	
 	private String induction;//研究方向
 	private String tc;//研究成果
 	private int tsuccess;//已经成功的学生个数
 	private int tx;//是否显示邮箱
 	private String tschool;//学校
 	private String tm;//要求学生的专业
 	private int tb;//是否要求学生读博
 	private int tp;//对学生排名的要求
 	private String tsschool;//对学生学校的要求
 	private blob tpone;
 	private blob tptwo;
 	private blob tpthree;
  	//照片
  	
     public String getTname(){
  		return tname;
  	}
     public int getTage(){
  		return tage;
  	}
     public String getTemail() {
          return temail;
      }
     public int getTsex(){
  		return tsex;
  	}
     public String getTjzgh(){
  		return tjzgh;
  	}
     public String getInduction(){
 		return induction;
 	}
     public String getTc(){
 		return tc;
 	}
     public int getTsuccess(){
 		return tsuccess;
 	}
     public int getTx(){
 		return tx;
 	}
     public String getTschool(){
 		return tschool;
 	}
     public String getTm(){
 		return tm;
 	}
     public int getTb(){
 		return tb;
 	}
     public int getTp(){
 		return tp;
 	}
     public String getTsschool(){
  		return tsschool;
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
       public void setTjzgh(String tjzgh) {
           this.tjzgh = tjzgh;
       }
     public void setInduction(String induction) {
         this.induction = induction;
     }
     public void setTc(String tc) {
         this.tc = tc;
     }
     public void setTsuccess(int tsuccess) {
         this.tsuccess = tsuccess;
     }
     public void setTx(int tx) {
         this.tx = tx;
     }
     public void setTschool(String tschool) {
         this.tschool = tschool;
     }
     public void setTm(String tm) {
         this.tm = tm;
     }
     public void setTb(int tb) {
         this.tb = tb;
     }
     public void setTp(int tp) {
         this.tp = tp;
     }
     public void setTsschool(String tsschool) {
         this.tm = tsschool;
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
  				tjzgh = new String(res.getString("jzgh"));
 				induction = new String(res.getString("induction"));
 				tc = new String(res.getString("tc"));
 				tsuccess = res.getInt("tsuccess"); 
 				tx = res.getInt("tx");
 				tschool = new String(res.getString("tschool"));
 				tm = new String(res.getString("tm"));
 				tb = res.getInt("tb");
 				tp = res.getInt("tp");
 				tsschool = new String(res.getString("tsschool"));
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