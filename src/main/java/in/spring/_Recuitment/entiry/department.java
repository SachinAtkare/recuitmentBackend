package in.spring._Recuitment.entiry;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 

	@Column(nullable = false, unique = true)
	private String name; 

	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<users> users;

	public department(Long id, String name, List<in.spring._Recuitment.entiry.users> users) {
		this.id = id;
		this.name = name;
		this.users = users;
	}

	public department() {
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<users> getUsers() {
		return users;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUsers(List<users> users) {
		this.users = users;
	} 
	
	
}
