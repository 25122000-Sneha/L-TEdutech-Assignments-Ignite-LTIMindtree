package Phase2.Week_5.MapActivity.Q3;

import java.util.Date;

public class CallLog {
    private String phoneNo;
    private Date startTime, endTime;
    
    public CallLog(String phoneNo, Date startTime, Date endTime) {
        
        this.phoneNo = phoneNo;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
}
