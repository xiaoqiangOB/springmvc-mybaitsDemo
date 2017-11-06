package chapter8_x.entity;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;
@Alias("studentCard")
public class StudentCard implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6947837945345857885L;

	private Integer cardId;

    private Integer studentNo;

    private String address;

    private Date startTime;

    private Date endTime;

    private String remark;

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Integer studentNo) {
        this.studentNo = studentNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	@Override
	public String toString() {
		return "StudentCard [cardId=" + cardId + ", studentNo=" + studentNo + ", address=" + address + ", startTime="
				+ startTime + ", endTime=" + endTime + ", remark=" + remark + "]";
	}
}