package in.spring._Recuitment.entiry;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // Primary key for the user

	@Column(nullable = false)
	private String name; // User's name

	@Column(nullable = false, unique = true)
	private String email; // User's email

	@Column(nullable = false)
	private String role;

	@ManyToOne
	@JoinColumn(name = "department_id") 
	private department department;

	public users(Long id, String name, String email, String role, in.spring._Recuitment.entiry.department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
		this.department = department;
	}

	public users() {
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getRole() {
		return role;
	}

	public department getDepartment() {
		return department;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setDepartment(department department) {
		this.department = department;
	} 

	
}
