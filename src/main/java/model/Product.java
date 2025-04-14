package model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String info;

	@OneToMany(mappedBy = "product")
	private List<Machine> machines;
}
