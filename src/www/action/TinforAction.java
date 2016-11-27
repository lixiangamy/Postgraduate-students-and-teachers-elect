package www.action;
//导师信息
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TinforAction {
	Statement stmt;
	private String tname;//姓名
	private int ta;//年龄
	private String temail;//email
	private int ts;//性别
  	private String jzgh;//教职工号	
 	private String induction;//研究方向
 	private String tc;//研究成果
 	private int tsuccess;//已经成功的学生个数
 	private int tx;//是否显示邮箱
 	private String tschool;//学校
 	private String tm;//要求学生的专业
 	private int tb;//是否要求学生读博
 	private int tp;//对学生排名的要求
 	private String tsshool;//对学生学校的要求
 	private String tnumber;//密码
	private String tpone;//三个证明
	private String tptwo;
	private String tpthree;
	private String tpfour;//生活照
	private String path="/space/uppicture/";//路径
	private String tponepath=null;//三个证明
	private String tptwopath=null;
	private String tpthreepath=null;
	private String tpfourpath=null;//生活照
  	
     public String getTname(){
  		return tname;
  	}
     public int getTa(){
  		return ta;
  	}
     public String getTemail() {
          return temail;
      }
     public int getTs(){
  		return ts;
  	}
     public String getJzgh(){
  		return jzgh;
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
     public String getTsshool(){
  		return tsshool;
  	}
     public String getTnumber(){
    		return tnumber;
    	}
     public String getTpone(){
 		return tpone;
 	}
     public String getTptwo(){
 		return tptwo;
 	}
     public String getTpthree(){
 		return tpthree;
 	}
     public String getTpfour(){
 		return tpfour;
 	}
     public String getTponepath(){
 		return tponepath;
 	}
     public String getTptwopath(){
 		return tptwopath;
 	}
     public String getTpthreepath(){
 		return tpthreepath;
 	}
     public String getTpfourpath(){
 		return tpfourpath;
 	}
      public void setTname(String tname) {
          this.tname = tname;
      }
      public void setTa(int ta) {
          this.ta = ta;
      }
      public void setTemail(String temail) {
          this.temail = temail;
      }
      public void setTs(int ts) {
          this.ts = ts;
      }
       public void setJzgh(String jzgh) {
           this.jzgh = jzgh;
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
     public void setTsshool(String tsshool) {
         this.tsshool = tsshool;
     }
     public void setTnumber(String tnumber) {
         this.tnumber = tnumber;
     }
     public void setTpone(String tpone) {
         this.tpone = tpone;
     }
     public void setTptwo(String tptwo) {
         this.tptwo = tptwo;
     }
     public void setTpthree(String tpthree) {
         this.tpthree = tpthree;
     }
     public void setTprove(String tpfour) {
         this.tpfour = tpfour;
     }
      public String execute() throws Exception {
      	Connection connect = DB_connect.connect();
    	try
    	{ 
    		String sql = "select * from teacher";
    		stmt = (Statement)connect.createStatement();
    		ResultSet res = stmt.executeQuery(sql);
    		String sql1 = "select * from teacher where te = '" + temail + "'";
    		res = stmt.executeQuery(sql1);
    		while(res.next())
    		{
    			tname = new String(res.getString("tn"));
    			ta = res.getInt("ta");
    			temail = new String(res.getString("te"));
    			ts = res.getInt("ts");
  				jzgh = new String(res.getString("jzgh"));
 				induction = new String(res.getString("induction"));
 				tc = new String(res.getString("tc"));
 				tsuccess = res.getInt("tsuccess"); 
 				tx = res.getInt("tx");
 				tschool = new String(res.getString("tschool"));
 				tm = new String(res.getString("tm"));
 				tb = res.getInt("tb");
 				tp = res.getInt("tp");
 				tsshool = new String(res.getString("tsshool"));
  				tnumber = new String(res.getString("tnumber"));
 				tpone = new String(res.getString("tpone"));
				if(tpone.equals("无"))
				{
					tponepath = path+"无.png";
				}
				else
				{
					tponepath = path+tpone;
				}
				tptwo = new String(res.getString("tptwo"));
				if(tptwo.equals("无"))
				{
					tptwopath = path+"无.png";
				}
				else
				{
					tptwopath = path+tptwo;
				}
				tpthree = new String(res.getString("tpthree"));
				if(tpthree.equals("无"))
				{
					tpthreepath = path+"无.png";
				}
				else
				{
					tpthreepath = path+tpthree;
				}
				tpfour = new String(res.getString("tpfour"));
				if(tpfour.equals("无"))
				{
					tpfourpath = path+"6.png";
				}
				else
				{
					tpfourpath = path+tpfour;
				}
  				
  			}
    		connect.close();
    		return "success";
    	}
    	catch(Exception e)
    	{
    		return "error";
    	}
    }
}