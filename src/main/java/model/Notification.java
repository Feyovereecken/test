package model;

import enums.NotificationStatus;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Notification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private LocalDateTime createdAt;

	private String title;
	private String message;

	private NotificationStatus status;

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
