package com.oks.jpa.demo.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="PREVILIGES")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Previlige {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "PREVILIGE_SEQ" )
	@SequenceGenerator(name = "PREVILIGE_SEQ",initialValue = 1,allocationSize = 1,sequenceName = "PREVILIGE_SEQ")
	private Long id;
	private String name;
	private float cost;
	
	public Previlige(String name, float cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

	/*
	 * public Previlige(String name, float cost, Set<Emp> employees) { super();
	 * this.name = name; this.cost = cost; this.employees = employees; }
	 */

	

	@ManyToMany(mappedBy = "previliges",fetch = FetchType.LAZY)
	Set<Emp> employees;

}
