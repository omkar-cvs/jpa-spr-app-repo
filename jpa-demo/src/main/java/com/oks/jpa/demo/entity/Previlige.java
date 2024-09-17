package com.oks.jpa.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
//@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class ,property = "id")//it is not working
public class Previlige {
	 private static final long serialVersionUID = 1L;
	
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
	//@JsonBackReference
	@JsonIgnore	
	List<Emp> employees;

}
