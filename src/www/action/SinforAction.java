package www.action;

import java.sql.ResultSet;
import java.sql.Statement;

//ѧ����Ϣ
public class SinforAction {
	Statement stmt;
	private String sname;//����
	private int sage;//����
	private String semail;//email
	private int ssex;//�Ա�
	private String ssh;//���֤��
	private String sxuehao;//ѧ��
	private String sschool;//����ԺУ
	private String sm;//����רҵ
	private int sp;//����
	private String sc;//�ɹ�
	private int sb;//�Ƿ����
	private String snumber;//����
	private int sd;//�Ƿ��е�ʦ
	//��Ƭ
	
	public String semail=null;
    public String getSname(){
		return sname;
	}
    public int getSage(){
		return sage;
	}
    public String getSemail() {
        return semail;
    }
    public int getSsex(){
		return ssex;
	}
    public String getSsh(){
		return ssh;
	}
    public String getSxuehao(){
		return sxuehao;
	}
    public String getSschool(){
		return sschool;
	}
    public String getSm(){
		return sm;
	}
    public int getSp(){
		return sp;
	}
    public String getSc(){
		return sc;
	}
    public int getSb(){
		return sb;
	}
    public String getSnumber(){
		return snumber;
	}
    public int getSd(){
		return sd;
	}
    public void setSname(String sname) {
        this.sname = sname;
    }
    public void setSage(int sage) {
        this.sage = sage;
    }
    public void setSemail(String semail) {
        this.semail = semail;
    }
    public void setSsex(int ssex) {
        this.ssex = ssex;
    }
    public void setSsh(String ssh) {
        this.ssh = ssh;
    }
    public void setSxuehao(String sxuehao) {
        this.sxuehao = sxuehao;
    }
    public void setSschool(String sschool) {
        this.sschool = sschool;
    }
    public void setSm(String sm) {
        this.sm = sm;
    }
    public void setSp(int sp) {
        this.sp = sp;
    }
    public void setSc(String sc) {
        this.sc = sc;
    }
    public void setSb(int sb) {
        this.sb = sb;
    }
    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }
    public void setSd(int sd) {
        this.sd = sd;
    }
    
    public String execute() throws Exception {
    	Connection ct = DB_connect.connect();
    	try
    	{ 
    		String sql = "select * from student";
			stmt = (Statement)connect.createStatement();
			ResultSet res = stmt.executeQuery(sql);
			String sql1 = "select * from student where e = '" + semail + "'";
			res = stmt.executeQuery(sql1);
			if(!res.next())
			{
				return "error";
			}
			else
			{
				sname = new String(res.getString("n"));
				sage = res.getInt("a");
				semail = new String(res.getString("e"));
				ssex = res.getInt("s");
				ssh = new String(res.getString("sh"));
				sxuehao = new String(res.getString("xuehao"));
				sschool = new String(res.getString("school"));
				sm = new String(res.getString("m"));
				sp = res.getInt("p");
				sc = new String(res.getString("c"));
				sb = res.getInt("b");
				snumber = new String(res.getString("number"));
				sd = res.getInt("d");
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
