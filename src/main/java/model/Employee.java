package model;

import enums.Role;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String firstName;
	private String lastName;
	private LocalDateTime dateOfBirth;
	private String country;
	private String city;
	private String postalCode;
	private String streetName;
	private String streetNumber;
	private String email;
	private String phoneNumber;
	private Role role;
	private String passwordHash;
	private Boolean isActive;

	@OneToMany(mappedBy = "supervisor")
	private List<Site> sites;

	@OneToMany(mappedBy = "technician")
	private List<Machine> machines;

	@OneToMany(mappedBy = "technician")
	private List<Maintenance> maintenances;

	@OneToMany(mappedBy = "employee")
	private List<Log> logs;

	@OneToMany(mappedBy = "employee")
	private List<Notification> notifications;
}
