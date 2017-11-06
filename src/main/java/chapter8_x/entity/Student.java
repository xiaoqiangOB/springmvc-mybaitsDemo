package chapter8_x.entity;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("student")
public class Student implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5933752803055942837L;

	private Integer id;

    private String name;

    private String sex;

    private Integer cardId;

    private String remark;
    
    private StudentCard studentCard;


    public StudentCard getStudentCard() {
		return studentCard;
	}

	public void setStudentCard(StudentCard studentCard) {
		this.studentCard = studentCard;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	@Override
	public String toString() {
		return this.studentCard != null?"Student [id=" + id + ", name=" + name + ", sex=" + sex + ", cardId=" + cardId + ", remark=" + remark
				+ ", studentCard=" + studentCard.toString() + "]":"Student [id=" + id + ", name=" + name + ", sex=" + sex + ", cardId=" + cardId + ", remark=" + remark+"]";
	}
    
}