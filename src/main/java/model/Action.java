package model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Action {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	@OneToMany(mappedBy = "action")
	private List<Log> logs;
}
