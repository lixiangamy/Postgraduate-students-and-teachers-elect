package www.action;
//��ʦ��Ϣ
public class TinforAction {
	Statement stmt;
	private String tname;//����
	private int tage;//����
	private String temail;//email
	private int tsex;//�Ա�
	private String tsh;//���֤��
	private String tjzgh;//��ְ����
	private String induction;//�о�����
	private String tc;//�о��ɹ�
	private int tsuccess;//�Ѿ��ɹ���ѧ������
	private int tx;//�Ƿ���ʾ����
	private String tschool;//ѧУ
	private String tm;//Ҫ��ѧ����רҵ
	private int tb;//�Ƿ�Ҫ��ѧ������
	private int tp;//��ѧ��������Ҫ��
	private blob tpone;
	private blob tptwo;
	private blob tpthree;
	//��Ƭ
	
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
    public String getTsh(){
		return tsh;
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
				induction = new String(res.getString("induction"));
				tc = new String(res.getString("tc"));
				tsuccess = res.getInt("tsuccess"); 
				tx = res.getInt("tx");
				tschool = new String(res.getString("tschool"));
				tm = new String(res.getString("tm"));
				tb = res.getInt("tb");
				tp = res.getInt("tp");
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
