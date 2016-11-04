package www.action;

public class SloginAction {
	private String snumber;
	private String semail;
    public String getSnumber() {
        return snumber;
    }
    public String getSemail() {
        return semail;
    }
    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }
    public void setSemail(String semail) {
        this.semail = semail;
    }
    public String execute() throws Exception {
    	if(semail.equals("lixiang"))
    	{
    		return "success";
    	}
    	return "success";
    }

}
