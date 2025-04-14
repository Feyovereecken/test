package model;

import enums.MachineStatus;
import enums.ProductionStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Machine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String code;
	private String location;

	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "siteId")
	private Site site;

	@ManyToOne
	@JoinColumn(name = "technicianId")
	private Employee technician;

	private MachineStatus status;
	private ProductionStatus productionStatus;

	@OneToMany(mappedBy = "machine")
	private List<Maintenance> maintenances;

	@OneToMany(mappedBy = "machine")
	private List<Log> logs;

	@OneToMany(mappedBy = "machine")
	private List<MachineStatusLog> machineStatusLogs;

	@OneToMany(mappedBy = "machine")
	private List<MachineDailyReport> machineDailyReports;

	@OneToMany(mappedBy = "machine")
	private List<Notification> notifications;
}
