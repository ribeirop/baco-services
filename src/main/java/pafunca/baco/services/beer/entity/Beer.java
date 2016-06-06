package pafunca.baco.services.beer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Beer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String brand;
	
	@Column
	private String name;
	
	@Column
	private String type;
	
	@Column
	private Double alcoholContent;
	
	public Beer() {
		super();
	}

	public Beer(Long id, String brand, String name, String type, Double alcoholContent) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.type = type;
		this.alcoholContent = alcoholContent;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getAlcoholContent() {
		return alcoholContent;
	}

	public void setAlcoholContent(Double alcoholContent) {
		this.alcoholContent = alcoholContent;
	}
	
	
}
