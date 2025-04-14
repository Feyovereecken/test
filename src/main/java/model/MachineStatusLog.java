package model;

import enums.MachineStatus;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class MachineStatusLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "machineId")
	private Machine machine;

	private MachineStatus status;

	private LocalDateTime timestamp;
}
