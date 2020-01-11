package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
//@Table(name="m_user", indexes = {@Index(columnList="email"), unique=true})
@Table(name="m_user", indexes={@Index(columnList="email",unique=true)})
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userid;
	public long getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String name;
	private int age;
	private String password;
}
