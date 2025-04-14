package model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Log {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private LocalDateTime date;

	@ManyToOne
	@JoinColumn(name = "actionId")
	private Action action;

	private String details;

	@ManyToOne
	@JoinColumn(name = "employeeId")
	private Employee employee;

	@ManyToOne
	@JoinColumn(name = "machineId")
	private Machine machine;

	@ManyToOne
	@JoinColumn(name = "siteId")
	private Site site;

	@ManyToOne
	@JoinColumn(name = "maintenanceId")
	private Maintenance maintenance;
}
