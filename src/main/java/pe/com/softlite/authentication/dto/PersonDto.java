package pe.com.softlite.authentication.dto;

import java.util.Date;

public class PersonDto {
	
	private String name;
	private String userName;
	private Date date;
	private Date date_act;
	private Integer amount;
	private Integer score;
	
	public PersonDto() {
		super();
	}

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

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	
}
