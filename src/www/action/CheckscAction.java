package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
//sx�����ʦ���֣���ʾ��ʦ��Ϣ
public class CheckscAction {
	Statement stmt;
	private String temail;
	private String tna;
	
	private String sx;//����
	private int sage;//����
	private String semail;//email
	private int ssex;//�Ա�
	private String sxuehao;//ѧ��
	private String sschool;//����ԺУ
	private String sm;//����רҵ
	private int sp;//����
	private String sc;//�ɹ�
	private int sb;//�Ƿ����
	private String snumber;//����
	private int sd;//�Ƿ��е�ʦ
	//��Ƭ
	
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
    public String getSx(){
		return sx;
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
    public void setSx(String sx) {
        this.sx = sx;
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
			stmt = (Statement)ct.createStatement();
			ResultSet res = stmt.executeQuery(sql);
			String sql1 = "select * from student where n = '" + sx + "'";
			res = stmt.executeQuery(sql1);
			if(!res.next())
			{
				return "error";
			}
			else
			{
				sx = new String(res.getString("n"));
				sage = res.getInt("a");
				semail = new String(res.getString("e"));
				ssex = res.getInt("s");
				sxuehao = new String(res.getString("xuehao"));
				sschool = new String(res.getString("school"));
				sm = new String(res.getString("m"));
				sp = res.getInt("p");
				sc = new String(res.getString("c"));
				sb = res.getInt("b");
				snumber = new String(res.getString("number"));//���ǲ���ʾ����
				sd = res.getInt("d");
				ct.close();
				return "success";
			}
			
		}
    	catch(Exception e)
    	{
			return "error";
		}
    }
	
}
