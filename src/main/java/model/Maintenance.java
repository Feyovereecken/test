package model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

import enums.MaintenanceStatus;

@Entity
public class Maintenance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private LocalDateTime datePlanned;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private String reason;
	private String maintenanceReport;
	private String comments;

	private MaintenanceStatus status;

	@ManyToOne
	@JoinColumn(name = "machineId")
	private Machine machine;

	@ManyToOne
	@JoinColumn(name = "technicianId")
	private Employee technician;

	@OneToMany(mappedBy = "maintenance")
	private List<Log> logs;

	@OneToMany(mappedBy = "maintenance")
	private List<Notification> notifications;
}
