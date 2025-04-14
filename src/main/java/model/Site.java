package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Site {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;
	private String country;
	private String city;
	private String streetName;
	private String streetNumber;
	private String postalCode;
	private String latitude;
	private String longitude;
	private Boolean isActive;

	@ManyToOne
	@JoinColumn(name = "supervisorId")
	private Employee supervisor;

	@OneToMany(mappedBy = "site")
	private List<Machine> machines;

	@OneToMany(mappedBy = "site")
	private List<Log> logs;

	@OneToMany(mappedBy = "site")
	private List<Notification> notifications;
}


