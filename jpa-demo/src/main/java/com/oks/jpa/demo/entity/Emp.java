package com.oks.jpa.demo.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="EMP")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Emp {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "EMP_SEQ" )
	@SequenceGenerator(name = "EMP_SEQ",initialValue = 1,allocationSize = 1,sequenceName = "EMP_SEQ")
	private Long id;
	private String name;
	private String job;
	private float salary;
	
	public Emp(String name, String job, float salary, Set<Previlige> previliges) {
		super();
		this.name = name;
		this.job = job;
		this.salary = salary;
		this.previliges = previliges;
	}

	@ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)	
	@JoinTable(name="EMP_PREVILEGE",
			   joinColumns = {@JoinColumn(name="EMP_ID")},
			   inverseJoinColumns = {@JoinColumn(name="PREVILIGE_ID")})
	Set<Previlige> previliges;
	

}
