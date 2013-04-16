package symtkn.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {

	private Long id;
	private String name;
	private String password;
	private String gender;
	private String country;
	private String aboutYou;
	private String[] university;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="USER_NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="USER_PASSWORD")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="USER_GENDER")
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Column(name="USER_COUNTRY")
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Column(name="USER_ABOUT_YOU")
	public String getAboutYou() {
		return aboutYou;
	}
	public void setAboutYou(String aboutYou) {
		this.aboutYou = aboutYou;
	}
	
	@Column(name="USER_UNIVERSITY")
	public String[] getUniversity() {
		return university;
	}
	public void setUniversity(String[] university) {
		this.university = university;
	}
	
	

}
