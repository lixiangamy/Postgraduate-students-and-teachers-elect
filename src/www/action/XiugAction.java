package www.action;

public class XiugAction {
	private String sname;//����
	private int sage;//����
	private String semail;//email
	private int ssex;//�Ա�
	private String ssh;//����֤��
	private String sxuehao;//ѧ��
	private String sschool;//����ԺУ
	private String sm;//����רҵ
	private String sp;//����
	private String sc;//�ɹ�
	private int sb;//�Ƿ����
	private String snumber;//����
	private int sd;//�Ƿ��е�ʦ
	//��Ƭ
	
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
    public String getSp(){
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
    public void setSp(String sp) {
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
    	System.out.print(sd+"***");
    	return "success";
    }
}