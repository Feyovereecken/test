package model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class MachineDailyReport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private LocalDateTime date;

	@ManyToOne
	@JoinColumn(name = "machineId")
	private Machine machine;

	private Integer amountProduced;
	private Integer uptime;
	private Integer downtime;
	private Integer scrap;
}
