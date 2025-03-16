package pe.com.softlite.authentication.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "tbl_persons")
@EntityListeners(AuditingEntityListener.class)
public class Person {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
	private String name;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "date_registry")
	@CreatedDate
	private Date date;
	
	private Integer score;
	
	@Column(name = "date_actual")
	@CreatedDate
	private Date date_act;
	
	private Integer amount;
	
	public Person() {

	}
//
//	public Person(Long id, String name, String userName, Date date) {
//		Long id_;
//		id_ = id;
//		this.name = name;
//		this.userName = userName;
//		this.date = date;
//	}
	
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Date getDate_act() {
		return date_act;
	}

	public void setDate_act(Date date_act) {
		this.date_act = date_act;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", name=" + name + ", userName=" + userName + ", date=" + date + "]";
//	}

}
