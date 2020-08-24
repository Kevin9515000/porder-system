package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="member")
public class member {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String username;
	private String password;
	private String Phone;
	private String Address;
	private Boolean admin;
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
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	public void add(String name,String username,String password,String Phone,String Address,Boolean admin) {
		setName(name);
		setUsername(username);
		setPassword(password);
		setPhone(Phone);
		setAddress(Address);
		setAdmin(admin);
	}
}
