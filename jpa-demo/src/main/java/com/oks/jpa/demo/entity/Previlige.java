package com.oks.jpa.demo.entity;

import java.util.Set;

import jakarta.persistence.Entity;
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
	
	@ManyToMany(mappedBy = "previliges")
	Set<Emp> employees;

}
